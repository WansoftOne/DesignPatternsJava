package com.wansoft.design.pattern.creational.factory.abstractt.advanced.ws;

import com.wansoft.design.pattern.creational.factory.abstractt.advanced.service.IEmployeeService;

public class EmployeeServiceWSImpl implements IEmployeeService {

	private static final String [] EMPLOYEES = new String[] {"JUAN", "MAGDA", "SOFIA"};
	
	@Override
	public String[] getEmployee() {
		System.out.println("WebService");
		return EMPLOYEES;
	}

}
