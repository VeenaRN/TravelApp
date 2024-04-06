package com.abstraction;

public class Hosteller extends Student{
	

	private String hostelName;
	private int roomNumber;
	
	public Hosteller(int sId, String name, int depId, String gender, String phone,String hostelName, int roomNumber) {
		super(sId, name, depId, gender, phone);
		this.hostelName = hostelName;
        this.roomNumber = roomNumber;
	}

	
	
	public String getHostelname() {
		return hostelName;
	}
	public void setHostelname(String hostelname) {
		this.hostelName = hostelName;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	}
	
	
	


