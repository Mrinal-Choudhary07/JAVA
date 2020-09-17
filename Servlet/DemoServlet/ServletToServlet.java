package DemoServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.Session;

/**
 * Servlet implementation class RequestDispatcher
 */
@WebServlet("/RequestDispatcher")
public class ServletToServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String str = request.getParameter("radio");

		// We can call servlet from servlet by using
		// 1) RequestDispatcher(interface)
		/*
		 * request.setAttribute("s", str);
		 * 
		 * javax.servlet.RequestDispatcher rd =
		 * request.getRequestDispatcher("DemoRequestDispatcher");
		 * rd.forward(request, response);
		 */

		// 2) sendRedirect() with URL rewriting
		// response.sendRedirect("DemoSendRedirect?str=" + str);

		// 3) Session
		/*
		 * HttpSession session = request.getSession();
		 * session.setAttribute("str", str);
		 * response.sendRedirect("DemoSendRedirect");
		 */

		// 4) Cookies
		 Cookie cookie = new Cookie("str", str);
		response.addCookie(cookie);
		response.sendRedirect("DemoSendRedirect");

	}
}
