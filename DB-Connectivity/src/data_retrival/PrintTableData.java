package data_retrival;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PrintTableData {

	public static void main(String[] args) {
		Connection con;
		Statement stmt;
		ResultSet res;
		String name="",usn="",cgpa="";
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// or DriverManager.registerDriver(new OracleDriver());
			con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "SYSTEM", "system");
			stmt=con.createStatement();
			res = stmt.executeQuery("SELECT *FROM STUDENT");
			System.out.println("NAME			USN				CGPA");
			while(res.next())
			{
				name=res.getString(1); //or res.getString("NAME");
				usn=res.getString(2); //or res.getString("USN");
				cgpa=res.getString(3); //or res.getString("CGPA");
				System.out.println(name+"			"+usn+"			"+cgpa);
			}
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
