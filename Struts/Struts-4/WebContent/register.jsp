<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%@ taglib uri="/struts-tags" prefix="st"  %>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<st:form action="reg">
<st:textfield label="username" name="username"></st:textfield>
<st:textfield label="userpassword" name="userpassword"></st:textfield>
<st:submit value="register"></st:submit>
</st:form>
</body>
</html>