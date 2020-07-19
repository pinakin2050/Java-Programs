<%@ page import="java.sql.*" %>
<%@ page import="javax.servlet.http.*" %>
<%@ page import="oracle.jdbc.driver.OracleDriver" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result</title>
</head>
<body>
<%!
	Connection con;
	PreparedStatement pstmt;
	ResultSet res;
	String name;
	int m1,m2,m3;
	
	public void jspInit()
	{
		try{
			DriverManager.registerDriver(new OracleDriver());
			con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE","SYSTEM","System");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void jspDestroy()
	{
		try{
			con.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
%>

<%
	String usn=request.getParameter("USN");
	pstmt=con.prepareStatement("SELECT *FROM STUDENT WHERE USN=?");
	pstmt.setString(1, usn);
	res=pstmt.executeQuery();
	
	while(res.next()==true)
	{
		name=res.getString(1);
		m1=res.getInt(3);
		m2=res.getInt(4);
		m3=res.getInt(5);
	}
	
	out.println("Dear "+name+",Your result is "+m1+" "+m2+" "+m3);
%>
</body>
</html>