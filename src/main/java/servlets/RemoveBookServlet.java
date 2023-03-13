package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bittercode.model.UserRole;
import com.bittercode.service.BookService;
import com.bittercode.service.impl.BookServiceImpl;
import com.bittercode.util.StoreUtil;

public class RemoveBookServlet extends HttpServlet {

    BookService bookService = new BookServiceImpl();

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        PrintWriter pw = res.getWriter();
        res.setContentType("text/html");

        if (!StoreUtil.isLoggedIn(UserRole.SELLER, req.getSession())) {
            RequestDispatcher rd = req.getRequestDispatcher("AdminLogin.html");
            rd.include(req, res);
            pw.println("<table class=\"tab\"><tr><td>Please Login First to Continue!!</td></tr></table>");
            return;
        }

        try {
            String bkid = req.getParameter("barcode");
            String responseCode = bookService.deleteBookById(bkid);
            if ("SUCCESS".equalsIgnoreCase(responseCode)) {
                RequestDispatcher rd = req.getRequestDispatcher("Sample.html");
                rd.include(req, res);
                pw.println("<table class=\"tab\"><tr><td>Book Removed Successfully</td></tr></table>");
                pw.println(
                        "<table class=\"tab\"><tr><td><a href=\"RemoveBooks.html\">Remove more Books</a></td></tr></table>");

            } else {
                RequestDispatcher rd = req.getRequestDispatcher("Sample.html");
                rd.include(req, res);
                pw.println("<table class=\"tab\"><tr><td>Book Not Available In The Store</td></tr></table>");
                pw.println(
                        "<table class=\"tab\"><tr><td><a href=\"RemoveBooks.html\">Remove more Books</a></td></tr></table>");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
