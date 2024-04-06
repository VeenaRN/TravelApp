package coms.apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import coms.beans.Person;
import coms.beans.Student;

public class PersonApp {

	public static void main(String[] args) {
		
		
		ApplicationContext factory=new ClassPathXmlApplicationContext("Configure.xml"); 	
		Person person=(Person)factory.getBean("perObj");
		person.PersonDetails();
		
	}

	}


