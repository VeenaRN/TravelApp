package com.example.dependencyinjectiondemo.bean;

public class Address {
	String adrsLine;
	String city;
	String state;
	int zipcode;
	
	public Address() {
		System.out.println("[Address]object created");
		
		
	}

	public String getAdrsLine() {
		return adrsLine;
	}

	public void setAdrsLine(String adrsLine) {
		this.adrsLine = adrsLine;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "Address [adrsLine=" + adrsLine + ", city=" + city + ", state=" + state + ", zipcode=" + zipcode + "]";
	}
}
