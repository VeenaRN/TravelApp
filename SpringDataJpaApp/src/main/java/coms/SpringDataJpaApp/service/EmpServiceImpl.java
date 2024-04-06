package coms.SpringDataJpaApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import coms.SpringDataJpaApp.Repo.EmpRepository;
import coms.SpringDataJpaApp.entities.Employee;

@Service
public class EmpServiceImpl implements EmpService {
	
	@Autowired
	EmpRepository er;

	@Override
	public String AddEmp(Employee emp) {
		Employee e= er.save(emp);//store data into DB
		if(e!=null)
			return"Success";
		return "Err";
	}

	@Override
	public List<Employee> EmpAll() {
		List<Employee> emplist=er.findAll()
;
		return emplist;
	}

	@Override
	public Employee SearchEmp(int empno) {
		Optional<Employee> emp =er.findById(empno);
		if(emp.isPresent())
				return emp.get();
		return null;
		
	}

	@Override
	public Employee UserCheck(String uname, String pwd) {
		Employee emp=null;
		List <Employee >emplist= er.findAll();
		for(Employee e:emplist)
		{
			if(e.getEmail().equals(uname) && e.getPswd().equals(pwd))
			{
				emp=e;
				break;
			}
		}
		return emp;
	}

	@Override
	public String ChangePassword(String npwd, int empno) {
		Employee emp=this.SearchEmp(empno);
		emp.setPswd(npwd);
		
		Employee e=er.saveAndFlush(emp);
		
		if(e!=null)
			return"Success";
		return "Err";
		
	}

	@Override
	public void DeleteEmp(int empno) {
		er.deleteById(empno);
		
	}

}
