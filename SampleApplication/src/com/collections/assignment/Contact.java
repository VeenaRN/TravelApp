package com.collections.assignment;

public class Contact {
	private String firstname;
	private String lastname;
	private long phoneNumber;
	private String emailId;
	
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public long getPhonenumber() {
		return phoneNumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phoneNumber = phonenumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Contact(String firstname, String lastname, long phonenumber, String emailId) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
	}
	

}
