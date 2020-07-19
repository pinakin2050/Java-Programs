package j2EE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Scanner;

import oracle.jdbc.driver.OracleDriver;

public class PreparedStmtDemo {

	public static void main(String[] args) {
		Connection con;
		Statement stmt;
		PreparedStatement pstmt=null;
		ResultSet res=null;
		ResultSetMetaData rsmd=null;
		Scanner scan=new Scanner(System.in);
		
		try
		{
			DriverManager.registerDriver(new OracleDriver());
			//or Class.forName("oracle.jdbc.driver.OracleDriver");
			
			con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "SYSTEM", "system");
			stmt=con.createStatement();
			res=stmt.executeQuery("SELECT *FROM STUDENT");
			rsmd=res.getMetaData();
			for(int i=1;i<=rsmd.getColumnCount();i++)
			{
				System.out.println("Col"+i+":"+rsmd.getColumnName(i)+"	"+rsmd.getColumnTypeName(i));
				
			}
			pstmt=con.prepareStatement("SELECT *FROM STUDENT WHERE USN=?");
			System.out.println("Enter USN:");
			String usn=scan.nextLine();
			pstmt.setString(1, usn);
			res=pstmt.executeQuery();
			
			while(res.next()==true)
			{
				String nm=res.getString(1);
				String enroll=res.getString(2);
				int m1=res.getInt(3);
				int m2=res.getInt(4);
				int m3=res.getInt(5);
				System.out.println("Dear "+nm+" ,Your USN is "+enroll+" and Marks are:"+m1+" "+m2+" "+m3);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		scan.close();
	}

}
