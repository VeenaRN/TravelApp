package com.polymorphism;

public class Main {
    public static void main(String[] args) {
        
        PermanentEmployee permanentEmployee = new PermanentEmployee(101, "John", 50000);
        TemporaryEmployee temporaryEmployee = new TemporaryEmployee(102, "Alice", 40, 25);

       
        permanentEmployee.calculateSalary();
        temporaryEmployee.calculateSalary();
        
        System.out.println("Permanent Employee Salary: " + permanentEmployee.getSalary());
        System.out.println("Temporary Employee Salary: " + temporaryEmployee.getSalary());

        Loan loan = new Loan();

        System.out.println("Loan amount for Permanent Employee: " + loan.calculateLoanAmount(permanentEmployee));
        System.out.println("Loan amount for Temporary Employee: " + loan.calculateLoanAmount(temporaryEmployee));
    }
}



