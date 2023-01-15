package servlets;

import java.sql.*;
import javax.servlet.*;

import config.DBConnection;
import constants.db.BooksDBConstants;

import java.io.*;

public class RemoveBookServlet extends GenericServlet {
	public void service(ServletRequest req, ServletResponse res) throws IOException, ServletException {
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		String bkid = req.getParameter("barcode");
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement(
					"delete from " + BooksDBConstants.TABLE_BOOK + "  where " + BooksDBConstants.COLUMN_BARCODE + "=?");
			ps.setString(1, bkid);
			int k = ps.executeUpdate();
			if (k == 1) {
				RequestDispatcher rd = req.getRequestDispatcher("Sample.html");
				rd.include(req, res);
				pw.println("<table class=\"tab\"><tr><td>Book Removed Successfully</td></tr></table>");
				pw.println("<table class=\"tab\"><tr><td><a href=\"RemoveBooks.html\">Remove more Books</a></td></tr></table>");

			} else {
				RequestDispatcher rd = req.getRequestDispatcher("Sample.html");
				rd.include(req, res);
				pw.println("<table class=\"tab\"><tr><td>Book Not Available In The Store</td></tr></table>");
				pw.println("<table class=\"tab\"><tr><td><a href=\"RemoveBooks.html\">Remove more Books</a></td></tr></table>");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
