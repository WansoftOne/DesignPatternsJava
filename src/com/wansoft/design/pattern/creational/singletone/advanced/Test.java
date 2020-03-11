package com.wansoft.design.pattern.creational.singletone.advanced;

/**
 * 
 * @author Juan Salinas Zavaleta
 * Testing singletone pattern
 *
 */
public class Test {
	
	public static void main(String[] args) {
		ConfigurationSingletone singletoneA = ConfigurationSingletone.getInstance();
		ConfigurationSingletone singletoneB = ConfigurationSingletone.getInstance();
		
		System.out.println(singletoneA);
		System.out.println(singletoneB);
		System.out.println("equals ? " + (singletoneA == singletoneB));
		
		/**
		 * setting some property from singletoneA
		 */
		singletoneA.setAppName("APP LOVE");
		/**
		 * setting some property from singletoneB
		 */
		singletoneB.setAppVersion("2.0.x");
		
		singletoneA = null;
		singletoneB = null;
		
		singletoneA = ConfigurationSingletone.getInstance();
		System.out.println("singletoneA ==> " + singletoneA);
	}
}
