package servlets;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import constants.IOnlineBookStoreConstants;
import sql.IBookConstants;

public class AddBookServlet extends GenericServlet{
	public void service(ServletRequest req,ServletResponse res) throws IOException,ServletException
	{
		PrintWriter pw = res.getWriter();
		
		res.setContentType(IOnlineBookStoreConstants.CONTENT_TYPE_TEXT_HTML);
		
		String bCode = req.getParameter(IBookConstants.COLUMN_BARCODE);
		String bName = req.getParameter(IBookConstants.COLUMN_NAME);
		String bAuthor = req.getParameter(IBookConstants.COLUMN_AUTHOR);
		int bPrice =Integer.parseInt(req.getParameter(IBookConstants.COLUMN_PRICE));
		int bQty = Integer.parseInt(req.getParameter(IBookConstants.COLUMN_QUANTITY));
		
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("insert into " + IBookConstants.TABLE_BOOK + "  values(?,?,?,?,?)");
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
