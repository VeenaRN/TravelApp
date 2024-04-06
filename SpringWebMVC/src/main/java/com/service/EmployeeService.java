package com.service;

import java.util.List;

import com.beans.Employee;

public interface EmployeeService {
	
	public String AddEmployee(Employee emp);
	
	public List<Employee> ShowAll();

}
