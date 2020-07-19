import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import oracle.jdbc.OracleDriver;

public class DemoConnection {

	public static void main(String[] args) {
		Connection con;
		Statement stmt;
		ResultSet res;
		try
		{
			DriverManager.registerDriver(new OracleDriver());
		// or 	Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loaded succefully!");
			con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "SYSTEM", "system");
			System.out.println("Connection successfull");
			stmt=con.createStatement();
			res=stmt.executeQuery("SELECT *FROM STUDENT");
			System.out.println("Query executed successfully!!");
			while(res.next()==true)
			{
				String a=res.getString("NAME");
				String usn=res.getString("USN");
				int m1=res.getInt("MARK1");
				int m2=res.getInt("MARK2");
				int m3=res.getInt("MARK3");
				System.out.println("NAME:"+a+" USN:"+usn+" Marks1:"+m1+" Marks2:"+m2+" Marks1:"+m3);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
