package com.wansoft.design.pattern.creational.builder.advanced;

import com.wansoft.design.pattern.creational.builder.advanced.dto.Employee;

public class BuilderMain {
	
	public static void main(String[] args) {
		Employee employee = new Employee.EmployeeBuilder()
				.setName("Juan Salinas Zavaleta")
				.setGender("Male")
				.setAge(25)
				.setAddress("Empresarios 4749", "Guadalajara Jalisco"
						, "Mexico", "48900")
				.addContacs("Magdalena Loaeza", "3323558844", null
						,"cellphone", "Empresarios 4788", "Zapopan Jalisco"
						, "Mexico", "48901")
				.addPhones("5580068544", null, "cellphone")
				.addPhones("9545434979", null, "Casa")
				.build();
		System.out.println(employee);
		System.out.println("end program");
	}
	
}
