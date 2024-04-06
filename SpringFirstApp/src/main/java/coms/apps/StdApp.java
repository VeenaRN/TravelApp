package coms.apps;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;

import coms.beans.Student;
 
public class StdApp {

	public static void main(String[] args) {
		Resource rs=new ClassPathResource("configure.xml");
		
		//BeanFactory factory=new XmlBeanFactory(rs);
		BeanFactory factory =new XmlBeanFactory(rs);
		
		Student std=(Student)factory.getBean("stdObj");
		
		System.out.println("Roll no:"+std.getRollno());
		System.out.println("Student name:"+std.getSname());
		System.out.println("Course:"+std.getCourse());
		System.out.println("Fees:"+std.getFees());
	}

}
