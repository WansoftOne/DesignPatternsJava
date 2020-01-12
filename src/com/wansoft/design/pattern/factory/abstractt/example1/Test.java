package com.wansoft.design.pattern.factory.abstractt.example1;

public class Test {
	public static void main(String[] args) {
		
		AbstractFactory<?> abstractFactory;
		
		abstractFactory = FactoryProvider.getFactory("ANIMAL");
		Animal animal = (Animal) abstractFactory.create("Dog");

		abstractFactory = FactoryProvider.getFactory("COLOR");
		Color color = (Color) abstractFactory.create("Red");
		
		//Animal animal = (Animal) FactoryProvider.getFactory("ANIMAL").create("Dog");
		//Color color = (Color)FactoryProvider.getFactory("COLOR").create("Red");
		System.out.println("end program");
	}
}
