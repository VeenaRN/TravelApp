package com.xadmin.usermanagement.bean;

//CREATE TABLE participants (
//	    participant_id INT PRIMARY KEY AUTO_INCREMENT,
//	    name VARCHAR(255) NOT NULL,
//	    age VARCHAR(10),
//	    email VARCHAR(255),
//	    phone VARCHAR(20),
//	   batchid int,
//	    address VARCHAR(255));

public class User {
	protected int participant_id;
	protected String name;
	protected String age;
	protected String email;
	protected String phone;
	protected int batchid;
	protected String address;
	
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
