<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" errorPage="DemoShowErrorPage.jsp"%><!-- Directive tag -->

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@
        include file="DemoIncludePage.jsp"
         %>
     
	<%!int x = 10; %> <!-- Declaration tag -->

	<%
		out.println("Sciplet tag");
		//x = x / 0; Demo for exception
	%><br>

	<%= x %>	<!-- Expression tag -->

</body>
</html>
