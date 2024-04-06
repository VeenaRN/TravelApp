package com.connections;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

public class DbConnections {
	
	public static Connection getConnection() throws Exception
	{
		
		FileInputStream fis=new FileInputStream("C:\\Javas\\CURD_Operations_Student\\src\\com\\application\\DbConnection.properties");
		Properties prop =new Properties();
		prop.load(fis);
		String dname=prop.getProperty("driverName");
		String uname=prop.getProperty("userame");
		String pwd=prop.getProperty("password");
		String cString=prop.getProperty("connString");
		
		Connection conObj=null;
		
		
	try {
		Class.forName(dname);//loading driver
		  conObj=DriverManager.getConnection(cString,uname,pwd);
		  
	}catch (Exception e) {
		conObj=null;
		System.out.println(e);
	}
	return conObj;
	}

}
