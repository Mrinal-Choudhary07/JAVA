<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%
    session = request.getSession();
    session.removeAttribute("uname");
    session.removeAttribute("pswd");
    
    response.sendRedirect("index.html");
    %>    