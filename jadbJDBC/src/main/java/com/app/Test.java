package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");
		
//	    int status= dao.saveEmployee(new Employee(103,"Sohan",13000));
//		System.out.println(status); 
//		int status1= dao.saveEmployee(new Employee(102,"Rohan",13000));
//		System.out.println(status1); 
//		int status2= dao.saveEmployee(new Employee(103,"Sohan",15000));
//		System.out.println(status2); 
//		int status3= dao.saveEmployee(new Employee(104,"Sonali",16000));
//		System.out.println(status3); 
		
//	    int status1=dao.updateEmployee(new Employee(101,"Hello",8000));
//		System.out.println(status1); 
		
		
		Employee e=new Employee();
		e.setId(101);
		int status2=dao.deleteEmployee(e);
    System.out.println(status2);
		
	}

}

		
	


