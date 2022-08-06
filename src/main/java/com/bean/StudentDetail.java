package com.bean;

import org.springframework.stereotype.Component;

@Component
public class StudentDetail {

	private String address;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
