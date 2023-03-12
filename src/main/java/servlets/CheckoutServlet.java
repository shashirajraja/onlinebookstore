package servlets;

import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bittercode.config.DBUtil;
import com.bittercode.constant.BookStoreConstants;
import com.bittercode.constant.db.BooksDBConstants;
import com.bittercode.model.UserRole;

public class CheckoutServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		PrintWriter pw = res.getWriter();
		res.setContentType(BookStoreConstants.CONTENT_TYPE_TEXT_HTML);
		if (!DBUtil.isLoggedIn(UserRole.CUSTOMER, req.getSession())) {
            RequestDispatcher rd = req.getRequestDispatcher("UserLogin.html");
            rd.include(req, res);
            pw.println("<table class=\"tab\"><tr><td>Please Login First to Continue!!</td></tr></table>");
            return;
        }
		try {
			Connection con = DBUtil.getConnection();
			String bookIds = req.getParameter("selected");//comma seperated bookIds
			if(bookIds == null) bookIds = "";
            RequestDispatcher rd = req.getRequestDispatcher("payment.html");
            rd.include(req, res);
            for(String bookId : bookIds.split(",")) {
                String key = "qty_"+bookId;
                String value = req.getParameter(key);
                pw.println("<input type='hidden' name='"+key+"' value='"+value+"'>");
            }
            pw.println("<input type='hidden' name='selected' value='"+bookIds+"'>");
            pw.println("<input type=\"submit\" value=\"Continue to checkout\" class=\"btn\">\r\n"
                    + "                    </form>\r\n"
                    + "                </div>\r\n"
                    + "            </div>");
            pw.println("<div class=\"col-25\">\r\n"
                    + "                <div class=\"container\" >\r\n"
                    + "                    <h4>\r\n"
                    + "                        Items &nbsp;&nbsp;<span>Qty</span> <span class=\"price\" style=\"color: black\"> <i\r\n"
                    + "                            class=\"fa fa-shopping-cart\"></i> <b>Price</b>\r\n"
                    + "                        </span>\r\n"
                    + "                    </h4>");
            String query = "select * from " + BooksDBConstants.TABLE_BOOK +" where " + 
                    BooksDBConstants.COLUMN_BARCODE + " in ("+bookIds+")";
            PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			double total = 0.0;
			while (rs.next()) {
				int bPrice = rs.getInt(BooksDBConstants.COLUMN_PRICE);
				String bCode = rs.getString(BooksDBConstants.COLUMN_BARCODE);
				String bName = rs.getString(BooksDBConstants.COLUMN_NAME);
				String qt = "qty_" + bCode;
				int quantity = Integer.parseInt(req.getParameter(qt));
                pw.println("<input type='hidden' name='"+qt+"' value='"+quantity+"'>");
				int amount = bPrice * quantity;
				total = total + amount;
				pw.println("<p><a href=\"#\">"+bName+"</a><span>"+quantity+"</span> <span class=\"price\">&#8377; "+amount+"</span>\r\n"
				        + "                    </p>");		
			}
			pw.println("<hr>\r\n"
			        + "                    <p>\r\n"
			        + "                        Total <span class=\"price\" style=\"color: black\"><b>&#8377; "+total+"</b></span>\r\n"
			        + "                    </p>");
			pw.println("</div>\r\n"
			        + "    </div>");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
