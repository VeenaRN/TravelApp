package com.test;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class AddingRowPewpared {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Roll Number");
		int rno=sc.nextInt();
		System.out.println("Name");
		String sname=sc.next();
		System.out.println("Course");
		String course=sc.next();
		System.out.println("fees");
		float fee=sc.nextFloat();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//loading driver
			 Connection conObj=DriverManager.getConnection("jdbc:mysql://localhost:3306/tesladb","root","Veen@1234567");
			 
			 PreparedStatement ps=conObj.prepareStatement("Insert into Student values(?,?,?,?)");
			 ps.setInt(1,rno);
			 ps.setString(2, sname);
			 ps.setString(3, course);
			 ps.setFloat(4, fee);
			 ps.executeUpdate(); 
			 System.out.println("Row inserted");
		} 
		catch (Exception e)
		{
			System.out.println(e);
		}

	}

}
