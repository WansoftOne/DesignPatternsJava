package com.wansoft.pattern.factory.abstractt.example1;

public class AnimalFactory implements AbstractFactory<Animal>{

	@Override
	public Animal create(String key) {
		/**
		 * Register all case for this Factory
		 */
		if(key.contentEquals("Dog")) {
			return new Dog();
		}
		/**
		 * else if("other case"){
		 * 	return new SomeThing();
		 * }
		 */
		return null;
	}
	
}
