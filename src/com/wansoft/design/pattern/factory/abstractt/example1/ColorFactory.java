package com.wansoft.pattern.factory.abstractt.example1;

public class ColorFactory implements AbstractFactory<Color> {

	@Override
	public Color create(String key) {
		/**
		 * Register all case for this Factory
		 */
		if("Red".equals(key)) {
			return new Red();
		}
		/**
		 * else if("other case"){
		 * 	return new SomeThing();
		 * }
		 */
		return null;
	}
	
}
