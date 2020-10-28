<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="DAO.CreateConnection"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%
	int roll = Integer.valueOf(request.getParameter("roll"));
	boolean flag = false;
	try {
		Connection connection = CreateConnection.getConnection();
		Statement stmt = connection.createStatement();
		ResultSet set = stmt.executeQuery("select roll from addstudent");
		while (set.next()) {
			if (set.getInt("roll") == roll)
				flag = true;
		}
		if (!flag)
			response.sendRedirect("Student.html");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Admin-Panel</title>
<link rel="stylesheet" href="fontawesome/css/all.min.css">
<!-- https://fontawesome.com/ -->
<link
	href="https://fonts.googleapis.com/css2?family=Source+Sans+Pro&display=swap"
	rel="stylesheet">
<!-- https://fonts.google.com/ -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/templatemo-video-catalog.css">
</head>
<body class="b2">
	<div class="tm-page-wrap mx-auto">
		<div class="position-relative">
			<div class="potition-absolute tm-site-header">
				<div class="container-fluid position-relative">
					<div class="row">
						<a href="index.html" class=""> <img src="img/logo.png"
							width="100" height="100">
						</a>
						<div class="col-5 col-md-8 ml-auto mr-0">
							<div class="tm-site-nav">
								<nav class="navbar navbar-expand-lg mr-0 ml-auto"
									id="tm-main-nav">
								<button
									class="navbar-toggler tm-bg-black py-2 px-3 mr-0 ml-auto collapsed"
									type="button" data-toggle="collapse" data-target="#navbar-nav"
									aria-controls="navbar-nav" aria-expanded="false"
									aria-label="Toggle navigation">
									<span> <i class="fas fa-bars tm-menu-closed-icon"></i> <i
										class="fas fa-times tm-menu-opened-icon"></i>
									</span>
								</button>
								</nav>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="mx-auto tm-content-container">
			<h1 align="center"
				style="font-size: 80px; font-family: courier; font-weight: bold; padding-bottom: 20px; color: black;">Result</h1>
			<hr style="border-color: black; margin: 0px;">

			<div class="div"
				style="display: block; float: left; background-color: white; border: 2px solid black;">
				<br>
				<%
					try {
							PreparedStatement ps = connection.prepareStatement(
									"select * from result JOIN addstudent WHERE result.roll = ? and addstudent.roll = ?");
							ps.setInt(1, roll);
							ps.setInt(2, roll);
							set = ps.executeQuery();
							set.next();
							
							int total = set.getInt("sub1")+set.getInt("sub2")+set.getInt("sub3");
							int per = (total*100)/450;
				%>
				<table cellpadding="15" align="left"
					style="font-size: 25px;">
					<tr>
						<td class="td-text" style="font-size: 30px; font-weight: bold;">Student-Name:</td>
						<td><% out.print(set.getString("name")); %></td>
						<td class="td-text" style="font-size: 30px;  font-weight: bold;">Mother-Name:</td>
						<td><% out.print(set.getString("mother")); %></td>
						<td class="td-text" style="font-size: 30px;  font-weight: bold;">Roll-No:</td>
						<td><% out.print(roll); %></td>
					</tr>
					<tr>
						<td class="td-text" style="font-size: 30px;  font-weight: bold;">Exam category:</td>
						<td>Regular</td>
						<td class="td-text" style="font-size: 30px;  font-weight: bold;">Medium:</td>
						<td>English</td>
					</tr>
					<tr>
					</tr>
					<tr>
						<td class="td-text" style="font-size: 30px;  font-weight: bold;">College-Name:</td>
						<td><% out.print(set.getString("colg")); %></td>
					</tr>
				</table>
			</div>

			<div class="div"
				style="display: block; float: left; background-color: transparent;">
				<br>
				<table cellpadding="40" align="center"
					style="font-size: 22px; font-weight: bold; background-color: white; border: 2px solid black;"
					border="1">
					<tr bgcolor="#707070">
						<td class="td-text" style="font-size: 30px; font-weight: bolder; color:white;"
							align="center">Sr-No</td>
						<td class="td-text" style="font-size: 30px; font-weight: bolder;color:white;"
							colspan="2" align="center">Subjects</td>
						<td class="td-text" style="font-size: 30px; font-weight: bolder;color:white;"
							align="center">Total-Marks</td>
						<td class="td-text" style="font-size: 30px; font-weight: bolder;color:white;"
							align="center">Minimum-Marks</td>
						<td class="td-text" style="font-size: 30px; font-weight: bolder;color:white;"
							align="center">Internal-Marks</td>
						<td class="td-text" style="font-size: 30px; font-weight: bolder;color:white;"
							align="center">Marks-Obtained</td>
						<td class="td-text" style="font-size: 30px; font-weight: bolder;color:white;"
							align="center">Total</td>
					</tr>
					<tr>
						<td>01</td>
						<td colspan="2"><% out.print(set.getString("sub1name")); %></td>
						<td>150</td>
						<td>60</td>
						<td>25</td>
						<td><% out.print(set.getInt("sub1")); %></td>
						<td><% int s1 = set.getInt("sub1");
						       out.print(s1+25);%></td>
					</tr>
					<tr>
						<td>02</td>
						<td colspan="2"><% out.print(set.getString("sub2name")); %></td>
						<td>150</td>
						<td>60</td>
						<td>25</td>
						<td><% out.print(set.getInt("sub2")); %></td>
						<td><% int s2 = set.getInt("sub2");
						       out.print(s2+25);%></td>
					</tr>
					<tr>
						<td>03</td>
						<td colspan="2"><% out.print(set.getString("sub3name")); %></td>
						<td>150</td>
						<td>60</td>
						<td>25</td>
						<td><% out.print(set.getInt("sub3")); %></td>
						<td><% int s3 = set.getInt("sub3");
						       out.print(s3+25);%></td>
					</tr>
					<tr>
						<td colspan="7" class="td-text" style="font-size: 30px;"
							align="center">Grand-Total</td>
						<td><%=total+"/450" %></td>
					</tr>
					<tr>
						<td colspan="7" class="td-text" style="font-size: 30px;"
							align="center">Percentage</td>
						<td>
						<%=per+"%" %>
						<% if(per > 34)
							out.print("PASS");
						   else
							out.print("FAIL");
						%>						   
						</td>
					</tr>
				</table>
				<%
					} catch (Exception e) {
							e.printStackTrace();
						}
				%>
				</form>
			</div>
</body>
<%
	} catch (Exception e) {
		e.printStackTrace();
	}
%>
</html>
