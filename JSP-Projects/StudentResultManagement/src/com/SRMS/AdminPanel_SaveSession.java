package com.SRMS;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/AdminPanel_SaveSession")
public class AdminPanel_SaveSession extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname = request.getParameter("uname");
		String pswd = request.getParameter("pswd");
		
		if( DAO.DAOAdminLogin.check(uname, pswd) ){
			
			HttpSession session = request.getSession();
			session.setAttribute("uname",uname);
			session.setAttribute("pswd", pswd);
			
			response.sendRedirect("AdminPage.jsp");			
		}
		else
		{
			response.sendRedirect("AdminLoginPage.html");// error page
		}
	}

}
