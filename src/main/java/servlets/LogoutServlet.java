package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bittercode.constant.BookStoreConstants;
import com.bittercode.service.UserService;
import com.bittercode.service.impl.UserServiceImpl;

public class LogoutServlet extends HttpServlet {

    UserService authService = new UserServiceImpl();

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        PrintWriter pw = res.getWriter();
        res.setContentType(BookStoreConstants.CONTENT_TYPE_TEXT_HTML);
        try {

            boolean logout = authService.logout(req.getSession());

            RequestDispatcher rd = req.getRequestDispatcher("CustomerLogin.html");
            rd.include(req, res);
//            StoreUtil.setActiveTab(pw, "logout");
            if (logout) {
                pw.println("<table class=\"tab\"><tr><td>Successfully logged out!</td></tr></table>");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}