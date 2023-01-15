package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import config.DBConnection;
import constants.db.BooksDBConstants;

public class ViewBookServlet extends GenericServlet {
    public void service(ServletRequest req, ServletResponse res) throws IOException, ServletException {
        PrintWriter pw = res.getWriter();
        res.setContentType("text/html");
        try {
            Connection con = DBConnection.getCon();
            PreparedStatement ps = con.prepareStatement("Select * from " + BooksDBConstants.TABLE_BOOK);
            ResultSet rs = ps.executeQuery();
            RequestDispatcher rd = req.getRequestDispatcher("ViewBooks.html");
            rd.include(req, res);
//			pw.println("<div class=\"tab\">Books Available In Our Store</div>");
//			pw.println("<div class=\"tab\">\r\n" + 
//					"		<table>\r\n" + 
//					"			<tr>\r\n" + 
//					"				\r\n" + 
//					"				<th>Book Code</th>\r\n" + 
//					"				<th>Book Name</th>\r\n" + 
//					"				<th>Book Author</th>\r\n" + 
//					"				<th>Book Price</th>\r\n" + 
//					"				<th>Quantity</th><br/>\r\n" + 
//					"			</tr>");
            pw.println("<div class=\"container\">\r\n"
                    + "        <div class=\"card-columns\">");
            while (rs.next()) {
                String bCode = rs.getString(1);
                String bName = rs.getString(2);
                String bAuthor = rs.getString(3);
                int bPrice = rs.getInt(4);
                int bQty = rs.getInt(5);
                /*
                 * pw.println("<tr><td>"+bCode+"</td>");
                 * pw.println("<td>"+bName+"</td>");
                 * pw.println("<td>"+bAuthor+"</td>");
                 * pw.println("<td>"+bPrice+"</td>");
                 * pw.println("<td>"+bQty+"</td></tr>");
                 */
                pw.println(this.addBookToCardCard(bCode, bName, bAuthor, bPrice, bQty));
            }
            pw.println("</div>\r\n"
                    + "    </div>");
//			pw.println("</table>\r\n" + 
//					"	</div>");
            // pw.println("<div class=\"tab\"><a href=\"AddBook.html\">Add More
            // Books</a></div>");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String addBookToCardCard(String bCode, String bName, String bAuthor, int bPrice, int bQty) {
        String button = "<a href=\"#\" class=\"btn btn-danger\">Out Of Stock</a>\r\n";
        if (bQty > 0) {
            button = "<form action=\"checkout\" method=\"post\">"
                    + "<input type='hidden' name = 'selected' value = "+bCode+">"
                            + "<input type='hidden' name='qty_"+bCode+"' value='1'/>"
                            + "<input type='submit' class=\"btn btn-primary\" value='Buy Now'/></form>";
        }
        return "<div class=\"card\">\r\n"
                + "                <div class=\"row card-body\">\r\n"
                + "                    <img class=\"col-sm-6\" src=\"logo.png\" alt=\"Card image cap\">\r\n"
                + "                    <div class=\"col-sm-6\">\r\n"
                + "                        <h5 class=\"card-title text-success\">" + bName + "</h5>\r\n"
                + "                        <p class=\"card-text\">\r\n"
                + "                        Author: <span class=\"text-primary\" style=\"font-weight:bold;\"> " + bAuthor
                + "</span><br>\r\n"
                + "                        </p>\r\n"
                + "                        \r\n"
                + "                    </div>\r\n"
                + "                </div>\r\n"
                + "                <div class=\"row card-body\">\r\n"
                + "                    <div class=\"col-sm-6\">\r\n"
                + "                        <p class=\"card-text\">\r\n"
                + "                        <span>Book Id: " + bCode + "</span>\r\n"
                + "                        <br><span class=\"text-danger\">Only " + bQty + " items left</span>\r\n"
                + "                        </p>\r\n"
                + "                    </div>\r\n"
                + "                    <div class=\"col-sm-6\">\r\n"
                + "                        <p class=\"card-text\">\r\n"
                + "                        Price: <span style=\"font-weight:bold; color:green\"> &#8377; " + bPrice
                + " </span>\r\n"
                + "                        </p>\r\n"
                + button
                + "                    </div>\r\n"
                + "                </div>\r\n"
                + "            </div>";
    }
}
