package data_retrival;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Scanner;

public class PrintTableDataAccUser {

	public static void main(String[] args) {
		Connection con;
		Statement stmt;
		PreparedStatement pstmt;
		String usn="";
		ResultSet res;
		ResultSetMetaData rstmt;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "SYSTEM", "system");
			stmt=con.createStatement();
			res=stmt.executeQuery("SELECT *FROM STUDENT");
			rstmt=res.getMetaData();
			/* getting table metadata
			for(int i=1;i<=rstmt.getColumnCount();i++)
			{
				System.out.println(rstmt.getColumnName(i)+"	"+rstmt.getColumnTypeName(1));
			}
			*/
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter USN:");
			usn=scan.nextLine();
			scan.close();
			pstmt=con.prepareStatement("SELECT *FROM STUDENT WHERE USN=?");
			pstmt.setString(1, usn);
			res = pstmt.executeQuery();
			res.next();
			System.out.println("NAME:"+res.getString(1));
			System.out.println("USN:"+res.getString(2));
			System.out.println("CGPA:"+res.getString(3));
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
