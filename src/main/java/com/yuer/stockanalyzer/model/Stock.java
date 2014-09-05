package com.yuer.stockanalyzer.model;

import java.math.BigDecimal;

public class Stock {
	private Integer id;
	private String symbol;
	private String exchange;
	private String code;
	private String name;
	private BigDecimal current;
	private BigDecimal percentage;
	private BigDecimal change;
	private BigDecimal open;
	private BigDecimal high;
	private BigDecimal low;
	private BigDecimal close;
	private BigDecimal lastClose;
	private BigDecimal high52week;
	private BigDecimal low52week;
	private BigDecimal volume;
	private BigDecimal volumeAverage;
	private BigDecimal marketCapital;
	private BigDecimal eps;
	private BigDecimal peTtm;
	private BigDecimal peLyr;
	private String currencyUnit;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getExchange() {
		return exchange;
	}

	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getCurrent() {
		return current;
	}

	public void setCurrent(BigDecimal current) {
		this.current = current;
	}

	public BigDecimal getPercentage() {
		return percentage;
	}

	public void setPercentage(BigDecimal percentage) {
		this.percentage = percentage;
	}

	public BigDecimal getChange() {
		return change;
	}

	public void setChange(BigDecimal change) {
		this.change = change;
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

	public BigDecimal getLow() {
		return low;
	}

	public void setLow(BigDecimal low) {
		this.low = low;
	}

	public BigDecimal getClose() {
		return close;
	}

	public void setClose(BigDecimal close) {
		this.close = close;
	}

	public BigDecimal getLastClose() {
		return lastClose;
	}

	public void setLastClose(BigDecimal lastClose) {
		this.lastClose = lastClose;
	}

	public BigDecimal getHigh52week() {
		return high52week;
	}

	public void setHigh52week(BigDecimal high52week) {
		this.high52week = high52week;
	}

	public BigDecimal getLow52week() {
		return low52week;
	}

	public void setLow52week(BigDecimal low52week) {
		this.low52week = low52week;
	}

	public BigDecimal getVolume() {
		return volume;
	}

	public void setVolume(BigDecimal volume) {
		this.volume = volume;
	}

	public BigDecimal getVolumeAverage() {
		return volumeAverage;
	}

	public void setVolumeAverage(BigDecimal volumeAverage) {
		this.volumeAverage = volumeAverage;
	}

	public BigDecimal getMarketCapital() {
		return marketCapital;
	}

	public void setMarketCapital(BigDecimal marketCapital) {
		this.marketCapital = marketCapital;
	}

	public BigDecimal getEps() {
		return eps;
	}

	public void setEps(BigDecimal eps) {
		this.eps = eps;
	}

	public BigDecimal getPeTtm() {
		return peTtm;
	}

	public void setPeTtm(BigDecimal peTtm) {
		this.peTtm = peTtm;
	}

	public BigDecimal getPeLyr() {
		return peLyr;
	}

	public void setPeLyr(BigDecimal peLyr) {
		this.peLyr = peLyr;
	}

	public String getCurrencyUnit() {
		return currencyUnit;
	}

	public void setCurrencyUnit(String currencyUnit) {
		this.currencyUnit = currencyUnit;
	}

}
