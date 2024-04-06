//package coms.EmployeeApplication.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.BeanPropertyRowMapper;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Service;
//
//import coms.EmployeeApplication.models.Employee;
//@Service
//public class EmpServiceImpl implements EmpService{
//	
//	
//	@Autowired
//	JdbcTemplate jdbctemp;
//	
//	@Override
//	public String AddEmp(Employee emp) {
//		String sqlcmd = "Insert into Employee(empname, job, email, pswd) values(?,?,?,?)";
//		int res = jdbctemp.update(sqlcmd, new Object[] {emp.getEmpname(), emp.getJob(), emp.getEmail(), emp.getPswd()});
//		if(res>=1)
//			return "Success";
//		return "err";
//		
//	}
//
//	@Override
//	public List<Employee> EmpAll() {
//		String sqlcmd = "Select * from Employee";
//		List<Employee> empall = jdbctemp.query(sqlcmd, new BeanPropertyRowMapper(Employee.class));
//		return empall;
//		
//	}
//
//	@Override
//	public Employee SearchEmp(int empno) {
//		String sqlcmd = "Select * from Employee where empno=?";
//		Employee emp = null;
//		try {
//			emp = (Employee)jdbctemp.queryForObject(sqlcmd, new Object[] {empno}, new BeanPropertyRowMapper(Employee.class));
//		} catch (Exception e) {
//				emp = null;
//		}
//		return emp;
//	}
//
//	@Override
//	public Employee UserCheck(String uname, String pwd) {
//		String sqlcmd = "Select * from Employee where email=?,pswd=?";
//		Employee emp = null;
//		try {
//			emp = (Employee)jdbctemp.queryForObject(sqlcmd, new Object[] {uname,pwd}, new BeanPropertyRowMapper(Employee.class));
//		} catch (Exception e) {
//				emp = null;
//		}
//		return emp;
//		
//	}
//
//}


package coms.EmployeeApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import coms.EmployeeApplication.models.Employee;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	JdbcTemplate  jdbctemp;
	
	@Override
	public String AddEmp(Employee emp) {
		String sqlcmd = "Insert into Employee(empname, job, email, pswd) values(?,?,?,?)";
		int res = jdbctemp.update(sqlcmd, new Object[] {emp.getEmpname(), emp.getJob(), emp.getEmail(), emp.getPswd()});
		if(res>=1)
			return "Success";
		return "err";
	}

	@Override
	public List<Employee> EmpAll() {
		String sqlcmd = "Select * from Employee";
		List<Employee> empall = jdbctemp.query(sqlcmd, new BeanPropertyRowMapper(Employee.class));
		return empall;
	}

	@Override
	public Employee SearchEmp(int empno) {
		String sqlcmd = "Select * from Employee where empno=?";
		Employee emp = null;
		try {
			emp = (Employee)jdbctemp.queryForObject(sqlcmd, new Object[] {empno}, new BeanPropertyRowMapper(Employee.class));
		} catch (Exception e) {
				emp = null;
		}
		return emp;
	}

	@Override
	public Employee UserCheck(String uname, String pwd) {
		String sqlcmd = "Select * from Employee where email=? and pswd=?";
		Employee emp = null;
		try {
			emp = (Employee)jdbctemp.queryForObject(sqlcmd, new Object[] {uname, pwd}, new BeanPropertyRowMapper(Employee.class));
		} catch (Exception e) {
				emp = null;
		}
		return emp;
	}

	@Override
	public String ChangePassword(String npwd, int empno) {
		String sqlcmd="Update Employee set pswd=? where empno=?";
		int res=jdbctemp.update(sqlcmd,new Object[] {npwd,empno});		
		if(res>=1)
			return"Success";
		return"Err";
	}

	@Override
	public void DeleteEmp(int empno) {
		String sqlcmd="Delete from Employee where empno=?";
		jdbctemp.update(sqlcmd,new Object[] {empno});
		
	}
}

