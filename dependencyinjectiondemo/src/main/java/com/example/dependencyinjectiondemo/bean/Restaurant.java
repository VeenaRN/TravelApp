package com.example.dependencyinjectiondemo.bean;

public class Restaurant {
	
	String name;
	String phone;
	String operatingHours;
	float rating;
	///reference type and holds hashcode for some add object in res object
	Address address;
	
	public Restaurant() {
		//address=new Address();//doing hardcode on address object
	System.out.println("[Restaurant]Object created");
	
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getOperatingHours() {
		return operatingHours;
	}

	public void setOperatingHours(String operatingHours) {
		this.operatingHours = operatingHours;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public Address getAddress() {
		return address;
	}
//setter and getter fulfils the dependency for address
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Restaurant [name=" + name + ", phone=" + phone + ", operateingHours=" + operatingHours + ", rating="
				+ rating + ", address=" + address + "]";
	}

}
