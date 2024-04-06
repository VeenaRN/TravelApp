package com.polymorphism;

public class Loan {

	public double calculateLoanAmount(Employee employeeObj) {
        if (employeeObj instanceof PermanentEmployee) {
            return 0.15 * employeeObj.getSalary(); 
        } else if (employeeObj instanceof TemporaryEmployee) {
            return 0.10 * employeeObj.getSalary(); 
        } else {
            return 0.0; 
        }
    }
}


