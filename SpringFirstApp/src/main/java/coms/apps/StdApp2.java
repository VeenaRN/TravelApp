package coms.apps;

import coms.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StdApp2 {

	public static void main(String[] args) {
		
		
	ApplicationContext factory=new ClassPathXmlApplicationContext("Configure.xml"); 	
		
		
	Student std=(Student)factory.getBean("stdObj");
		
		System.out.println("Roll no:"+std.getRollno());
		System.out.println("Student name:"+std.getSname());
		System.out.println("Course:"+std.getCourse());
		System.out.println("Fees:"+std.getFees());

	}

}
