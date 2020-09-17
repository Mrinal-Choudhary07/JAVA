package DemoServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletConfigAndContext
 */
@WebServlet("/ServletConfigAndContext")
public class ServletConfigAndContext extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		PrintWriter writer = response.getWriter();
		ServletContext ctxt = request.getServletContext();
		writer.println( "ServletContext => "+ctxt.getInitParameter("name") );
		
		ServletConfig con = getServletConfig();
		writer.println( "ServletConfig => "+con.getInitParameter("name") );
		
	}

}
