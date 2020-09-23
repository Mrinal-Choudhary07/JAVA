<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%!String uname, pswd;%>

	<%
		uname = (String) session.getAttribute("NAME");
		pswd = (String) session.getAttribute("PASSWORD");

		if (uname == null || pswd == null) {

			response.sendRedirect("NotLoginErrorPage.jsp");

		} else {
	%><h1>Welcome Page</h1>
	<br>
	<br>
	<a href="GalleryPage.jsp">GALLERY</a>
	<br>
	<br>
	<form action="../logout">
		<input type="submit" value="LOGOUT">
	</form>
	<%
		}
	%>
</body>
</html>