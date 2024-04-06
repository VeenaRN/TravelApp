package com.estore.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet({ "/LoginServlet", "/Login" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		//read data from request object
//		String email=request.getParameter("txtEmail");
//		String password=request.getParameter("txtPassword");
//		
//		System.out.println("User details:"+email+" "+password);
//		
//		response.setContentType("text/html");
//		
//		String loginTimeStamp=new Date().toString();
//		String htmlResponse="<center><h3> Welcome "+email+"</h3><p>You logged in at "+loginTimeStamp+"</p></center>";
//		PrintWriter out =response.getWriter();
//		out.print(htmlResponse);
//	
//	}
    
    @Override
    protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
    	super.doGet(req, resp);
    }

}
