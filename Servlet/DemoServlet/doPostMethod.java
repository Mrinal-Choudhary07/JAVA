package DemoServlet;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class doPostMethod
 */
@WebServlet("/doPostMethod")
public class doPostMethod extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String msg = "doPost :- ";

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Addition of two num
		int a = Integer.valueOf(request.getParameter("num1"));
		int b = Integer.valueOf(request.getParameter("num2"));

		// Checkboxes with getParameter()
		String check1 = request.getParameter("check1");
		String check2 = request.getParameter("check2");
		String check3 = request.getParameter("check3");
		String check4 = request.getParameter("check4");

		// Checkboxes with getParameterNames() and getParameteValues()
		Enumeration<String> arr = request.getParameterNames();

		while (arr.hasMoreElements()) {

			String paramName = arr.nextElement();
			System.out.println(paramName);

			String paramValue = request.getParameter(paramName);
			System.out.println(paramValue);

		}

		PrintWriter out = response.getWriter();

		// We can use HTML here also
		out.print("<h1>" + msg + " " + check1 + " " + check2 + " " + check3 + " " + check4 + "</h1>");

	}

}
