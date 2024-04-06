package com.application;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.dmlOperations.StudentOperations;
import com.models.Student;

public class StdApp {

	public static void main(String[] args) throws Exception {
		Student std = null;
		StudentOperations  soper = new StudentOperations();
		Scanner sc = new Scanner(System.in);
		
		int rno = 0;
		while(true)
		{
			System.out.println("1. Add Student\n2. View All Students\n3. Search Student\n4. Update Student \n5. Delete Student\n6. Exit");
			System.out.println("Pick Ur Choice : ");
			int ch = sc.nextInt();
			
			switch(ch)
			{
			case 1:
				std = new Student();
				System.out.println("Roll Number : ");
				std.setRollno(sc.nextInt());
				System.out.println("Student Name : ");
				std.setStdname(sc.next());
				System.out.println("Course Name : ");
				std.setCourse(sc.next());
				System.out.println("Course Fees : ");
				std.setFees(sc.nextFloat());
				
				if(soper.AddNewStudent(std).equals("Success"))
					System.out.println("New Student is Added...");
				else
					System.out.println(" New Student is not Added...");
				break;
			case 2:
				List<Student> studentsinfo = soper.ViewAllStudents();
				if(studentsinfo.isEmpty())
					System.out.println("No Student Info in table");
				else
				{
					for(Student s : studentsinfo)
					{
						System.out.println("Roll Number : " + s.getRollno());
						System.out.println("Student Name : " + s.getStdname());
						System.out.println("Course Name : " + s.getCourse());
						System.out.println("Course Fees : " + s.getFees());
						System.out.println("--------------------------------");
					}
				}
				break;
			case 3:
				System.out.println("Enter Roll Number : ");
				rno = sc.nextInt();
				std = soper.SearchStudent(rno);
				if(std!=null)
				{
					System.out.println("Roll Number : " + std.getRollno());
					System.out.println("Student Name : " + std.getStdname());
					System.out.println("Course Name : " + std.getCourse());
					System.out.println("Course Fees : " + std.getFees());					
				}
				else
					System.out.println("Student Not Found....");
				break;
			case 4:
				System.out.println("Enter Roll Number : ");
				rno = sc.nextInt();
				std = soper.SearchStudent(rno);
				if(std!=null)
				{
					System.out.println("Student Present Name : " + std.getStdname());
					System.out.println("Enter new name to Modify ");
					std.setStdname(sc.next());
					if(soper.UpdateStudentName(std).equals("Success"))
						System.out.println("Student Name is Modified");
				}
				else
					System.out.println("Student Not Found....");
				break;				
			case 5:
				System.out.println("Enter Roll Number : ");
				rno = sc.nextInt();
				std = soper.SearchStudent(rno);
				if(std!=null)
				{
					System.out.println("Are u sure to delete(y/n)");
					String sdel = sc.next();
					if(sdel.equalsIgnoreCase("Y"))
					{
						if(soper.DeleteStudent(rno).equals("Success"))
							System.out.println("Student is Deleted....");
					}
				}
				else
					System.out.println("Student Not Found....");
				break;
			case 6:
				System.out.println("thanks for using this app");
				System.exit(0);
			} 
		}
	}
}

