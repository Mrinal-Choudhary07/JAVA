package com.DemoLoginJSP;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/welcome")
public class Welcome extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Authentication

		String uname = request.getParameter("uname");
		String pswd = request.getParameter("pswd");

		if (uname.equals("mrinal") && pswd.equals("mrinal")) {
			
			HttpSession session = request.getSession();
			session.setAttribute("NAME", uname);
			session.setAttribute("PASSWORD", pswd);			
			
			response.sendRedirect(request.getContextPath()+"/DemoLoginJSP/WelcomePage.jsp");
		}
		else{
			response.sendRedirect(request.getContextPath()+"/DemoLoginJSP/LoginPage.jsp");
		}

	}
}
