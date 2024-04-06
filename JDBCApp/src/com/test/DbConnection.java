package com.test;

import java.sql.*;


public class DbConnection {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//loading driver
			 Connection conObj=DriverManager.getConnection("jdbc:mysql://localhost:3306/tesladb","root","Veen@1234567");
		if(conObj!=null)
			System.out.println("Db connected");
		} 
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

}
