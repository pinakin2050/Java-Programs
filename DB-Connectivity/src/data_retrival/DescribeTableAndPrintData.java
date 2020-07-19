package data_retrival;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class DescribeTableAndPrintData {

	
	public static void main(String[] args) {
		Connection con;
		Statement stmt;
		ResultSet res;
		ResultSetMetaData rstmt;
		String name="",usn="",cgpa="";
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "SYSTEM", "system");
			stmt=con.createStatement();
			res=stmt.executeQuery("SELECT *FROM STUDENT");
			rstmt=res.getMetaData();
			for(int i=1;i<=rstmt.getColumnCount();i++)
			{
				System.out.println(rstmt.getColumnName(i)+"	"+rstmt.getColumnTypeName(i));
			}
			while(res.next())
			{
				name=res.getString(1);
				usn=res.getString(2);
				cgpa=res.getString(3);
				System.out.println(name+"		"+usn+" 		"+cgpa);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
