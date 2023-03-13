package com.bittercode.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bittercode.constant.BookStoreConstants;
import com.bittercode.model.UserRole;

public class StoreUtil {

    public static boolean isLoggedIn(UserRole role, HttpSession session) {

        return session.getAttribute(role.toString()) != null;
    }

    public static boolean validateCustomerAndShowMenu(HttpServletRequest req, HttpServletResponse res)
            throws IOException, ServletException {
        res.setContentType(BookStoreConstants.CONTENT_TYPE_TEXT_HTML);
        RequestDispatcher rd = req.getRequestDispatcher("Sample.html");
        rd.include(req, res);
        PrintWriter pw = res.getWriter();
        printCustomerMenu(pw);
        if (!StoreUtil.isLoggedIn(UserRole.CUSTOMER, req.getSession())) {
            RequestDispatcher rd2 = req.getRequestDispatcher("UserLogin.html");
            rd2.include(req, res);
            pw.println("<table class=\"tab\"><tr><td>Please Login First to Continue!!</td></tr></table>");
            return true;
        }
        return false;
    }

    private static void printCustomerMenu(PrintWriter pw) throws IOException {

        pw.println("<header>\r\n"
                + "        <nav class=\"navbar navbar-expand-sm bg-dark\" style=\"margin-bottom:0px\">\r\n"
                + "            <a class=\"navbar-brand\"> <!-- The below line can be an image or a h1, either will work -->\r\n"
                + "                <img src=\"logo.png\" alt=\"Google logo\" width=\"60\" height=\"30px\">\r\n"
                + "            </a>\r\n"
                + "\r\n"
                + "            <button style=\"background-color: white;\" class=\"navbar-toggler\"\r\n"
                + "                type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\"\r\n"
                + "                aria-controls=\"navbarNav\" aria-expanded=\"false\"\r\n"
                + "                aria-label=\"Toggle navigation\">\r\n"
                + "                <span class=\"navbar-toggler-icon\"\r\n"
                + "                    style=\"color: #fff; font-size: 28px;\"></span>\r\n"
                + "            </button>\r\n"
                + "\r\n"
                + "            <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\r\n"
                + "                <ul class=\"navbar-nav\">\r\n"
                + "                    <li class=\"nav-item\"><span><a class=\"nav-link\"\r\n"
                + "                            href=\"viewbook\">Home</a></span></li>\r\n"
                + "                    <li class=\"nav-item \"><span><a class=\"nav-link active\"\r\n"
                + "                            href=\"viewbook\">Available Books</a></span></li>\r\n"
                + "                    <li class=\"nav-item \"><span><a class=\"nav-link\"\r\n"
                + "                            href=\"about.html\">About Us</a></span></li>\r\n"
                + "                    <li class=\"nav-item \"><span><a\r\n"
                + "                            class=\"nav-link glyphicon  glyphicon-shopping-cart \" href=\"cart\">Cart</a></span></li>\r\n"
                + "                    <li class=\"nav-item \"><span><a class=\"nav-link\"\r\n"
                + "                            href=\"logout\">Logout</a></span></li>\r\n"
                + "                </ul>\r\n"
                + "            </div>\r\n"
                + "        </nav>\r\n"
                + "    </header>"
                + "<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"></script>\r\n"
                + "    <script\r\n"
                + "        src=\"https://cdn.jsdelivr.net/npm/popper.js@1.14.6/dist/umd/popper.min.js\"></script>\r\n"
                + "    <script\r\n"
                + "        src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.2.1/dist/js/bootstrap.min.js\"></script>\r\n"
                + "    <script>\r\n"
                + "        // Preloder script\r\n"
                + "        var tmp = document.getElementById(\"loding\");\r\n"
                + "        function funload() {\r\n"
                + "            loding.style.display = \"none\";\r\n"
                + "        }\r\n"
                + "    </script>"
                + "");
    }

    public static void setActiveTab(PrintWriter pw, String activeTab) {

        pw.println("<script>document.getElementById(activeTab).classList.remove(\"active\");activeTab=" + activeTab
                + "</script>");
        pw.println("<script>document.getElementById('" + activeTab + "').classList.add(\"active\");</script>");

    }
}
