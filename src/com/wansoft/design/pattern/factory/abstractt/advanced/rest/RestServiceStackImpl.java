package com.wansoft.design.pattern.factory.abstractt.advanced.rest;

import com.wansoft.design.pattern.factory.abstractt.advanced.impl.IServiceStackAbstractFactory;
import com.wansoft.design.pattern.factory.abstractt.advanced.service.IEmployeeService;
import com.wansoft.design.pattern.factory.abstractt.advanced.service.IProductService;

public class RestServiceStackImpl implements IServiceStackAbstractFactory {

	@Override
	public IEmployeeService getEmployeeService() {
		return new EmployeeServiceRestImpl();
	}

	@Override
	public IProductService getProductsService() {
		return new ProductServiceRestImpl();
	}

}
