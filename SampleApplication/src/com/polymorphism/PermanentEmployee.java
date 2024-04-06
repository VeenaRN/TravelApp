package com.polymorphism;

public class PermanentEmployee extends Employee{
	
	private double basicPay;
	
	public PermanentEmployee(int employeeId, String employeeName, double basicPay) {

    super(employeeId, employeeName);
    this.basicPay = basicPay;
	}
	public void calculateSalary() {
		double pfAmount=basicPay*0.12;
		salary=basicPay-pfAmount;
	}
	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	
	
	
}


