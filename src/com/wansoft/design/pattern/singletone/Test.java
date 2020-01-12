package com.wansoft.design.pattern.singletone;

@SuppressWarnings("unused")
public class Test {
	
	public static void main(String[] args) {
		/**
		 * Using SingletoneUserCalss in main method
		 */
		SingletoneUser user = SingletoneUser.getUser(24);
		System.out.println("End program");
	}
}
