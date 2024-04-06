package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.beans.Employee;
import com.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService es;
	
	@GetMapping("einfo")
	public String EmpReg(Model m)
	{
		Employee emp=new Employee();
		m.addAttribute("emp",emp);
		
		return "Employee";
	}
	
	@PostMapping("empreg")//from employee.jsp action
	public String EmpReg(@ModelAttribute("emp") Employee emp,   Model m)
	{
		System.out.println(emp.getEmpno() +"\t"+ emp.getEname() +"\t"+ emp.getJob() +"\t"+ emp.getSalary());
		m.addAttribute("empinfo",emp);
		es.AddEmployee(emp);
		return "Employee";
	}
	@GetMapping("empall")
	public String ViewAll(Model m)
	{
	List<Employee> empall=es.ShowAll()	;
	m.addAttribute("empall",empall);
	return "ViewAllEmps";
	
	}
	
	

}
