package com.dmlOperations;
import java.util.*;
import java.sql.*;

import com.connections.DbConnections;
import com.models.Student;

import java.sql.*;
public class StudentOperations {
	
	private Connection connection=null;
	private PreparedStatement p_stmt;
	
	public StudentOperations() throws Exception
	{
		connection =	DbConnections.getConnection();
	}
	
	public String AddNewStudent(Student std) throws SQLException
	{
		String res = "Err";
		try {
			p_stmt = connection.prepareStatement("Insert into Student(rollno, stdname, course, fees) values(?,?,?,?)");
			p_stmt.setInt(1, std.getRollno());
			p_stmt.setString(2, std.getStdname());
			p_stmt.setString(3, std.getCourse());
			p_stmt.setFloat(4, std.getFees());
			
			int ch = p_stmt.executeUpdate();
			if(ch>=1)
				res = "Success";
			
		} catch (Exception e) {
			res = "Err";
			System.out.println(e);
		}
		return res;
	}
	
	public List<Student> ViewAllStudents()
	{
		List<Student>  stdlist = new ArrayList<Student>();
		Student std = null;
		try {
			p_stmt = connection.prepareStatement("Select * from Student");
			ResultSet stdset = p_stmt.executeQuery();
			while(stdset.next())
			{
				std = new Student();
				std.setRollno(stdset.getInt("rollno"));
				std.setStdname(stdset.getString("stdname"));
				std.setCourse(stdset.getString("course"));
				std.setFees(stdset.getFloat("fees"));
				stdlist.add(std);
			}
		} catch (Exception e) {
			
		}
		return stdlist;
	}
	
	public Student SearchStudent(int rno)
	{
		Student std = null;
		try {
			p_stmt = connection.prepareStatement("select * from Student where rollno=?");
			p_stmt.setInt(1, rno);
			ResultSet  stdSet =  p_stmt.executeQuery();
			if(stdSet.next())
			{
				std = new Student();
				std.setRollno(stdSet.getInt("rollno"));
				std.setStdname(stdSet.getString("stdname"));
				std.setCourse(stdSet.getString("course"));
				std.setFees(stdSet.getFloat("fees"));
			}
			
		} catch (Exception e) {
			
		}
		return std;
	}

	public String UpdateStudentName(Student std) throws SQLException
	{
		String res = "Err";
		try {
			p_stmt = connection.prepareStatement("Update Student set stdname=? where rollno=?");
			p_stmt.setString(1, std.getStdname());
			p_stmt.setInt(2, std.getRollno());
			int ch = p_stmt.executeUpdate();
			if(ch>=1)
				res = "Success";
			
		} catch (Exception e) {
			res = "Err";
			System.out.println(e);
		}
		return res;
	}
	
	public String DeleteStudent(int rno) throws SQLException
	{
		String res = "Err";
		try {
			p_stmt = connection.prepareStatement("Delete from Student where rollno=?");
			p_stmt.setInt(1, rno);
			int ch = p_stmt.executeUpdate();
			if(ch>=1)
				res = "Success";
			
		} catch (Exception e) {
			res = "Err";
			System.out.println(e);
		}
		return res;
	}
}
