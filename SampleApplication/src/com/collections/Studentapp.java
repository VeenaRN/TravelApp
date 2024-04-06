package com.collections;

import java.util.ArrayList;
import java.util.*;

public class Studentapp {

	public static void main(String[] args) {
		List<Student> stdlst=new ArrayList<Student>();
		
		Student std=new Student("Veena",1001);
		stdlst.add(std);
		 std=new Student("Teena",1002);
		stdlst.add(std);
		
		System.out.println(stdlst);


		System.out.println("-----------");
	for(Student s:stdlst)
	{
	System.out.println(s.getRollno()+ "\t" +s.getSname());	
	}
	System.out.println("-----------");
	Iterator itr=stdlst.iterator();
	
	while(itr.hasNext())
	{
		Student st=(Student)itr.next();
		System.out.println(st.getRollno()+"\t"+st.getSname());
	}
	}
	}
