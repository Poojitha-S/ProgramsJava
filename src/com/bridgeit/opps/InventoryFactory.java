package com.bridgeit.oops;

import java.util.List;

public class InventoryFactory {
private List<Product> inventoryFactory;

public List<Product> getInventoryFactory() {
	return inventoryFactory;
}

public void setInventoryFactory(List<Product> inventoryFactory) {
	this.inventoryFactory = inventoryFactory;
}
}
