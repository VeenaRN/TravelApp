//package coms.EmployeeApplication.controller;
//
//import java.util.List;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import coms.EmployeeApplication.models.Employee;
//import coms.EmployeeApplication.service.EmpService;
//
//@Controller
//public class EmpController {
//	
//	
//	@Autowired
//	EmpService es;
//	
//	
//	@GetMapping("/newemp")
//	public  String NewEmp(Model m)
//	{
//		m.addAttribute("emp",new Employee());
//		return "AddEmp";
//	}
//	
//	
//	@PostMapping("newempinfo")
//	public String NewEmp(@ModelAttribute Employee emp,Model m)
//	{
//		String res=es.AddEmp(emp);
//		if(res.equals("Success")) 
//		{
//			m.addAttribute("info","Employee Added");
//			m.addAttribute("emp",new Employee());
//		}
//			return "redirect:/empall";
//}
//	
//	@GetMapping("empall")
//	public String ViewAll(Model m)
//	{
//		List<Employee> emplist=es.EmpAll();
//		m.addAttribute("emplist",emplist);
//		return "ViewAllEmps";
//	}
//	
//	
//	@GetMapping("semp")
//	public String SearchEmp(Model m)
//	{
//		return "SearchEmp";
//	}
//	
//	
//	@PostMapping("sempinfo")
//	public String SearchEmp(@RequestParam("txtEmpno" ) int eno,Model m)
//	{
//	Employee einfo=es.SearchEmp(eno);
//	
//	if(einfo!=null)
//		m.addAttribute("einfo",einfo);
//		
//	else
//		m.addAttribute("info","Employee Not Found");
//	return "SearchEmp";
//	}
//	
//	
//	@GetMapping("login")
//	public String LoginPage(Model m)
//	{
//		return"LoginPage";
//	}
//	
//	@PostMapping("logininfo")
//	public String LoginPage(@RequestParam("txtUser") String uname, 
//		@RequestParam("txtPass") String pwd,	Model m)
//	{
//		if(uname.equals("Admin") && pwd.equals("admin@123"))
//			return "redirect:/empall";
//		else
//		{
//			Employee emp = es.UserCheck(uname, pwd);
//			if(emp!=null)
//			{
//				m.addAttribute("einfo", emp);
//				return "EmpWelcome";
//			}
//			else
//				m.addAttribute("info", "Please check username/password");	
//		}	
//		return "LoginPage";
//	
//		
//	}
//}



package coms.EmployeeApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import coms.EmployeeApplication.models.Employee;
import coms.EmployeeApplication.service.EmpService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class EmpController {

	@Autowired
	EmpService es;
	
	@GetMapping("/newemp")
	public String NewEmp(Model m)
	{
		m.addAttribute("emp", new Employee());
		return "AddEmp";
	}
	
	@PostMapping("newempinfo")
	public String NewEmp(@ModelAttribute Employee emp, Model m)
	{
		String res = es.AddEmp(emp);
		if(res.equals("Success"))
		{
			m.addAttribute("info", "Employee is Added");
			m.addAttribute("emp",  new Employee());
		}	
		return "redirect:/empall";
	}
	
	@GetMapping("empall")
	public String ViewAll(Model m)
	{
		List<Employee> emplist = es.EmpAll();
		m.addAttribute("emplist",emplist);
		return "ViewAllEmps";
	}

	@GetMapping("semp")
	public String SearchEmp(Model m)
	{
		return "SearchEmp";
	}
	@PostMapping("sempinfo")
	public String SearchEmp(@RequestParam("txtEmpno") int eno,  Model m)
	{
			Employee einfo = es.SearchEmp(eno);
			
			if(einfo!=null)
				m.addAttribute("einfo", einfo);
			else
				m.addAttribute("info", "Employee Not Found");
			return "SearchEmp";
	}
	
	@GetMapping("login")
	public String LoginPage(Model m)
	{
		return "LoginPage";
	}
	
	@PostMapping("logininfo")
	public String LoginPage(@RequestParam("txtUser") String uname, 
		@RequestParam("txtPass") String pwd, HttpServletRequest request,	Model m)
	{
		if(uname.equals("Admin") && pwd.equals("admin@123"))
			return "redirect:/empall";
		else
		{
			Employee emp = es.UserCheck(uname, pwd);
			if(emp!=null)
			{
				m.addAttribute("einfo", emp);
				HttpSession session =request.getSession();//get session memory
				session.setAttribute("empno", emp.getEmpno());
				session.setAttribute("ename", emp.getEmpname());
				return "EmpWelcome";
			}
			else
				m.addAttribute("info", "Please check username/password");	
		}	
		return "LoginPage";
	}
	
	@GetMapping("cpwd")
	public String ChangePassword(HttpServletRequest request,	Model m)
	{
		HttpSession session =request.getSession();
		String ename=(String) session.getAttribute("ename");
		m.addAttribute("ename",ename);
		return"ChangePwd";
	}
	
	@PostMapping("cpwdinfo")
	public String ChangePassword(@RequestParam("txtNew") String newpwd ,
			@RequestParam("txtConf") String newcon ,Model m,HttpServletRequest request)
	{
		if(newpwd.equals(newcon))
		{
			HttpSession session =request.getSession();
			int empno=(Integer) session.getAttribute("empno");
			es.ChangePassword(newcon, empno);	
			return"LoginPage";
		}
		m.addAttribute("info","New Password and Confirm password must be same");
		return"ChangePwd";
	}
	
	
	@GetMapping("emphome")
	public String GetHome(Model m,HttpServletRequest request)
	{
	HttpSession session =request.getSession();
	int empno=(Integer) session.getAttribute("empno");
	//System.out.println(empno);
	Employee emp=es.SearchEmp(empno);
	m.addAttribute("einfo",emp);
	return "EmpWelcome"	;
	}
	
	@GetMapping("delemp/{eno}")
	public String DeleteEmployee(@PathVariable int eno)
	{
		es.DeleteEmp(eno);
		return "redirect:/empall";
	}
	
	
}
