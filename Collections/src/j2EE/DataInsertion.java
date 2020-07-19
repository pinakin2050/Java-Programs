package j2EE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class DataInsertion {
		public static void main(String args[]) {
			Connection con;
			PreparedStatement pstmt;
			ResultSet res;
			byte ch=1;
			String name=new String();
			String usn=new String();
			int m1=0,m2=0,m3=0;
			Scanner scan=new Scanner(System.in);
			
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				con=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "SYSTEM", "system");
				do
				{
					System.out.println("Enter Name:");
					name=scan.nextLine();
					System.out.println("Enter USN:");
					usn=scan.nextLine();
					System.out.println("Enter Marks1:");
					m1=scan.nextInt();
					System.out.println("Enter Marks2:");
					m2=scan.nextInt();
					System.out.println("Enter Marks3:");
					m3=scan.nextInt();
					
					pstmt=con.prepareStatement("INSERT INTO STUDENT VALUES(?,?,?,?,?)");
					pstmt.setString(1, name);
					pstmt.setString(2, usn);
					pstmt.setInt(3, m1);
					pstmt.setInt(4, m2);
					pstmt.setInt(5, m3);
					int x=pstmt.executeUpdate();
					if(x==1)
						System.out.println("Data Inserted Successfully.");
					else
						System.out.println("Insertion failure!!!Try Again");
					pstmt=con.prepareStatement("SELECT *FROM STUDENT");
					res=pstmt.executeQuery();
					while(res.next()==true)
					{
						String nm=res.getString(1);
						String enroll=res.getString(2);
						int mr1=res.getInt(3);
						int mr2=res.getInt(4);
						int mr3=res.getInt(5);
						System.out.println(nm+"		"+enroll+"	"+mr1+"	"+mr2+"	"+mr3);						
					}
					System.out.println("Press 1 to insert more records and 0 to stop.");
					ch=scan.nextByte();
					scan.nextLine();
				}while(ch==1);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			scan.close();
		}
	}