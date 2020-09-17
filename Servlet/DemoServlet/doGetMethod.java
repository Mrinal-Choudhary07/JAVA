package DemoServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Sample")
public class doGetMethod extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
	private String msg="doGet :- ";       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub		
		
		// doGet()
//		String a = request.getParameter("num1");
//		String b = request.getParameter("num2");
//		
//		int c = Integer.valueOf(a)+Integer.valueOf(b);
//		
//		PrintWriter out = response.getWriter();
//		
//		out.print(msg+" "+c);
		
		PrintWriter out = response.getWriter();
		// 1) getting values from RequestDispatcher
		//out.println("RequestDispatcher => "+ request.getAttribute("s") );
		
		// 2) getting values from sendRedirect URL rewriting
		//out.println("sendRedirect => "+ request.getParameter("str") );
		
		// 3) getting values from sendRedirect Session 
		/*HttpSession session = request.getSession();		
		out.println("Session => "+session.getAttribute("str"));*/
		
		// 4) getting values from sendRedirect Cookies
		Cookie cookie[] = request.getCookies();
		for( Cookie c : cookie )
			if( c.getName().equals("str") )
				out.println((String)c.getValue());
	}
}
