package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bittercode.constant.BookStoreConstants;
import com.bittercode.model.Book;
import com.bittercode.model.Cart;
import com.bittercode.model.UserRole;
import com.bittercode.service.BookService;
import com.bittercode.service.impl.BookServiceImpl;
import com.bittercode.util.StoreUtil;
import com.mysql.cj.PreparedQuery;
import com.mysql.cj.Session;

public class SubmitReturnBook extends HttpServlet {

    BookService bookService = new BookServiceImpl();

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        PrintWriter pw = res.getWriter();
        res.setContentType(BookStoreConstants.CONTENT_TYPE_TEXT_HTML);
        if (!StoreUtil.isLoggedIn(UserRole.CUSTOMER, req.getSession())) {
            RequestDispatcher rd = req.getRequestDispatcher("CustomerLogin.html");
            rd.include(req, res);
            pw.println("<table class=\"tab\"><tr><td>Please Login First to Continue!!</td></tr></table>");
            return;
        }
        try {
            HttpSession session = req.getSession();
            RequestDispatcher rd = req.getRequestDispatcher("SubmitReturn.html");
            rd.include(req, res);
            StoreUtil.setActiveTab(pw, "return");

            String bookName, email, reason;

            bookName = req.getParameter("bookName");
            email = req.getParameter("email");
            reason = req.getParameter("reason");

            session.setAttribute("bookName", bookName);
            session.setAttribute("email", email);
            session.setAttribute("reason", reason);

            BookService bookService = new BookServiceImpl();
            bookService.addReturn(bookName, email, reason);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
