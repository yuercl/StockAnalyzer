package com.yuer.stockanalyzer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yuer.stockanalyzer.model.Stock;
import com.yuer.stockanalyzer.persistence.StockMapper;

@Service("StockService")
@Transactional(value = "isap", rollbackFor = Exception.class)
public class StockService {

	@Autowired
	private StockMapper stockMapper;

	public Integer insert(Stock stock) {
		return stockMapper.insert(stock);
	}

	public List<Stock> list() {
		return stockMapper.selectAll();
	}

}
