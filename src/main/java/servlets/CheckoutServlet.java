package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bittercode.config.DBUtil;
import com.bittercode.constant.BookStoreConstants;
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

            RequestDispatcher rd = req.getRequestDispatcher("payment.html");
            rd.include(req, res);

            pw.println("<input type=\"submit\" value=\"Pay & Place Order\" class=\"btn\">\r\n"
                    + "                    </form>\r\n"
                    + "                </div>\r\n"
                    + "            </div>");
            pw.println("<div class=\"col-25\">\r\n"
                    + "                <div class=\"container\" >\r\n");

            pw.println("<hr>\r\n"
                    + "                    <p>\r\n"
                    + "                        Total Amount<span class=\"price\" style=\"color: black\"><b>&#8377; "
                    + req.getSession().getAttribute("amountToPay")
                    + "</b></span>\r\n"
                    + "                    </p>");
            pw.println("</div>\r\n"
                    + "    </div>");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
