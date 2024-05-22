package com.bitespeed.identifyms.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Request {

	@JsonProperty("email")
	private String email;

	@JsonProperty("phoneNumber")
	private String phoneNumber;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
