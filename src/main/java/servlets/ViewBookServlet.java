package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bittercode.model.Book;
import com.bittercode.model.UserRole;
import com.bittercode.service.BookService;
import com.bittercode.service.impl.BookServiceImpl;
import com.bittercode.util.StoreUtil;

public class ViewBookServlet extends HttpServlet {
    BookService bookService = new BookServiceImpl();

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        PrintWriter pw = res.getWriter();
        res.setContentType("text/html");
        if (!StoreUtil.isLoggedIn(UserRole.CUSTOMER, req.getSession())) {
            RequestDispatcher rd = req.getRequestDispatcher("UserLogin.html");
            rd.include(req, res);
            pw.println("<table class=\"tab\"><tr><td>Please Login First to Continue!!</td></tr></table>");
            return;
        }
        try {

            List<Book> books = bookService.getAllBooks();
            RequestDispatcher rd = req.getRequestDispatcher("Sample.html");
            rd.include(req, res);
            StoreUtil.setActiveTab(pw, "books");
            pw.println("<div class=\"container\">\r\n"
                    + "        <div class=\"card-columns\">");

            String selectedBookId = req.getParameter("selectedBookId");
            HttpSession session = req.getSession();
            if (selectedBookId != null) { // add item to the cart
                String items = (String) session.getAttribute("items");
                if (req.getParameter("addToCart") != null) { // add to cart
                    if (items == null)
                        items = selectedBookId;
                    else
                        items = items + "," + selectedBookId;
                    session.setAttribute("items", items);

                    int itemQty = 0;
                    if (session.getAttribute("qty_" + selectedBookId) != null)
                        itemQty = (int) session.getAttribute("qty_" + selectedBookId);
                    itemQty += 1;

                    session.setAttribute("qty_" + selectedBookId, itemQty);
                } else { // remove from the cart
                    int itemQty = 0;
                    if (session.getAttribute("qty_" + selectedBookId) != null)
                        itemQty = (int) session.getAttribute("qty_" + selectedBookId);
                    if (itemQty > 1) {
                        itemQty--;
                        session.setAttribute("qty_" + selectedBookId, itemQty);
                    } else {
                        session.removeAttribute("qty_" + selectedBookId);
                        items.replace(selectedBookId + ",", "");
                        items.replace(selectedBookId, "");
                        session.setAttribute("items", items);
                    }
                }
            }

            for (Book book : books) {
                pw.println(this.addBookToCard(session, book.getBarcode(), book.getName(), book.getAuthor(),
                        book.getPrice(),
                        book.getQuantity()));

            }

            pw.println("</div>\r\n"
                    + "<form action=\"cart\" method=\"post\">"
                    + "<input type='submit' class=\"btn btn-primary\" name='addToCart' value='View Cart'/></form>"
                    + "    </div>");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String addBookToCard(HttpSession session, String bCode, String bName, String bAuthor, double bPrice,
            int bQty) {
        String button = "<p class=\"btn btn-danger\">Out Of Stock</p>\r\n";
        int cartItemQty = 0;
        if (session.getAttribute("qty_" + bCode) != null)
            cartItemQty = (int) session.getAttribute("qty_" + bCode);

        if (bQty > 0) {
            button = "<form action=\"viewbook\" method=\"post\">"
                    + "<input type='hidden' name = 'selectedBookId' value = " + bCode + ">"
                    + "<input type='hidden' name='qty_" + bCode + "' value='1'/>"
                    + "<input type='submit'"
                    + (cartItemQty == 0 ? "class=\"btn btn-primary\" name='addToCart' value='Add To Cart'"
                            : "class=\"btn btn-warning\" name='removeFromCart' value='Remove From Cart'")
                    + "/></form>";
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
                + "                        <span>Id: " + bCode + "</span>\r\n"
                + (bQty < 20 ? "<br><span class=\"text-danger\">Only " + bQty + " items left</span>\r\n"
                        : "<br><span class=\"text-success\">Trending</span>\r\n")
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
