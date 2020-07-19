package loading_driver;

import java.sql.DriverManager;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

public class Way1 {

	public static void main(String[] args) throws SQLException {
		DriverManager.registerDriver(new OracleDriver());
		System.out.println("Driver loaded successfully");
	}

}
