package com.yuer.stockanalyzer.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yuer.stockanalyzer.model.Detail;

public class FastjsonTest {

	@Test
	public void testFastjson() throws ParseException {
		Date date = new Date();
		Locale aLocale = Locale.ENGLISH;

		System.out.println(JSON.toJSONStringWithDateFormat(date, "EEE MMM d HH:mm:ss Z yyyy"));

		System.out.println((new SimpleDateFormat("EEE MMM d HH:mm:ss Z yyyy", Locale.ENGLISH)).format(new Date()));

		String s = "{\"volume\":16250100,\"open\":22.8,\"high\":24.0,\"close\":20.0,\"low\":19.5,\"chg\":10.62,\"percent\":113.22,\"turnrate\":45.14,\"ma5\":20.0,\"ma10\":20.0,\"ma20\":20.0,\"ma30\":20.0,\"dif\":0.0,\"dea\":0.0,\"macd\":0.0,\"time\":\"Mon Nov 18 00:00:00 +0800 1996\"}";
		JSONObject object = JSON.parseObject(s);
		String[] pattern = new String[] { "yyyy-MM", "yyyyMM", "yyyy/MM", "yyyyMMdd", "yyyy-MM-dd", "yyyy/MM/dd", "yyyyMMddHHmmss", "yyyy-MM-dd HH:mm:ss",
				"yyyy/MM/dd HH:mm:ss", "EEE MMM d HH:mm:ss Z yyyy" };

		Date myDate = (new SimpleDateFormat("EEE MMM d HH:mm:ss Z yyyy", Locale.ENGLISH)).parse(object.getString("time"));
		System.out.println(myDate);

		object.put("time", myDate);

		Detail detail = JSON.parseObject(object.toJSONString(), Detail.class);
		System.out.print(detail.getTime());
	}
}
