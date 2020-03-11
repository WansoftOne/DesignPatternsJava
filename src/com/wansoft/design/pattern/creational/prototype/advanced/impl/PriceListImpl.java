package com.wansoft.design.pattern.creational.prototype.advanced.impl;

import java.util.ArrayList;
import java.util.List;

public class PriceListImpl implements IPrototype<PriceListImpl>{
	
	private String listName;
	private List<ProductItem> products = new ArrayList<ProductItem>();
	
	public PriceListImpl(String listName) {
		listName =listName;
	}
	
	@Override
	public PriceListImpl clone() {
		PriceListImpl clone = new PriceListImpl(listName);
		clone.setProducts(products);
		return clone;
	}

	@Override
	public PriceListImpl deepClone() {
		List<ProductItem> cloneProducts =new ArrayList<ProductItem>();
		for(ProductItem item : this.products) {
			ProductItem cloneItem = item.clone();
			cloneProducts.add(cloneItem);
		}
		PriceListImpl clone = new PriceListImpl(listName);
		clone.setProducts(cloneProducts);
		return clone;
	}
	@Override
	public String toString() {
		String items = "";
		for(ProductItem item : this.products) {
			items += "\t" + item.toString() + "\n";
		}
		return "PriceListImpl{listName=" + listName + ", products=\n" + items + "}";
	}
	
	public String getListName() {
		return listName;
	}

	public void setListName(String listName) {
		this.listName = listName;
	}

	public List<ProductItem> getProducts() {
		return products;
	}

	public void setProducts(List<ProductItem> products) {
		this.products = products;
	}
    public void addProductItem(ProductItem item){
        this.products.add(item);
    }
	
}
