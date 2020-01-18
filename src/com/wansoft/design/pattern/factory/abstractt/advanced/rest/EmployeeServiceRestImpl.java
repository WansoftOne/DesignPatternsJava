package com.wansoft.design.pattern.factory.abstractt.advanced.rest;

import com.wansoft.design.pattern.factory.abstractt.advanced.service.IEmployeeService;

public class EmployeeServiceRestImpl implements IEmployeeService {

	private static final String[] EMPLOYEES = new String[] {"Juan","Magda","Sofia"};

	@Override
	public String[] getEmployee() {
		System.out.println("RestFul");
		return EMPLOYEES;
	}
	
}
