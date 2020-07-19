package P1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetResult extends HttpServlet {
	public void init()
	{
		Connection con;
		PreparedStatement pstmt;
		String url="jdbc:oracle:thin:@//localhost:1521/XE";
		String un="SYSTEM";
		String pw="System";
		ResultSet res;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(url,un,pw);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void service(HttpServletRequest request,HttpServletResponse response)
	{
		
	}
}
