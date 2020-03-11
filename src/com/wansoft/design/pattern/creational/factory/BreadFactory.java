package com.wansoft.design.pattern.creational.factory;

public class BreadFactory {
	public Bread getBread(String key) {
		if(key.equals("cupcake")) {
			return new CupCake();
		}else if(key.equals("donnut")) {
			return new Donnut();
		}else {
			return null;
		}
	}
}
