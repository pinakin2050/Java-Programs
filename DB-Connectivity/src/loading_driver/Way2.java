package loading_driver;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Way2 {

	public static void main(String[] args) throws SQLException {
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		System.out.println("Driver loaded successfully");
	}

}
