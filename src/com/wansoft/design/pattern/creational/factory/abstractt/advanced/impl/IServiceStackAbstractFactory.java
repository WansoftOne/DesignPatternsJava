package com.wansoft.design.pattern.creational.factory.abstractt.advanced.impl;

import com.wansoft.design.pattern.creational.factory.abstractt.advanced.service.IEmployeeService;
import com.wansoft.design.pattern.creational.factory.abstractt.advanced.service.IProductService;

public interface IServiceStackAbstractFactory {
	public IEmployeeService getEmployeeService();
	public IProductService getProductsService();
}
