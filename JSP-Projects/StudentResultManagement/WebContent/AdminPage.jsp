<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="DAO.CreateConnection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
	session = request.getSession();
	String uname = (String) session.getAttribute("uname");
	String pswd = (String) session.getAttribute("pswd");

	if (uname == null || pswd == null) {
		response.sendRedirect("AdminLoginPage.jsp");
	} else {
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
<style type="text/css">
.active2 {
	background-color: black;
	border-radius: 10px;
	height: 80px;
	cursor: pointer;
	color: gold;
	outline: none;
	font-weight: bold;
}
</style>
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
								<div class="navbar-collapse nav" id="navbar-nav">
									<ul class="navbar-nav text-uppercase">
										<li class="nav-item "><a class="nav-link tm-nav-link"
											href="index.html
                                                "
											style="color: black; font-weight: bold; font-size: 25px;">Home</a>
										</li>
										<li class="nav-item active"><a
											class="nav-link tm-nav-link" href="#"
											style="color: black; font-weight: bold; font-size: 25px;">Admin</a>
										</li>
										<li class="nav-item"><a class="nav-link tm-nav-link"
											href="Logout.jsp"
											style="color: black; font-weight: bold; font-size: 25px;">Logout</a>
										</li>
									</ul>
								</div>
								</nav>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="mx-auto tm-content-container">
			<br> <br> <br> <br>
			<h1 align="center"
				style="font-size: 80px; font-family: courier; font-weight: bold; padding-bottom: 20px; color: black;">Admin-Panel</h1>
			<hr style="border-color: black; margin: 0px;">
			<br>


			<div class="admin-left-side-menu" id="myDIV">
				<ul style="list-style-type: none; font-family: consolas">
					<li class="li">
						<button onclick="addstu();" class="button active2">Add-Student</button>
					</li>
					<li class="li">
						<button onclick="addres();" class="button ">Add-Result</button>
					</li>
					<li class="li">
						<button onclick="viewstu();" class="button ">View-Student</button>
					</li>
					<li class="li">
						<button onclick="viewres();" class="button ">View-Result</button>
					</li>
				</ul>
			</div>

			<div>
				<div id="addstu" class="div" style="display: block;">
					<form action="AddStudent">
						<br>
						<table cellpadding="15" align="center">
							<tr>
								<td class="td-text">Roll-No:</td>
								<td><input type="text" name="roll"></td>
							</tr>
							<tr>
								<td class="td-text">Full-Name:</td>
								<td><input type="text" name="sname"></td>
							</tr>
							<tr>
								<td class="td-text">Mother-Name:</td>
								<td><input type="text" name="mname"></td>
							</tr>
							<tr>
								<td class="td-text">Year:</td>
								<td><select name="year">
										<option>1st year</option>
										<option>2nd year</option>
										<option>3rd year</option>
								</select></td>
							</tr>
							<tr>
								<td class="td-text">Subjects:</td>
								<td><select name="sub">
										<option>PCsM</option>
										<option>ECsM</option>
										<option>SCsM</option>
										<option>PCM</option>
										<option>PCG</option>
										<option>PEM</option>
								</select></td>
							</tr>
							<tr>
								<td class="td-text">College:</td>
								<td><input type="text" name="colg"></td>
							</tr>
							<tr>
								<td colspan="2" align="center">
									<button class="btn" style="border: 3px solid black; margin: 0;">Add</button>
								</td>
							</tr>
						</table>
					</form>
				</div>

				<div id="addres" class="div" style="display: none;">

					<form action="AddResult">
						<br>
						<table cellpadding="15" align="center">
							<tr>
								<td class="td-text">Roll-No:</td>
								<td><input type="text" name="roll"></td>
							</tr>
							<tr>
								<td class="td-text">Subjects:</td>
								<td><select name="Result-Sub" id="subjects"
									onchange="changeSub()">
										<option value="P-Cs-M">PCsM</option>
										<option value="E-Cs-M">ECsM</option>
										<option value="S-Cs-M">SCsM</option>
										<option value="P-C-M">PCM</option>
										<option value="P-C-G">PCG</option>
										<option value="P-E-M">PEM</option>
								</select></td>
							</tr>
							<tr>
								<td class="td-text" id="sub1">Subject 1:</td>
								<td><input type="text" name="s1"></td>
							</tr>
							<tr>
								<td class="td-text" id="sub2">Subject 2:</td>
								<td><input type="text" name="s2"></td>
							</tr>
							<tr>
								<td class="td-text" id="sub3">Subject 3:</td>
								<td><input type="text" name="s3"></td>
							</tr>
							<tr>
								<td colspan="2" align="center">
									<button class="btn" style="border: 3px solid black; margin: 0;">Add</button>
								</td>
							</tr>
						</table>
					</form>
				</div>

				<div id="viewstu" class="div" style="display: none;">
					<br>
					<table cellpadding="15" align="center" border="3"
						style="color: black; border: 1px solid black; position: sticky;">
						<tr bgcolor="grey" style="font-size: 30px;">
							<th>Roll-No</th>
							<th>Full-Name</th>
							<th>Mother-Name</th>
							<th>Year</th>
							<th>Subjects</th>
							<th>College</th>
						</tr>
						<%
							// Accessing data from addStudent table
								try {
									Connection connection = CreateConnection.getConnection();
									PreparedStatement ps = connection.prepareStatement("select * from addstudent");
									ResultSet set = ps.executeQuery();
									while (set.next()) {
						%>
						<tr bgcolor="white" style="font-size: 30px;">
							<td>
								<%
									out.print(set.getInt("roll"));
								%>
							</td>
							<td>
								<%
									out.print(set.getString("name"));
								%>
							</td>
							<td>
								<%
									out.print(set.getString("mother"));
								%>
							</td>
							<td>
								<%
									out.print(set.getString("year"));
								%>
							</td>
							<td>
								<%
									out.print(set.getString("grp"));
								%>
							</td>
							<td>
								<%
									out.print(set.getString("colg"));
								%>
							</td>
						</tr>
						<%
							}
								} catch (Exception e) {
									e.printStackTrace();
								}
						%>
					</table>
				</div>

				<div id="viewres" class="div" style="display: none;">

					<form action="#">
						<br>
						<table cellpadding="20" align="center" border="3"
							style="font-size: 25px; color: black; border: 1px solid black; position: sticky;">
							<tr bgcolor="grey" style="">
								<th>Roll-No</th>
								<th>Sub-1</th>
								<th>Marks</th>
								<th>Sub-2</th>
								<th>Marks</th>
								<th>Sub-3</th>
								<th>Marks</th>
								<th>Total</th>
								<th>Percentage</th>
								<th>Full-Result</th>
							</tr>
							<%
								// Accessing data from addStudent table
									try {
										Connection connection = CreateConnection.getConnection();
										PreparedStatement ps = connection.prepareStatement("select * from result");
										ResultSet set = ps.executeQuery();
										while (set.next()) {
											int s1 = set.getInt("sub1");
											int s2 = set.getInt("sub2");
											int s3 = set.getInt("sub3");
							%>
							<tr bgcolor="white">
								<td>
									<%
										out.print(set.getInt("roll"));
									%>
								</td>
								<td>
									<%
										out.print(set.getString("sub1name"));
									%>
								</td>
								<td>
									<%
										out.print(set.getInt("sub1"));
									%>
								</td>
								<td>
									<%
										out.print(set.getString("sub2name"));
									%>
								</td>
								<td>
									<%
										out.print(set.getInt("sub2"));
									%>
								</td>
								<td>
									<%
										out.print(set.getString("sub2name"));
									%>
								</td>
								<td>
									<%
										out.print(set.getInt("sub3"));
									%>
								</td>
								<td><%=s1 + s2 + s3 + "/450" %> </td>
								<td><%=((s1 + s2 + s3) * 100) / 450 + "%" %> </td>
								<td colspan="2"><a href="#">View</a></td>
							</tr>
							<%
								}
									} catch (Exception e) {
										e.printStackTrace();
									}
							%>
						</table>
					</form>
				</div>
			</div>
		</div>

		<script type="text/javascript">
			function addstu() {
				document.getElementById("addstu").style.display = "block";
				document.getElementById("addres").style.display = "none";
				document.getElementById("viewstu").style.display = "none";
				document.getElementById("viewres").style.display = "none";
			}
			function addres() {
				document.getElementById("addres").style.display = "block";
				document.getElementById("addstu").style.display = "none";
				document.getElementById("viewstu").style.display = "none";
				document.getElementById("viewres").style.display = "none";
			}
			function viewstu() {
				document.getElementById("viewstu").style.display = "block";
				document.getElementById("addstu").style.display = "none";
				document.getElementById("addres").style.display = "none";
				document.getElementById("viewres").style.display = "none";
			}
			function viewres() {
				document.getElementById("viewres").style.display = "block";
				document.getElementById("viewstu").style.display = "none";
				document.getElementById("addstu").style.display = "none";
				document.getElementById("addres").style.display = "none";
			}

			// Add active class to the current button (highlight it)
			var header = document.getElementById("myDIV");
			var btns = header.getElementsByClassName("button");
			for (var i = 0; i < btns.length; i++) {
				btns[i].addEventListener("click", function() {
					var current = document.getElementsByClassName("active2");
					current[0].className = current[0].className.replace(
							"active2", "");
					this.className += "active2";
				});
			}

			function changeSub() {
				var subject = document.getElementById("subjects").value;
				var arr = subject.split("-");
				var map = {};
				map['P'] = [ "PHYSICS" ]
				map['S'] = [ "STATISTICS" ]
				map['Cs'] = [ "COMPUTER-SCIENCE" ]
				map['E'] = [ "ELECTRONICS" ]
				map['C'] = [ "CHEMISTRY" ]
				map['M'] = [ "MATHS" ]
				map['G'] = [ "GEOLOGY" ]

				document.getElementById("sub1").innerHTML = map[arr[0]];
				document.getElementById("sub2").innerHTML = map[arr[1]];
				document.getElementById("sub3").innerHTML = map[arr[2]];
			}
		</script>
</body>
</html>
<%
	}
%>