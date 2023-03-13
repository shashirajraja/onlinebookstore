package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.UUID;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bittercode.constant.BookStoreConstants;
import com.bittercode.constant.db.BooksDBConstants;
import com.bittercode.model.Book;
import com.bittercode.model.UserRole;
import com.bittercode.service.BookService;
import com.bittercode.service.impl.BookServiceImpl;
import com.bittercode.util.StoreUtil;

public class AddBookServlet extends HttpServlet {
    BookService bookService = new BookServiceImpl();

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        PrintWriter pw = res.getWriter();
        res.setContentType(BookStoreConstants.CONTENT_TYPE_TEXT_HTML);

        if (!StoreUtil.isLoggedIn(UserRole.SELLER, req.getSession())) {
            RequestDispatcher rd = req.getRequestDispatcher("AdminLogin.html");
            rd.include(req, res);
            pw.println("<table class=\"tab\"><tr><td>Please Login First to Continue!!</td></tr></table>");
            return;
        }

        String uniqueID = UUID.randomUUID().toString();
        String bCode = uniqueID;
        String bName = req.getParameter(BooksDBConstants.COLUMN_NAME);
        String bAuthor = req.getParameter(BooksDBConstants.COLUMN_AUTHOR);
        double bPrice = Integer.parseInt(req.getParameter(BooksDBConstants.COLUMN_PRICE));
        int bQty = Integer.parseInt(req.getParameter(BooksDBConstants.COLUMN_QUANTITY));

        try {
            Book book = new Book(bCode, bName, bAuthor, bPrice, bQty);
            String message = bookService.addBook(book);
            if ("SUCCESS".equalsIgnoreCase(message)) {
                RequestDispatcher rd = req.getRequestDispatcher("AddBook.html");
                rd.include(req, res);
                pw.println(
                        "<table class=\"tab\"><tr><td>Book Detail Updated Successfully!<br/>Add More Books</td></tr></table>");
            } else {
                RequestDispatcher rd = req.getRequestDispatcher("AddBook.html");
                pw.println("<table class=\"tab\"><tr><td>Failed to Add Books! Fill up CareFully</td></tr></table>");
                rd.include(req, res);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
