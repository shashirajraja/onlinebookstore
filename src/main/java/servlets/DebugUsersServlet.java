package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bittercode.util.DBUtil;

public class DebugUsersServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/plain");
        PrintWriter pw = resp.getWriter();
        try {
            Connection con = DBUtil.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT username,password,usertype FROM users");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                pw.println("username=" + rs.getString("username") + ", password=" + rs.getString("password") + ", usertype=" + rs.getInt("usertype"));
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            pw.println("ERROR: " + e.getMessage());
            e.printStackTrace(pw);
        }
    }

}
