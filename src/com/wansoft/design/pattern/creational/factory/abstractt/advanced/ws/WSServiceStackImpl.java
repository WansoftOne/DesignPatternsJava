package com.wansoft.design.pattern.creational.factory.abstractt.advanced.ws;

import com.wansoft.design.pattern.creational.factory.abstractt.advanced.impl.IServiceStackAbstractFactory;
import com.wansoft.design.pattern.creational.factory.abstractt.advanced.service.IEmployeeService;
import com.wansoft.design.pattern.creational.factory.abstractt.advanced.service.IProductService;

public class WSServiceStackImpl implements IServiceStackAbstractFactory {

	@Override
	public IEmployeeService getEmployeeService() {
		return new EmployeeServiceWSImpl();
	}

	@Override
	public IProductService getProductsService() {
		return new ProductServiceWSImpl();
	}

}
