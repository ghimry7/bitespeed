package com.bitespeed.identifyms.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {

	@JsonProperty("contact")
	private Contact contact;

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

}
