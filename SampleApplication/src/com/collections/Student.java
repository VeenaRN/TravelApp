package com.collections;

public class Student {
	
	private String sname;
	private int rollno;
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public Student(String sname, int rollno) {
		super();
		this.sname = sname;
		this.rollno = rollno;
	}
	public String toString() {
		return  "[rollno="+rollno+",sname"+sname+"]";
	}
	

}
