package com.abstraction;
//import java.util.Scanner;

public class Student {
	
		  protected int sId;
		  protected String name;
		  protected int depId;
		  protected String gender;
		  protected String phone;
		public int getStudentId() {
			return sId;
		}
		public void setStudentId(int sId) {
			this.sId = sId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getDepartmentId() {
			return depId;
		}
		public void setDepartmentId(int depId) {
			this.depId = depId;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public Student(int sId, String name, int depId, String gender, String phone) {
			super();
			this.sId = sId;
			this.name = name;
			this.depId = depId;
			this.gender = gender;
			this.phone = phone;
		}
		  
		

	}


