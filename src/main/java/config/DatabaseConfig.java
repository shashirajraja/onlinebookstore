package config;

public class DatabaseConfig {

	public static final String DRIVER_NAME ="com.mysql.jdbc.Driver";
	public static final String DB_HOST = System.getenv("db_url");
	public static final String DB_PORT = System.getenv("port");
	public static final String DB_NAME = System.getenv("db_name");
	public static final String DB_USER_NAME = System.getenv("db_username");
	public static final String DB_PASSWORD = System.getenv("db_password");
	
	public static final String CONNECTION_STRING = DB_HOST + ":" + DB_PORT + "/" + DB_NAME;

}
