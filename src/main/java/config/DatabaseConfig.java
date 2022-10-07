package config;

public class DatabaseConfig {

	public static final String DRIVER_NAME ="com.mysql.jdbc.Driver";
	public static final String DB_HOST = "jdbc:mysql://localhost";
	public static final String DB_PORT = "3306";
	public static final String DB_NAME = "onlinebookstore";
	public static final String DB_USER_NAME = "root";
	public static final String DB_PASSWORD = "root";
	
	public static final String CONNECTION_STRING = DB_HOST + ":" + DB_PORT + "/" + DB_NAME;

}
