package com.wansoft.design.pattern.singletone;

public class SingletoneUser{
	
	private int userId;
	private String name;
	private String email;
	private static SingletoneUser user;

	private SingletoneUser(int userId) {
		//some request
		this.userId = userId;
		this.name = "wansoft";
		this.email = "wansoft@mail.com";
	}
	
	public static SingletoneUser getUser(int userId) {
		if(user == null) {
			user = new SingletoneUser(userId);
		}
		return user;
	}

	public int getUserId() {
		return userId;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}	
	
}