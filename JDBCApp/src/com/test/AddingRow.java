package com.test;
import java.sql.*;
public class AddingRow {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//loading driver
			 Connection conObj=DriverManager.getConnection("jdbc:mysql://localhost:3306/tesladb","root","Veen@1234567");
			 Statement stmt=conObj.createStatement();
			 stmt.executeUpdate("Insert into Student values(1007,'Veena','Java',15000.00)");
			 System.out.println("Row inserted");
			} 
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
