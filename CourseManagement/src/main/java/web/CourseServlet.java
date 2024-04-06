package web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.CourseDao;

import model.Course;

/**
 * Servlet implementation class CourseServlet
 */
@WebServlet("/CourseServlet")
public class CourseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private CourseDao dao;  
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	
    public CourseServlet() {
        super();
        // TODO Auto-generated constructor stub
       
        
    }
    
    @Override
    public void init() throws ServletException {
        super.init();
        try {
            dao = new CourseDao();
        } catch (ClassNotFoundException | SQLException e) {
            throw new ServletException("Error initializing CourseDao", e);
        }
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		RequestDispatcher view =request.getRequestDispatcher("view.jsp");
		request.setAttribute("courses",dao.getAllCourses());
		view.forward(request, response);
		
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		Course course=new Course();
		
		course.setCoursename(request.getParameter("coursename"));
		course.setFees(Integer.parseInt(request.getParameter("fees")));
		
		//course.setCoursename(request.getParameter("fees"));
		course.setCategory(request.getParameter("category"));
		course.setDuration(Integer.parseInt(request.getParameter("duration")));
		String courseid=request.getParameter("courseid");
		
		if(courseid==null || courseid.isEmpty()) {
			dao.addCourse(course);
		}
		else {
			course.setCourseid(Integer.parseInt(courseid));
			
		}
	}

}
