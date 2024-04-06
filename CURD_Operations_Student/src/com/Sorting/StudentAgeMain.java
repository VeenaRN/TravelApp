package com.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentAgeMain {

	public static void main(String[] args) {
		
		  List<StudentAge> students = new ArrayList<StudentAge>();
	        students.add(new StudentAge("Alice", 25,"Mangalore",1400));
	        students.add(new StudentAge("Bob", 30,"Udupi",1000));
	        students.add(new StudentAge("Charlie", 20,"Russia",2000));
	        students.add(new StudentAge("Charlie", 10,"Udupi",1200));
	        students.add(new StudentAge("Adam", 12,"Bangalore",1600));

	        Collections.sort(students); 
	        for(StudentAge s:students) {

	        System.out.println(s.getName()+"\t"+s.getAge()+"\t"+s.getArea()+"\t"+s.getMoney());
	    }
	
	}
}
