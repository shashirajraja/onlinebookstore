package config;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private static Connection con;

	private DBConnection() {
	}
	
	static {

		
		try {

			Class.forName(DatabaseConfig.DRIVER_NAME);

		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			
		    con = DriverManager.getConnection(DatabaseConfig.CONNECTION_STRING, DatabaseConfig.DB_USER_NAME,
                    DatabaseConfig.DB_PASSWORD);
		} catch (SQLException e) {

			e.printStackTrace();

		}

	}// End of static block

	public static Connection getCon() {
		return con;
	}
}
