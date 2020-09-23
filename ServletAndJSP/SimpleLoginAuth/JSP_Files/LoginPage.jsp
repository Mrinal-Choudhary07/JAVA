<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
h1 {
	font-family: algerian;
	font-size: 50px;
	color: white;
}
</style>
</head>
<body bgcolor="teal">

	<center>
		<h1>Login Page</h1>
	</center>

	<form action="../welcome">

		<table cellspacing="10">
			<tr>
				<td style="color: white; font-size: 20px;">Username</td>
				<td><input type="text" name="uname"></td>
			</tr>
			<tr>
				<td style="color: white; font-size: 20px;">Password</td>
				<td><input type="password" name="pswd"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="LOGIN"></td>
			</tr>
		</table>

	</form>

</body>
</html>