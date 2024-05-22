package com.bitespeed.identifyms.entity;

import java.util.ArrayList;
import java.util.List;

public class Contact {

	private int primaryContatctId;

	private List<String> emails;

	private List<String> phoneNumbers;

	private List<Integer> secondaryContactIds;

	public int getPrimaryContatctId() {
		return primaryContatctId;
	}

	public void setPrimaryContatctId(int primaryContatctId) {
		this.primaryContatctId = primaryContatctId;
	}

	public List<String> getEmails() {
		if (this.emails == null) {
			this.emails = new ArrayList<>();
		}
		return emails;
	}

	public void setEmails(String emails) {
		if (this.emails == null) {
			this.emails = new ArrayList<>();
		}
		this.emails.add(emails);
	}

	public List<String> getPhoneNumbers() {
		if (this.phoneNumbers == null) {
			this.phoneNumbers = new ArrayList<>();
		}
		return phoneNumbers;
	}

	public void setPhoneNumbers(String phoneNumbers) {
		if (this.phoneNumbers == null) {
			this.phoneNumbers = new ArrayList<>();
		}
		this.phoneNumbers.add(phoneNumbers);
	}

	public List<Integer> getSecondaryContactIds() {
		if (this.secondaryContactIds == null) {
			this.secondaryContactIds = new ArrayList<>();
		}
		return secondaryContactIds;
	}

	public void setSecondaryContactIds(Integer secondaryContactIds) {
		if (this.secondaryContactIds == null) {
			this.secondaryContactIds = new ArrayList<>();
		}
		this.secondaryContactIds.add(secondaryContactIds);
	}

}
