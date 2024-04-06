package com.test;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class AddingRowDynamic {

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
		
		String inscmd="Insert into Student values("+rno+",'"+sname+"','"+course+"',"+fee+")";
		System.out.println(inscmd);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//loading driver
			 Connection conObj=DriverManager.getConnection("jdbc:mysql://localhost:3306/Tesladb","root","Veen@1234567");
			 
			 Statement stmt=conObj.createStatement();
			stmt.executeUpdate(inscmd);
			 System.out.println("Row inserted");
		} 
		catch (Exception e)
		{
			System.out.println(e);
		}

	}

}
