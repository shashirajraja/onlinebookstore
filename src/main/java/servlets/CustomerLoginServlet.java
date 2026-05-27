package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bittercode.constant.BookStoreConstants;
import com.bittercode.constant.db.UsersDBConstants;
import com.bittercode.model.User;
import com.bittercode.model.UserRole;
import com.bittercode.service.UserService;
import com.bittercode.service.impl.UserServiceImpl;

public class CustomerLoginServlet extends HttpServlet {

    UserService authService = new UserServiceImpl();

    // Database connection variables (if needed for JDBC)
    private static final String DB_HOST = System.getenv("DB_URL");
    private static final String DB_USERNAME = System.getenv("DB_USERNAME");
    private static final String DB_PASSWORD = System.getenv("DB_PASSWORD");
    private static final String DB_NAME = System.getenv("DB_NAME");
    private static final String DB_DRIVER = "org.postgresql.Driver";

    // Post method for login
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        PrintWriter pw = res.getWriter();
        res.setContentType(BookStoreConstants.CONTENT_TYPE_TEXT_HTML);

        // Get the username and password from request parameters
        String uName = req.getParameter(UsersDBConstants.COLUMN_USERNAME);
        String pWord = req.getParameter(UsersDBConstants.COLUMN_PASSWORD);

        // Authenticate the user using the UserService
        User user = null;
        try {
            // Assuming login() is implemented correctly in UserService
            user = authService.login(UserRole.CUSTOMER, uName, pWord, req.getSession());

            if (user != null) {
                // Redirect to customer home page upon successful login
                RequestDispatcher rd = req.getRequestDispatcher("CustomerHome.html");
                rd.include(req, res);
                pw.println("<div id=\"topmid\"><h1>Welcome to Online <br>Book Store</h1></div>");
                pw.println("<br><table class=\"tab\"><tr><td><p>Welcome " + user.getFirstName() + ", Happy Learning !!</p></td></tr></table>");
            } else {
                // If authentication fails, show an error message and reload the login page
                RequestDispatcher rd = req.getRequestDispatcher("CustomerLogin.html");
                rd.include(req, res);
                pw.println("<table class=\"tab\"><tr><td>Incorrect UserName or PassWord</td></tr></table>");
            }

        } catch (Exception e) {
            e.printStackTrace();
            pw.println("<table class=\"tab\"><tr><td>There was an error. Please try again later.</td></tr></table>");
        }
    }

}
