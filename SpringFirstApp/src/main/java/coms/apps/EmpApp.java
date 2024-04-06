package coms.apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import coms.beans.Employee;

public class EmpApp {

	public static void main(String[] args) {
		
		
		ApplicationContext factory=new ClassPathXmlApplicationContext("ConfigEmp.xml"); 	
		Employee emp=(Employee)factory.getBean("empObj");
		emp.printEmp();

	}

}
