package servlets;

import java.sql.*;
import javax.servlet.*;

import sql.IBookConstants;

import java.io.*;

public class RemoveBookServlet extends GenericServlet {
	public void service(ServletRequest req, ServletResponse res) throws IOException, ServletException {
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		String bkid = req.getParameter("barcode");
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement(
					"delete from " + IBookConstants.TABLE_BOOK + "  where " + IBookConstants.COLUMN_BARCODE + "=?");
			ps.setString(1, bkid);
			int k = ps.executeUpdate();
			if (k == 1) {
				RequestDispatcher rd = req.getRequestDispatcher("Sample.html");
				rd.include(req, res);
				pw.println("<div class=\"tab\">Book Removed Successfully</div>");
				pw.println("<div class=\"tab\"><a href=\"RemoveBooks.html\">Remove more Books</a></div>");

			} else {
				RequestDispatcher rd = req.getRequestDispatcher("Sample.html");
				rd.include(req, res);
				pw.println("<div class=\"tab\">Book Not Available In The Store</div>");
				pw.println("<div class=\"tab\"><a href=\"RemoveBooks.html\">Remove more Books</a></div>");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
