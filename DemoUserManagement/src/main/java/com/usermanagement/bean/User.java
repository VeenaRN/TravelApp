package com.usermanagement.bean;

public class User {
	
	private int participant_id;
	private String name;
	private String age;
	private String email;
	private String phone;
	private int batchid;
	private String address;
	public int getParticipant_id() {
		return participant_id;
	}
	public void setParticipant_id(int participant_id) {
		this.participant_id = participant_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getBatchid() {
		return batchid;
	}
	public void setBatchid(int batchid) {
		this.batchid = batchid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
	public User(int participant_id, String name, String age, String email, String phone, int batchid, String address) {
		super();
		this.participant_id = participant_id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.phone = phone;
		this.batchid = batchid;
		this.address = address;
	}
	public User(String name, String age, String email, String phone, int batchid, String address) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.phone = phone;
		this.batchid = batchid;
		this.address = address;
	}
	
	
	
	

}
