package j2EE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class DisplayTableData {

	public static void main(String[] args) {
		Connection con;
		Statement stmt;
		ResultSet res;
		String url="jdbc:oracle:thin:@//localhost:1521/XE";
		String un="SYSTEM";
		String pw="System";
		try
		{
			//Loading driver on RAM
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// or DriverManager.registerDriver(new OracleDriver());
			System.out.println("Driver Loaded Successfully");
			
			//Establishing connection with DB
			con= DriverManager.getConnection(url,un,pw);
			System.out.println("Connection Established");
			stmt= con.createStatement();
			res=stmt.executeQuery("SELECT *FROM STUDENT");
			System.out.println("Query Executed.");
			System.out.println("  NAME		  USN			MARK1		MARK2		MARK3");
			while(res.next()==true)
			{
				String name = res.getString(1); //res.getString("NAME")
				String usn = res.getString(2); //res.getString("USN")
				int  m1 = res.getInt(3); //res.getString("MARK1")
				int  m2 = res.getInt(4); //res.getString("MARK2")
				int  m3 = res.getInt(5); //res.getString("MARK3")
				System.out.println(name+"		"+usn+"		"+m1+"		"+m2+"		"+m3);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
