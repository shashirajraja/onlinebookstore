package test;
import test.DBConnection;
import java.sql.*;
import javax.servlet.*;
import java.io.*;
public class AddBookServlet extends GenericServlet{
	public void service(ServletRequest req,ServletResponse res) throws IOException,ServletException
	{
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		String bCode = req.getParameter("bcode");
		String bName = req.getParameter("bname");
		String bAuthor = req.getParameter("bauthor");
		int bPrice =Integer.parseInt(req.getParameter("bprice"));
		int bQty = Integer.parseInt(req.getParameter("bqty"));
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("insert into book6 values(?,?,?,?,?)");
			ps.setString(1, bCode);
			ps.setString(2, bName);
			ps.setString(3, bAuthor);
			ps.setInt(4, bPrice);
			ps.setInt(5, bQty);
			int k = ps.executeUpdate();
			if(k==1)
			{
				RequestDispatcher rd = req.getRequestDispatcher("AddBook.html");
				rd.include(req, res);
				pw.println("<div class=\"tab\">Book Detail Updated Successfully!<br/>Add More Books</div>");
				
			
				
			}
			else
			{
				RequestDispatcher rd = req.getRequestDispatcher("AddBook.html");
				pw.println("<div class=\"tab\">Failed to Add Books! Fill up CareFully</div>");
				rd.include(req, res);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
