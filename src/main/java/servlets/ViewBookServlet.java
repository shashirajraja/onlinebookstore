package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bittercode.config.DBUtil;
import com.bittercode.model.Book;
import com.bittercode.model.UserRole;
import com.bittercode.service.BookService;
import com.bittercode.service.impl.BookServiceImpl;

public class ViewBookServlet extends HttpServlet {
    BookService bookService = new BookServiceImpl();

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        PrintWriter pw = res.getWriter();
        res.setContentType("text/html");
        if (!DBUtil.isLoggedIn(UserRole.CUSTOMER, req.getSession())) {
            RequestDispatcher rd = req.getRequestDispatcher("UserLogin.html");
            rd.include(req, res);
            pw.println("<table class=\"tab\"><tr><td>Please Login First to Continue!!</td></tr></table>");
            return;
        }
        try {

      
            List<Book> books = bookService.getAllBooks();
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

            for (Book book : books) {
                pw.println(this.addBookToCard(book.getBarcode(), book.getName(), book.getAuthor(), book.getPrice(),
                        book.getQuantity()));

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

    public String addBookToCard(String bCode, String bName, String bAuthor, double bPrice, int bQty) {
        String button = "<a href=\"#\" class=\"btn btn-danger\">Out Of Stock</a>\r\n";
        if (bQty > 0) {
            button = "<form action=\"checkout\" method=\"post\">"
                    + "<input type='hidden' name = 'selected' value = " + bCode + ">"
                    + "<input type='hidden' name='qty_" + bCode + "' value='1'/>"
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
