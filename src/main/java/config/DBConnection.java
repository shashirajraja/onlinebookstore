package config;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {

	private static Connection con;

	private DBConnection() {
	}
	
	static {

		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		InputStream input = classLoader.getResourceAsStream("application.properties");
		Properties prop = new Properties();
		try {
			prop.load(input);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {

			Class.forName(prop.getProperty("db.driver"));

		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			con = DriverManager.getConnection(prop.getProperty("db.host"), prop.getProperty("db.username"),
					prop.getProperty("db.password"));

		} catch (SQLException e) {

			e.printStackTrace();

		}

	}// End of static block

	public static Connection getCon() {
		return con;
	}
}
