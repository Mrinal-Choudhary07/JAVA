package com.SRMS;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.DAOAddResult;

@WebServlet("/AddResult")
public class AddResult extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int roll = Integer.parseInt(request.getParameter("roll"));

		String group = request.getParameter("Result-Sub");
		group = group.replace("-", " ");
		String arr[] = group.split(" ", 3);
		
		//for( String i : arr ) System.out.print(i+" "); //Dry-Run

		int sub1 = Integer.parseInt(request.getParameter("s1"));
		int sub2 = Integer.parseInt(request.getParameter("s2"));
		int sub3 = Integer.parseInt(request.getParameter("s3"));

     	DAOAddResult.addDataIntoResult(  roll, arr, sub1, sub2, sub3 );
     	
     	response.sendRedirect("AdminPage.jsp");

	}
}
