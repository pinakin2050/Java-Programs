package data_retrival;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteFromTable {

	public static void main(String[] args) {
		Connection con;
		Statement stmt;
		PreparedStatement pstmt;
		ResultSet res;
		String name="",usn="",cgpa="";
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "SYSTEM", "system");
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter USN of student whose data you want to delete:");
			usn=scan.nextLine();
			scan.close();
			pstmt=con.prepareStatement("DELETE FROM STUDENT WHERE USN=?");
			pstmt.setString(1, usn);
			int x=pstmt.executeUpdate();
			if(x==1)
				System.out.println("Data Deleted successfully.");
			else
				System.out.println("Data couldn't be deleted.");
			stmt=con.createStatement();
			res=stmt.executeQuery("SELECT *FROM STUDENT");
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
