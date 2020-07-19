<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<div id="mainframe" align="center">		
			<form action="Validate">
				<table>
					<tr style="height:7px;"></tr>
					<tr>
						<td id="td1">
							<label class="label">Name:</label><br>
							<input type="text" name="name"/> <br><br>
						</td>
					</tr>
					<tr>
						<td>
							<label class="label">City:</label><br>
							<input type="text" name="city"/> <br><br>
						</td>
					</tr>
					<tr>
						<td><input type="submit"/> <br><br></td>
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