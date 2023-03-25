package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Optional;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bittercode.constant.ResponseCode;
import com.bittercode.model.StoreException;
import com.bittercode.model.UserRole;
import com.bittercode.util.StoreUtil;

public class ErrorHandlerServlet extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        PrintWriter pw = res.getWriter();
        res.setContentType("text/html");

        // Fetch the exceptions
        Throwable throwable = (Throwable) req.getAttribute("javax.servlet.error.exception");
        Integer statusCode = (Integer) req.getAttribute("javax.servlet.error.status_code");
        String servletName = (String) req.getAttribute("javax.servlet.error.servlet_name");
        String requestUri = (String) req.getAttribute("javax.servlet.error.request_uri");
        String errorMessage = ResponseCode.INTERNAL_SERVER_ERROR.getMessage();
        String errorCode = ResponseCode.INTERNAL_SERVER_ERROR.name();

        if (statusCode == null)
            statusCode = 0;
        Optional<ResponseCode> errorCodes = ResponseCode.getMessageByStatusCode(statusCode);
        if (errorCodes.isPresent()) {
            errorMessage = errorCodes.get().getMessage();
            errorCode = errorCodes.get().name();
        }

        if (throwable != null && throwable instanceof StoreException) {
            StoreException storeException = (StoreException) throwable;
            if (storeException != null) {
                errorMessage = storeException.getMessage();
                statusCode = storeException.getStatusCode();
                errorCode = storeException.getErrorCode();
                storeException.printStackTrace();
            }
        }

        System.out.println("======ERROR TRIGGERED========");
        System.out.println("Servlet Name: " + servletName);
        System.out.println("Request URI: " + requestUri);
        System.out.println("Status Code: " + statusCode);
        System.out.println("Error Code: " + errorCode);
        System.out.println("Error Message: " + errorMessage);
        System.out.println("=============================");

        if (StoreUtil.isLoggedIn(UserRole.CUSTOMER, req.getSession())) {
            RequestDispatcher rd = req.getRequestDispatcher("CustomerHome.html");
            rd.include(req, res);
            StoreUtil.setActiveTab(pw, "home");
            showErrorMessage(pw, errorCode, errorMessage);

        } else if (StoreUtil.isLoggedIn(UserRole.SELLER, req.getSession())) {
            RequestDispatcher rd = req.getRequestDispatcher("SellerHome.html");
            rd.include(req, res);
            StoreUtil.setActiveTab(pw, "home");
            showErrorMessage(pw, errorCode, errorMessage);

        } else {
            RequestDispatcher rd = req.getRequestDispatcher("index.html");
            rd.include(req, res);
            pw.println("<script>"
                    + "document.getElementById('topmid').innerHTML='';"
                    + "document.getElementById('happy').innerHTML='';"
                    + "</script>");
            showErrorMessage(pw, errorCode, errorMessage);
        }

    }

    private void showErrorMessage(PrintWriter pw, String errorCode, String errorMessage) {
        pw.println("<div class='container my-5'>"
                + "<div class=\"alert alert-success\" role=\"alert\" style='max-width:450px; text-align:center; margin:auto;'>\r\n"
                + "  <h4 class=\"alert-heading\">"
                + errorCode
                + "</h4>\r\n"
                + "  <hr>\r\n"
                + "  <p class=\"mb-0\">"
                + errorMessage
                + "</p>\r\n"
                + "</div>"
                + "</div>");

    }

}
