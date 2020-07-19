<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib uri="/struts-tags" prefix="st" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<st:form action="reg">
	<st:textfield label="username" name="username"></st:textfield>
	<st:password label="userpassword" name="userpassword"></st:password>
	<st:submit value="Register"></st:submit>
</st:form>
</body>
</html>