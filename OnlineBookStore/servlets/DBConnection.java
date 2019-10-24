package servlets;
import java.sql.*;
public class DBConnection {
	private static Connection con;
	private DBConnection(){};
	static {
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/onlinebookstore","postgres","postgres");
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
