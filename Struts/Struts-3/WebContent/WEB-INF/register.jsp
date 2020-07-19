<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="st" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<st:form action="reg"></st:form>
<st:textfield label="username" name="username"></st:textfield>
<st:textfield label="usercity" name="usercity"></st:textfield>
<st:submit value="register"></st:submit>

</body>
</html>