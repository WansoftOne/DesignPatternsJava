package com.wansoft.design.pattern.creational.builder;

public class Test {
	
	public static void main(String[] args) {
		BankAcount object = new BankAcount.Builder(1235)
				.atBranch("Springfield")
				.openingBalance(100)
				.atRate(2.5)
				.build();
	
		System.out.println(object);

	}
  
}
