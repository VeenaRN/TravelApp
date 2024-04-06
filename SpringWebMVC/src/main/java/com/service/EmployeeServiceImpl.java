package com.service;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.beans.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	DataSource dataSrc;
	JdbcTemplate jdbcTemp;
	
	public DataSource getDataSrc() {
		return dataSrc;
	}

	public void setDataSrc(DataSource dataSrc) {
		this.dataSrc = dataSrc;
		jdbcTemp=new JdbcTemplate(this.dataSrc);
	}

	@Override
	public String AddEmployee(Employee emp) {
		String sqlcmd="Insert into Employee(ename,job,salary) values(?,?,?)";
		int res=jdbcTemp.update(sqlcmd, new Object[] {emp.getEname(),emp.getJob(),emp.getSalary()});
		if(res>=1)
			return "Success";
		return "err";
	}

	@Override
	public List<Employee> ShowAll() {
		String sqlcmd="Select *from Employee";
		List<Employee> empall=jdbcTemp.query(sqlcmd,new  BeanPropertyRowMapper(Employee.class));
		return empall;
		
	}

}
