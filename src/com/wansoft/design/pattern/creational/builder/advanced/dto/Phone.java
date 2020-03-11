package com.wansoft.design.pattern.creational.builder.advanced.dto;

public class Phone {
	
	private String phoneNumber;
	private String text;
	private String phoneType;
	
	public Phone() {}
	
	public Phone(String phoneNumber, String ext, String phoneType) {
		this.phoneNumber = phoneNumber;
		this.text = ext;
		this.phoneType = phoneType;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getPhoneType() {
		return phoneType;
	}

	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}
	
}
