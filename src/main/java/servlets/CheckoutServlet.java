package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bittercode.constant.BookStoreConstants;
import com.bittercode.model.UserRole;
import com.bittercode.util.StoreUtil;

public class CheckoutServlet extends HttpServlet {
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

            RequestDispatcher rd = req.getRequestDispatcher("payment.html");
            rd.include(req, res);
            StoreUtil.setActiveTab(pw, "cart");
            pw.println("Total Amount<span class=\"price\" style=\"color: black\"><b>&#8377; "
                    + req.getSession().getAttribute("amountToPay")
                    + "</b></span>");

            pw.println("<input type=\"submit\" value=\"Pay & Place Order\" class=\"btn\">"
                    + "</form>");

            pw.println("</div>\r\n"
                    + " </div>\r\n"
                    + " </div>\r\n"
                    + " </div>");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
