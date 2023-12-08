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

public class CartServlet extends HttpServlet {

    BookService bookService = new BookServiceImpl();

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        PrintWriter pw = res.getWriter();
        res.setContentType(BookStoreConstants.CONTENT_TYPE_TEXT_HTML);

        // Check if Customer is logged In
        if (!StoreUtil.isLoggedIn(UserRole.CUSTOMER, req.getSession())) {
            RequestDispatcher rd = req.getRequestDispatcher("CustomerLogin.html");
            rd.include(req, res);
            pw.println("<table class=\"tab\"><tr><td>Please Login First to Continue!!</td></tr></table>");
            return;
        }
        try {
            // Add/Remove Item from the cart if requested
            // store the comma separated bookIds of cart in the session
            StoreUtil.updateCartItems(req);

            HttpSession session = req.getSession();
            String bookIds = "";
            if (session.getAttribute("items") != null)
                bookIds = (String) session.getAttribute("items");// read comma separated bookIds from session

            RequestDispatcher rd = req.getRequestDispatcher("CustomerHome.html");
            rd.include(req, res);

            // Set the active tab as cart
            StoreUtil.setActiveTab(pw, "cart");

            // Read the books from the database with the respective bookIds
            List<Book> books = bookService.getBooksByCommaSeperatedBookIds(bookIds);
            List<Cart> cartItems = new ArrayList<Cart>();
            pw.println("<div id='topmid' style='background-color:grey'>Shopping Cart</div>");
            pw.println("<table class=\"table table-hover\" style='background-color:white'>\r\n"
                    + "  <thead>\r\n"
                    + "    <tr style='background-color:black; color:white;'>\r\n"
                    + "      <th scope=\"col\">BookId</th>\r\n"
                    + "      <th scope=\"col\">Name</th>\r\n"
                    + "      <th scope=\"col\">Author</th>\r\n"
                    + "      <th scope=\"col\">Price/Item</th>\r\n"
                    + "      <th scope=\"col\">Quantity</th>\r\n"
                    + "      <th scope=\"col\">Amount</th>\r\n"
                    + "    </tr>\r\n"
                    + "  </thead>\r\n"
                    + "  <tbody>\r\n");
            double amountToPay = 0;
            if (books == null || books.size() == 0) {
                pw.println("    <tr style='background-color:green'>\r\n"
                        + "      <th scope=\"row\" colspan='6' style='color:yellow; text-align:center;'> No Items In the Cart </th>\r\n"
                        + "    </tr>\r\n");
            }
            for (Book book : books) {
                int qty = (int) session.getAttribute("qty_" + book.getBarcode());
                Cart cart = new Cart(book, qty);
                cartItems.add(cart);
                amountToPay += (qty * book.getPrice());
                pw.println(getRowData(cart));
            }

            // set cartItems and amountToPay in the session
            session.setAttribute("cartItems", cartItems);
            session.setAttribute("amountToPay", amountToPay);

            if (amountToPay > 0) {
                pw.println("    <tr style='background-color:green'>\r\n"
                        + "      <th scope=\"row\" colspan='5' style='color:yellow; text-align:center;'> Total Amount To Pay </th>\r\n"
                        + "      <td colspan='1' style='color:white; font-weight:bold'><span>&#8377;</span> "
                        + amountToPay
                        + "</td>\r\n"
                        + "    </tr>\r\n");
            }
            pw.println("  </tbody>\r\n"
                    + "</table>");
            if (amountToPay > 0) {
                pw.println("<div style='text-align:right; margin-right:20px;'>\r\n"
                        + "<form action=\"checkout\" method=\"post\">"
                        + "<input type='submit' class=\"btn btn-primary\" name='pay' value='Proceed to Pay &#8377; "
                        + amountToPay + "'/></form>"
                        + "    </div>");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getRowData(Cart cart) {
        Book book = cart.getBook();
        return "    <tr>\r\n"
                + "      <th scope=\"row\">" + book.getBarcode() + "</th>\r\n"
                + "      <td>" + book.getName() + "</td>\r\n"
                + "      <td>" + book.getAuthor() + "</td>\r\n"
                + "      <td><span>&#8377;</span> " + book.getPrice() + "</td>\r\n"
                + "      <td><form method='post' action='cart'><button type='submit' name='removeFromCart' class=\"glyphicon glyphicon-minus btn btn-danger\"></button> "
                + "<input type='hidden' name='selectedBookId' value='" + book.getBarcode() + "'/>"
                + cart.getQuantity()
                + " <button type='submit' name='addToCart' class=\"glyphicon glyphicon-plus btn btn-success\"></button></form></td>\r\n"
                + "      <td><span>&#8377;</span> " + (book.getPrice() * cart.getQuantity()) + "</td>\r\n"
                + "    </tr>\r\n";
    }

}
