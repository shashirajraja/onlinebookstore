package test;
import test.DBConnection;
import java.sql.*;
import javax.servlet.*;
import java.io.*;
public class UserRegisterServlet extends GenericServlet{
	public void service(ServletRequest req, ServletResponse res) throws IOException,ServletException
	{
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		String uName = req.getParameter("uname");
		String pWord = req.getParameter("pword");
		String fName = req.getParameter("firstname");
		String lName = req.getParameter("lastname");
		String addr = req.getParameter("address");
		int phNo = Integer.parseInt(req.getParameter("phoneno"));
		String mailId = req.getParameter("mailid");
		try {
		Connection con = DBConnection.getCon();
		PreparedStatement ps = con.prepareStatement("insert into register values(?,?,?,?,?,?,?)");
		ps.setString(1, uName);
		ps.setString(2, pWord);
		ps.setString(3, fName);
		ps.setString(4, lName);
		ps.setString(5, addr);
		ps.setInt(6, phNo);
		ps.setString(7, mailId);
		int k = ps.executeUpdate();
		if(k==1)
		{
			RequestDispatcher rd = req.getRequestDispatcher("Sample.html");
			rd.include(req, res);
			pw.println("<h3 class='tab'>User Registered Successfully</h3>");
		}
		else
		{
			RequestDispatcher rd = req.getRequestDispatcher("userreg");
			rd.include(req, res);
			pw.println("Sorry for interruption! Register again");
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}