package com.bridgeit.objectorientedprogram;

import java.util.List;

public class Share 
{
	private String stockName;
	private List<Properties> properties;
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public List<Properties> getProperties() {
		return properties;
	}
	public void setProperties(List<Properties> properties) {
		this.properties = properties;
	}
	@Override
	public String toString() {
		return "Share [stockName=" + stockName + ", properties=" + properties + "]";
	}
}
