package conection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Way2 {

	public static void main(String[] args) throws SQLException {
		String url="jdbc:oracle:thin:@//localhost:1521/XE";
		String un="SYSTEM",pwd="system";
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		System.out.println("Driver Loaded Successfully.");
		DriverManager.getConnection(url, un, pwd);
		System.out.println("Database connection successful.");
	}
}
