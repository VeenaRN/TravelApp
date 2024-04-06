package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BatchServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Handle GET request for batches
        response.setContentType("text/html");
        response.getWriter().println("<h1>GET Request Received for Batches</h1>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Handle POST request for batches
        response.setContentType("text/html");
        response.getWriter().println("<h1>POST Request Received for Batches</h1>");
    }

    protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Handle PUT request for batches
        response.setContentType("text/html");
        response.getWriter().println("<h1>PUT Request Received for Batches</h1>");
    }

    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Handle DELETE request for batches
        response.setContentType("text/html");
        response.getWriter().println("<h1>DELETE Request Received for Batches</h1>");
    }
}

