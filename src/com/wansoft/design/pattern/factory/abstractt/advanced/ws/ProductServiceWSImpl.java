package com.wansoft.design.pattern.factory.abstractt.advanced.ws;

import com.wansoft.design.pattern.factory.abstractt.advanced.service.IProductService;

public class ProductServiceWSImpl implements IProductService {
	
	private static final String [] PRODUCTS = new String[] {"CUP", "GLASS", "CPU"};
	
	@Override
	public String[] getProducts() {
		System.out.println("WebService");
		return PRODUCTS;
	}

}
