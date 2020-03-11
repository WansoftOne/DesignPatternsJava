package com.wansoft.design.pattern.creational.builder.advanced.dto;

import java.util.ArrayList;
import java.util.List;

import com.wansoft.design.pattern.creational.builder.advanced.IBuilder;

public class Employee {
	
	private String name;
	private int age;
	private String gender;
	private Address address;
	private List<Phone> phones;
	private List<Contact> contacs;
	
	private Employee(String name, int age, String gender, Address address, List<Phone> phones
			, List<Contact> contacs) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.phones = phones;
		this.contacs = contacs;
	}
	
	public Employee(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public Employee() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Phone> getPhones() {
		return phones;
	}

	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}

	public List<Contact> getContacs() {
		return contacs;
	}

	public void setContacs(List<Contact> contacs) {
		this.contacs = contacs;
	}
	
	public static class EmployeeBuilder implements IBuilder<Employee>{
		
		private String name;
		private int age;
		private String gender;
		private Address address;
		private final List<Phone> phones = new ArrayList<Phone>();
		private final List<Contact> contacs = new ArrayList<Contact>();
		
		public EmployeeBuilder() {}
		
		public EmployeeBuilder setName(String name) {
			this.name = name;
			return this;
		}
		public EmployeeBuilder setAge(int age) {
			this.age = age;
			return this;
		}
		public EmployeeBuilder setGender(String gender) {
			this.gender = gender;
			return this;
		}
		public EmployeeBuilder setAddress(String address, String city, 
				String country, String cp) {
			this.address = new Address(address, city, country, cp);
			return this;
		}
		public EmployeeBuilder addPhones(String phoneNumber, String ext, 
				String phoneType) {
			this.phones.add(new Phone(phoneNumber, ext,phoneType));
			return this;
		}
		public EmployeeBuilder addContacs(String name, String phoneNumber,
				String ext, String phoneType, String address, String city,
				String country, String cp) {
			this.contacs.add(new Contact(name, new Phone(phoneNumber, ext, phoneType)
					,new Address(address, city, country, cp)));
			return this;
		}
		
		@Override
		public Employee build() {
			return new Employee(name, age, gender, address, phones, contacs);
		}
		
	}
	
}
