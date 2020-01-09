package com.wansoft.pattern.singletone;

@SuppressWarnings("unused")
public class Test {
	
	public static void main(String[] args) {
		/**
		 * Using SingletoneUserCalss in main method
		 */
		SingletoneUser user = SingletoneUser.getSingletoneUser(24);
		System.out.println("End program");
	}
}
