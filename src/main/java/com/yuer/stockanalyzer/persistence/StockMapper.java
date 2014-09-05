package com.yuer.stockanalyzer.persistence;

import java.util.List;

import com.yuer.stockanalyzer.model.Stock;

public interface StockMapper {

	Integer insert(Stock stock);

	Stock get(Integer id);

	List<Stock> selectAll();

}