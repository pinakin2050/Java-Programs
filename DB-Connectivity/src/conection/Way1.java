package conection;

import java.sql.DriverManager;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

public class Way1 {

	public static void main(String[] args) throws SQLException {
		DriverManager.registerDriver(new OracleDriver());
		String url="jdbc:oracle:thin:@//localhost:1521/XE";
		String un="SYSTEM";
		String pw="system";
		System.out.println("Driver Loaded Successfully");
		DriverManager.getConnection(url, un, pw);
		System.out.println("Successfully connected to the database.");
	}
}
