package test;
import test.DBConnection;
import javax.servlet.*;
import java.io.*;
import java.sql.*;
public class AdminLoginServlet extends GenericServlet{
	public void service(ServletRequest req, ServletResponse res) throws IOException,ServletException
	{
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		String uName = req.getParameter("uname");
		String pWord = req.getParameter("pword");
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("SELECT * FROM ADMIN6 WHERE UNAME=? AND PWORD=?");
			ps.setString(1, uName);
			ps.setString(2, pWord);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				RequestDispatcher rd = req.getRequestDispatcher("Sample.html");
				rd.include(req, res);
				pw.println("<div class=\"tab\">Admin login Successful</div>");
				pw.println("<div class=\"tab\"><br/><a href=\"AddBook.html\">ADD BOOKS</a><br/></div>");
				pw.println("<div class=\"tab\"><br/><a href=\"RemoveBooks.html\">REMOVE BOOKS</a><br/></div>");
				pw.println("<div class=\"tab\"><br/><a href=\"viewbook\">VIEW BOOKS</a></div>");
			}
			else
			{
				
				RequestDispatcher rd = req.getRequestDispatcher("AdminLogin.html");
				rd.include(req,res);
				pw.println("<div class=\"tab\">Incorrect UserName or PassWord</div>");
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}