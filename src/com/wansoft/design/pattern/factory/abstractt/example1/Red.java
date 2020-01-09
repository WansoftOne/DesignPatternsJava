package com.wansoft.pattern.factory.abstractt.example1;

public class Red implements Color{

	@Override
	public String getColor() {
		return "Red Color";
	}

	@Override
	public boolean isPrimary() {
		return true;
	}
	
}
