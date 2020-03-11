package com.wansoft.design.pattern.creational.factory.abstractt.example1;

public class Dog implements Animal {

	@Override
	public String getAnimal() {
		return "a Dog";
	}
	
	@Override
	public String getSound() {
		return "wof wof";
	}
	
	public void soyAlgo() {
		
	}
}
