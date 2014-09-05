package com.yuer.stockanalyzer.model;

import java.math.BigDecimal;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class Detail {
	private Integer id;
	private Integer volume;
	private BigDecimal open;
	private BigDecimal high;
	private BigDecimal close;
	private BigDecimal low;
	private BigDecimal chg;
	private BigDecimal percent;
	private BigDecimal turnrate;
	private BigDecimal ma5;
	private BigDecimal ma10;
	private BigDecimal ma20;
	private BigDecimal ma30;
	private BigDecimal dif;
	private BigDecimal dea;
	private BigDecimal macd;
	@JSONField(format = "EEE MMM d HH:mm:ss Z yyyy")//"EEE, d MMM yyyy HH:mm:ss Z" 
												    //  Wed, 4 Jul 2001 12:08:56 -0700 
													//  Mon Nov 18 00:00:00 +0800 1996
													//  EEE MMM d HH:mm:ss Z yyyy
	private Date time;
	private Integer stockId;
	private Stock stock;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getVolume() {
		return volume;
	}

	public void setVolume(Integer volume) {
		this.volume = volume;
	}

	public BigDecimal getOpen() {
		return open;
	}

	public void setOpen(BigDecimal open) {
		this.open = open;
	}

	public BigDecimal getHigh() {
		return high;
	}

	public void setHigh(BigDecimal high) {
		this.high = high;
	}

	public BigDecimal getClose() {
		return close;
	}

	public void setClose(BigDecimal close) {
		this.close = close;
	}

	public BigDecimal getLow() {
		return low;
	}

	public void setLow(BigDecimal low) {
		this.low = low;
	}

	public BigDecimal getChg() {
		return chg;
	}

	public void setChg(BigDecimal chg) {
		this.chg = chg;
	}

	public BigDecimal getPercent() {
		return percent;
	}

	public void setPercent(BigDecimal percent) {
		this.percent = percent;
	}

	public BigDecimal getTurnrate() {
		return turnrate;
	}

	public void setTurnrate(BigDecimal turnrate) {
		this.turnrate = turnrate;
	}

	public BigDecimal getMa5() {
		return ma5;
	}

	public void setMa5(BigDecimal ma5) {
		this.ma5 = ma5;
	}

	public BigDecimal getMa10() {
		return ma10;
	}

	public void setMa10(BigDecimal ma10) {
		this.ma10 = ma10;
	}

	public BigDecimal getMa20() {
		return ma20;
	}

	public void setMa20(BigDecimal ma20) {
		this.ma20 = ma20;
	}

	public BigDecimal getMa30() {
		return ma30;
	}

	public void setMa30(BigDecimal ma30) {
		this.ma30 = ma30;
	}

	public BigDecimal getDif() {
		return dif;
	}

	public void setDif(BigDecimal dif) {
		this.dif = dif;
	}

	public BigDecimal getDea() {
		return dea;
	}

	public void setDea(BigDecimal dea) {
		this.dea = dea;
	}

	public BigDecimal getMacd() {
		return macd;
	}

	public void setMacd(BigDecimal macd) {
		this.macd = macd;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Integer getStockId() {
		return stockId;
	}

	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

}
