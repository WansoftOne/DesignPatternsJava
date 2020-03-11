package com.wansoft.design.pattern.creational.prototype.advanced.impl;

import java.util.HashMap;

public class PrototypeFactory {
	
	private static HashMap<String, IPrototype> prototypes = new HashMap<String, IPrototype>();
	
	public static IPrototype getPrototype(String key) {
		return prototypes.get(key);
	}
	public static void addPrototype(String key, IPrototype prototype) {
		prototypes.put(key, prototype);
	}
}
