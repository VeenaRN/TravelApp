package com.Sorting;

public class StudentAge implements Comparable<StudentAge>{//allows instances of Student to be sorted based on 
	                                                       //their ages without explicitly specifying a comparator every time we want 
	private String name;
	private int age;
	private String area;
	private int money;
	
	public StudentAge(String name, int age, String area, int money) {
		super();
		this.name = name;
		this.age = age;
		this.area = area;
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	public int compareTo(StudentAge s)
	{
	if(money==s.money) {
		return 0;
	}else if(money>s.money) {
		return 1;
	}else {
		return -1;
	}
	}
	

}
