package coms.SpringDataJpaApp.service;

import java.util.List;

import coms.SpringDataJpaApp.entities.Employee;

public interface EmpService {
	
	public String AddEmp(Employee emp);
	public List<Employee>  EmpAll();
	public Employee SearchEmp(int empno);
	public Employee UserCheck(String uname,String pwd);
	public String ChangePassword(String npwd,int empno);
	public void DeleteEmp(int empno);

}
