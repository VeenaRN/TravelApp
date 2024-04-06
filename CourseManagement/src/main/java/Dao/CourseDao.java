package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.mysql.cj.xdevapi.Statement;

import db.DbConnect;
import model.Course;

public class CourseDao {
	
	Connection connection;
	
	 public CourseDao() throws ClassNotFoundException, SQLException{
		
		connection=DbConnect.getConnection();
		
	}
	
	public void addCourse(Course course) {
		
		try {
			
			PreparedStatement pst=connection.prepareStatement("insert into course(coursename,fees,category,duration)"
			+" values(?,?,?,?)");
			
			pst.setString(1, course.getCoursename());
			pst.setInt(2, course.getFees());
			pst.setString(3, course.getCategory());
			pst.setInt(4, course.getDuration());
			
			pst.executeUpdate();
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public List<Course> getAllCourses(){
		
		List<Course> courses=new ArrayList();
		try {
			java.sql.Statement statement = connection.createStatement();
			ResultSet rs=statement.executeQuery("select*from course");
		
			while(rs.next()) {
				Course course=new Course();
				course.setCourseid(rs.getInt("courseid"));
				course.setCoursename(rs.getString("coursename"));
				course.setFees(rs.getInt("fees"));
				course.setCategory(rs.getString("category"));
				course.setDuration(rs.getInt("duration"));
				
				courses.add(course);
			}
	
	}catch(SQLException e) {
		e.printStackTrace();
	}
	return courses;

}
}