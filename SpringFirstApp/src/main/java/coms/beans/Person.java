package coms.beans;

public class Person {
	
	private String pname;
	private String location;
	private String phone;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Person(String pname, String location, String phone) {
		super();
		this.pname = pname;
		this.location = location;
		this.phone = phone;
	}
	
	public void PersonDetails()
	{
		System.out.println("Person Name:" +this.getPname());
		System.out.println("Person phone:" +this.getPhone());
		System.out.println("Person location:" +this.getLocation());
	}

}
