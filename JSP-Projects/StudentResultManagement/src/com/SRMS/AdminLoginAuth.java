package com.SRMS;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/AdminLoginAuth")
public class AdminLoginAuth extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.getWriter().print("HEELO");

//		HttpSession session = request.getSession();
//		String userSession = (String) session.getAttribute("uname");
//		String pswdSession = (String) session.getAttribute("pswd");
//		
//		System.out.println(userSession+" "+pswdSession);
//
//		if (userSession == null || pswdSession == null) {
//			response.sendRedirect("AdminLoginPage.html");
//		} else {
//			if (DAO.DAOAdminLogin.check(userSession, pswdSession)) {
//				response.sendRedirect("AdminPage.jsp");
//			} else {
//				response.sendRedirect("AdminLoginPage.html");
//			}
//		}
	}

}
