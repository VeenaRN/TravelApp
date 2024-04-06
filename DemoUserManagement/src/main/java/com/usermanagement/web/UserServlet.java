package com.usermanagement.web;



import java.io.IOException;


import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.usermanagement.bean.User;
import com.usermanagement.dao.UserDao;



/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     private UserDao userDao;  
   

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init() throws ServletException {
		userDao=new UserDao();
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	String action=request.getServletPath();
	switch(action){
		case "/newuser":
		showNewForm(request,response);
			break;
			
		case "/insertuser":
		   
		try {
			insertUser(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		       break; 

	
	
		case "/deleteuser":
		   
		try {
			deleteUser(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		    
		    break;

		
		case "/edituser":
		   
		try {
			showEditForm(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		    
		    break;
		
		case "/updateuser":
		   
		try {
			updateUser(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		     
		    break;
		

		case "/list":
		try {
			listUser(request,response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	}
	
	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("user-form.jsp");
		dispatcher.forward(request, response);
	}
	//insert user
	private void insertUser(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		
		int batchid  = Integer.parseInt(request.getParameter("batchid"));
		String address = request.getParameter("address");
		
		User newUser = new User(name,age,email,phone,batchid,address );
		
		userDao.insertUser(newUser);
		response.sendRedirect("list");
	}
	
	
	//delete user
	private void deleteUser(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		int participant_id  = Integer.parseInt(request.getParameter("participant_id"));
		try {
		userDao.deleteUser(participant_id);
		}catch (Exception e) {
			e.printStackTrace();
		}
		response.sendRedirect("list");

	}
	//edit
	
	private void showEditForm(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException 
	{
		
		int participant_id = Integer.parseInt(request.getParameter("participant_id"));
		
		User existingUser;
		try {
			existingUser=userDao.selectUser(participant_id);
			RequestDispatcher dispatcher = request.getRequestDispatcher("user-form.jsp");
			request.setAttribute("user", existingUser);
			dispatcher.forward(request, response);
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

	
	private void updateUser(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		int participant_id = Integer.parseInt(request.getParameter("participant_id"));
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		
		int batchid  = Integer.parseInt(request.getParameter("participant_id"));
		String address = request.getParameter("address");
		
		User user = new User(participant_id,name,age,email,phone,batchid,address);
		userDao.updateUser(user);
		response.sendRedirect("list");
	}
	
	
	//default
	private void listUser(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		try {
		List<User> listUser = userDao.selectAllUsers();
		request.setAttribute("listUser", listUser);
		RequestDispatcher dispatcher = request.getRequestDispatcher("user-list.jsp");
		dispatcher.forward(request, response);
	}catch (Exception e) {
		e.printStackTrace();
	}
	
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	











//
//import java.io.IOException;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
///**
// * Servlet implementation class UserServlet
// */
//@WebServlet("/UserServlet")
//public class UserServlet extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//       
//    /**
//     * @see HttpServlet#HttpServlet()
//     */
//    public UserServlet() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}
//
//}
