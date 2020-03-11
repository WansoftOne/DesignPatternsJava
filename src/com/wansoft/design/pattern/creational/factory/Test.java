package com.wansoft.design.pattern.creational.factory;

public class Test {
	public static void main(String[] args) {
		BreadFactory factory = new BreadFactory();
		factory.getBread("cupcake").getName();
		factory.getBread("donnut").getName();
	}
}
