package test;
import java.sql.*;
public class DBConnection {
	private static Connection con;
	private DBConnection(){};
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SHASHI","MANAGER");
		}//End of try
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}//End of static block
	
	public static Connection getCon()
	{
		return con;
	}
}
