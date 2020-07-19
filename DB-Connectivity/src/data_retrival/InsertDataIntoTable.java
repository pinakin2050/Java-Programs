package data_retrival;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Scanner;

public class InsertDataIntoTable {

	public static void main(String[] args) {
		Connection con;
		Statement stmt;
		PreparedStatement pstmt;
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
				System.out.println(rstmt.getColumnName(i)+"	"+rstmt.getColumnTypeName(1));
			}
			pstmt=con.prepareStatement("INSERT INTO STUDENT VALUES(?,?,?)");
			byte ch=1;
			Scanner scan = new Scanner(System.in);
			do
			{
				System.out.println("Enter Name:");
				name=scan.nextLine();
				System.out.println("Enter USN:");
				usn=scan.nextLine();
				System.out.println("Enter CGPA:");
				cgpa=scan.nextLine();
				pstmt.setString(1, name);
				pstmt.setString(2, usn);
				pstmt.setString(3, cgpa);
				int x=pstmt.executeUpdate();
				if(x==1)
					System.out.println("Data Inserted Successfully.");
				else
					System.out.println("Data couldn't be inserted!!!");
				System.out.println("Press 1 to insert more data and press 0 to stop.");
				System.out.println("ENter your choice:");
				ch=scan.nextByte();
				scan.nextLine();
			}while(ch==1);
			scan.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
