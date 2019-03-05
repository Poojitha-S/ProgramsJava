 package com.bridgeit.objectorientedprogram;

import java.util.List;

public class Product 
{
	private String product;
	private List<ProductProperties> properties;
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public List<ProductProperties> getProperties() {
		return properties;
	}
	public void setProperties(List<ProductProperties> properties) {
		this.properties = properties;
	}
	
}
