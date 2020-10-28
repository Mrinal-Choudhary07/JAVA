<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%
	//response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
	session = request.getSession();
	String uname = (String) session.getAttribute("uname");
	String pswd = (String) session.getAttribute("pswd");

	if (uname != null && pswd != null) {
		response.sendRedirect("AdminPage.jsp");
	} else {
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Admin-Login-Panel</title>
<link rel="stylesheet" href="fontawesome/css/all.min.css">
<!-- https://fontawesome.com/ -->
<link
	href="https://fonts.googleapis.com/css2?family=Source+Sans+Pro&display=swap"
	rel="stylesheet">
<!-- https://fonts.google.com/ -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/templatemo-video-catalog.css">
</head>
<body class="b1">
	<br>
	<div class="mx-auto px-3">
		<center>
			<img src="img/login.png" width="200" height="200">
		</center>
	</div>
	<br>
	<center>
		<form action="AdminPanel_SaveSession" method="post">
			<div class="login-box">
				<div class="input-icons">
					<h2 style="font-family: courier; font-weight: bold; color: black;">Login</h2>
					<br> <i class="fa fa-user icon"></i> <input type="text"
						name="uname" placeholder="Username"> <br> <br> <i
						class="fa fa-key icon"></i> <input type="password" name="pswd"
						placeholder="Password"> <br> <br> <br>
					<button class="login">Login</button>
				</div>
				<div>
					<br>
					<center>
						<a href="index.html" style="color: black; font-size: 30px;"> <i
							class="fa fa-arrow-left" aria-hidden="true"> Back </i>
						</a>
					</center>
				</div>
			</div>
		</form>
	</center>
</body>
<%
	}
%>
</html>