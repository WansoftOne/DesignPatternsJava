package com.wansoft.design.pattern.creational.factory.abstractt.example1;

public class FactoryProvider {
	
	public static AbstractFactory<?> getFactory(String key) {
		/**
		 * Register all factories for the abstract factory
		 */
		if("ANIMAL".equals(key)) {
			return new AnimalFactory();
		}else if("COLOR".equals(key)) {
			return new ColorFactory();
		}
		/**
		 * else if("other case"){
		 * 	return new SomeThing();
		 * }
		 */
		return null;
	}
}
