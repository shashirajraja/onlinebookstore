package com.bittercode.util;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.bittercode.model.UserRole;

public class StoreUtil {

    public static boolean isLoggedIn(UserRole role, HttpSession session) {

        return session.getAttribute(role.toString()) != null;
    }

    public static void setActiveTab(PrintWriter pw, String activeTab) {

        pw.println("<script>document.getElementById(activeTab).classList.remove(\"active\");activeTab=" + activeTab
                + "</script>");
        pw.println("<script>document.getElementById('" + activeTab + "').classList.add(\"active\");</script>");

    }

    public static void updateCartItems(HttpServletRequest req) {
        String selectedBookId = req.getParameter("selectedBookId");
        HttpSession session = req.getSession();
        if (selectedBookId != null) { // add item to the cart
            String items = (String) session.getAttribute("items");
            if (req.getParameter("addToCart") != null) { // add to cart
                if (items == null)
                    items = selectedBookId;
                else if (!items.contains(selectedBookId))
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
                    items = items.replace(selectedBookId + ",", "");
                    items = items.replace("," + selectedBookId, "");
                    items = items.replace(selectedBookId, "");
                    session.setAttribute("items", items);
                }
            }
        }

    }
}
