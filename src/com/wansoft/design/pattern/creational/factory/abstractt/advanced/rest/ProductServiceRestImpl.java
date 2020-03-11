package com.wansoft.design.pattern.creational.factory.abstractt.advanced.rest;

import com.wansoft.design.pattern.creational.factory.abstractt.advanced.service.IProductService;

public class ProductServiceRestImpl implements IProductService {
	
	private static final String [] PRODUCTS = new String[] {"Keyboard", "Mouse", "Monitor"};
	
	@Override
	public String[] getProducts() {
		System.out.println("RestFul");
		return PRODUCTS;
	}
}
