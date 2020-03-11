package com.wansoft.design.pattern.creational.factory.abstractt.advanced;

import java.util.Arrays;

import com.wansoft.design.pattern.creational.factory.abstractt.advanced.impl.IServiceStackAbstractFactory;
import com.wansoft.design.pattern.creational.factory.abstractt.advanced.impl.ServiceStackAbstractFactory;
import com.wansoft.design.pattern.creational.factory.abstractt.advanced.service.IEmployeeService;
import com.wansoft.design.pattern.creational.factory.abstractt.advanced.service.IProductService;

public class Test{
  
	public static void main (String [] args){
		IServiceStackAbstractFactory factory = 
				ServiceStackAbstractFactory.createServiceFactory();
		
		IEmployeeService employeeService = factory.getEmployeeService();
		IProductService productService = factory.getProductsService();
		
		System.out.println("EmployeeService class => " + employeeService.getClass().getName());
		System.out.println("Response => " + Arrays.toString(employeeService.getEmployee()));
		System.out.println("ProductService class => " + productService.getClass().getName());
		System.out.println("Response => " + Arrays.toString(productService.getProducts()));
		
	}
}
