<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<style type="text/css">
body{
	padding:0px;
	margin:0px;
	background-color:#7F2652;
}
#mainframe{
	margin-top:120px;
	width:30%;
	height:auto;
	padding:0px;
	border:4 solid;
}
#header{
	width:100%;
	height:17%;
	background-color:#0E0E0E;
	color:white;
	text-decoration:
	opacity:0.9;
}

#title{	
	padding:0px;
	margin:0px;
	padding-top:30px;
}

input[type=text],input[type=password]{
	font-size:17px;
	font-weight: bold;
	width:100%;
	margin-top:5px;
	padding:7px 20px;
	border:1px solid;
	border-radius:4px;
}
input[type=submit]{
	width:100%;
	background-color:black;
	color:white;
	padding:10px;
	margin-top:4px;
	border-radius:4px;
	border:0;
	
	opacity:0.9;
	cursor:pointer;
}
a{
	color:black;
}
a:hover{
color:white;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div id="header">
	<h1 align="center" id="title">BankApp</h1>
	</div>
	<center>
		<div id="mainframe" align="center">		
			<form action="Login">
				<table>
					<tr style="height:7px;"></tr>
					<tr>
						<td id="td1">
							<label class="label">CUSTOMER ID</label><br>
							<input type="text" name="cust_id"/> <br><br>
						</td>
					</tr>
					<tr>
						<td>
							<label class="label">PASSWORD</label><br>
							<input type="password" name="pwd"/> <br><br>
						</td>
					</tr>
					<tr>
						<td><input type="submit" value="Login"/> <br><br></td>
					</tr>
					<tr>
						<td><h4><a href="credential.jsp">Forgot Password?</a></h4></td>
					</tr>
				</table>
				</form>
			</div>
	</center>
</body>
</html>