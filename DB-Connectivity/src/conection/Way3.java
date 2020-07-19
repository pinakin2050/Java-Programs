package conection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Way3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url="jdbc:oracle:thin:@//localhost:1521/XE";
		String un="SYSTEM",pwd="system";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver loaded successfully");
		DriverManager.getConnection(url, un, pwd);
		System.out.println("Databse connection successful");
	}

}
