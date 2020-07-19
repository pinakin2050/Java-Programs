package j2EE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class DisplayTblDataMetaData {

	public static void main(String[] args) {
		Connection con;
		Statement stmt;
		ResultSet res=null;
		ResultSetMetaData rsmd=null;
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//or DriverManager.registerDriver(new OracleDriver());
			
			System.out.println("Driver Loaded Successfully.");
			con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "SYSTEM", "system");
			System.out.println("Connection Successfull.");
			stmt=con.createStatement();
			res=stmt.executeQuery("SELECT *FROM STUDENT");
			rsmd=res.getMetaData();
			
			//Displaying type of data table holds
			for(int i=1;i<=rsmd.getColumnCount();i++)
			{
				System.out.println("ColName:"+rsmd.getColumnName(i)+"		ColType:"+rsmd.getColumnTypeName(i));
			}
			
			System.out.println("NAME		USN			MARK1		MARK2		MARK3");

			while(res.next()==true)
			{
				String name=res.getString(1);
				String usn=res.getString(2);
				int m1=res.getInt(3);
				int m2=res.getInt(4);
				int m3=res.getInt(5);
				System.out.println(name+"		"+usn+"		"+m1+"		"+m2+"		"+m3);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
