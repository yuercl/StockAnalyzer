package com.yuer.stockanalyzer;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import com.yuer.stockanalyzer.util.Constants;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Request;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.yuer.stockanalyzer.model.Detail;
import com.yuer.stockanalyzer.model.Stock;
import com.yuer.stockanalyzer.service.DetailService;
import com.yuer.stockanalyzer.service.StockService;

public class Application {
    private static Logger logger = LoggerFactory.getLogger(Application.class);

    public static ApplicationContext context;// Spring的上下文，里面保存有初始化的bean,Service也在里面

    public static DetailService detailService;
    public static StockService stockService;

    public static String URL = "http://xueqiu.com/stock/forchartk/stocklist.json?period=1day&symbol=#{detail}&type=normal&_=" + System.currentTimeMillis();

    public static void main(String[] args) {
        context = new ClassPathXmlApplicationContext("/config/applicationContext.xml");

        detailService = (DetailService) context.getBean("DetailService");
        stockService = (StockService) context.getBean("StockService");

        String page = "http://xueqiu.com/stock/cata/stocklist.json?size=50&order=desc&orderby=percent&exchange=CN&_=" + System.currentTimeMillis()
                + "&page=#{page}";

        try {
            String ret = "";
            Request.Get("http://www.xueqiu.com")
                    .addHeader("User-Agent", Constants.HTTP_HEADER)
                    .connectTimeout(1000).socketTimeout(1000).execute();
            // for get cookie

            Integer pageNo = 4;
            while (true) {
                String pageUrl = page.replace("#{page}", pageNo.toString());
                logger.info(pageUrl);

                ret = Request.Get(pageUrl)
                        .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/37.0.2062.103 Safari/537.36")
                        .connectTimeout(1000).socketTimeout(1000).execute().returnContent().asString();

                JSONObject object = JSON.parseObject(ret);

                JSONArray array = object.getJSONArray("stocks");
                if (array.isEmpty()) {
                    break;
                } else {
                    List<Stock> stockList = JSON.parseArray(object.get("stocks").toString(), Stock.class);
                    for (Stock stock : stockList) {
                        logger.info(JSON.toJSONString(stock));
                        Stock tempStock = stockService.getBySymbol(stock.getSymbol());
                        if (tempStock != null) {
                            logger.debug("[Stock Exist][symbol:" + stock.getSymbol() + "]");
                            stock.setId(tempStock.getId());
                        } else {
                            stockService.insert(stock);
                        }
                        saveDetail(stock);
                    }
                    pageNo++;
                }

            }

        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveDetail(Stock stock) {
        String stockUrl = URL.replace("#{detail}", stock.getSymbol());
        String ret = "";
        try {
            ret = Request.Get(stockUrl)
                    .addHeader("User-Agent", Constants.HTTP_HEADER)
                    .connectTimeout(1000).socketTimeout(1000).execute().returnContent().asString();

            logger.info("[save]" + stockUrl);
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        JSONObject object = JSON.parseObject(ret);
        JSONArray array = object.getJSONArray("chartlist");

        Integer count = detailService.countByStock(stock.getId());
        if (count == array.size()) {
            logger.debug("[none detail need to save]");
            return;
        }

        for (int i = 0; i < array.size(); i++) {
            JSONObject tmp = JSONObject.parseObject(array.getString(i));

            Date myDate = null;
            try {
                myDate = (new SimpleDateFormat("EEE MMM d HH:mm:ss Z yyyy", Locale.ENGLISH)).parse(tmp.getString("time"));
            } catch (Exception e) {
                logger.error("[Parse error][" + tmp.toJSONString() + "]", e);
            }
            tmp.put("time", myDate);

            Detail detail = JSON.parseObject(tmp.toJSONString(), Detail.class);
            detail.setStockId(stock.getId());

            Detail tempDetail = detailService.getByTime(stock.getId(), detail.getTime());
            if (tempDetail == null) {
                detailService.insert(detail);
            } else {
                logger.debug("[Detail Exist][id:" + tempDetail.getId() + ",time:" + detail.getTime() + "]");
            }

        }

    }
}
