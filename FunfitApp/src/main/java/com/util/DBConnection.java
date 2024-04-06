package com.util;


	
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	public class DBConnection {
	    private static final String URL = "jdbc:mysql://localhost:3306/gym_management";
	    private static final String USERNAME = "root";
	    private static final String PASSWORD = "Veen@1234567";

	    public static Connection getConnection() throws SQLException {
	        return DriverManager.getConnection("com.mysql.jdbc.Driver", "root", "Veen@1234567");
	    }
	}



