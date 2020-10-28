package com.SRMS;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddStudent")
public class AddStudent extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Enumeration<String> par = request.getParameterNames();
		ArrayList<String> val = new ArrayList<>(); 
		while(par.hasMoreElements())		
			val.add( request.getParameter( par.nextElement() ) );
		
//		for( String s : val )     // Dry-Run
//			System.out.println( s );
		
		DAO.DAOAddStudent.insertIntoAddStudent(val) ;
		response.sendRedirect("AdminPage.jsp");
		
	}
}
