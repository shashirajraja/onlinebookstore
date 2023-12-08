package com.bittercode.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpSession;

import com.bittercode.constant.ResponseCode;
import com.bittercode.constant.db.UsersDBConstants;
import com.bittercode.model.StoreException;
import com.bittercode.model.User;
import com.bittercode.model.UserRole;
import com.bittercode.service.UserService;
import com.bittercode.util.DBUtil;

public class UserServiceImpl implements UserService {

    private static final String registerUserQuery = "INSERT INTO " + UsersDBConstants.TABLE_USERS
            + "  VALUES(?,?,?,?,?,?,?,?)";

    private static final String loginUserQuery = "SELECT * FROM " + UsersDBConstants.TABLE_USERS + " WHERE "
            + UsersDBConstants.COLUMN_USERNAME + "=? AND " + UsersDBConstants.COLUMN_PASSWORD + "=? AND "
            + UsersDBConstants.COLUMN_USERTYPE + "=?";

    @Override
    public User login(UserRole role, String email, String password, HttpSession session) throws StoreException {
        Connection con = DBUtil.getConnection();
        PreparedStatement ps;
        User user = null;
        try {
            String userType = UserRole.SELLER.equals(role) ? "1" : "2";
            ps = con.prepareStatement(loginUserQuery);
            ps.setString(1, email);
            ps.setString(2, password);
            ps.setString(3, userType);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                user = new User();
                user.setFirstName(rs.getString("firstName"));
                user.setLastName(rs.getString("lastName"));
                user.setPhone(rs.getLong("phone"));
                user.setEmailId(email);
                user.setPassword(password);
                session.setAttribute(role.toString(), user.getEmailId());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public boolean isLoggedIn(UserRole role, HttpSession session) {
        if (role == null)
            role = UserRole.CUSTOMER;
        return session.getAttribute(role.toString()) != null;
    }

    @Override
    public boolean logout(HttpSession session) {
        session.removeAttribute(UserRole.CUSTOMER.toString());
        session.removeAttribute(UserRole.SELLER.toString());
        session.invalidate();
        return true;
    }

    @Override
    public String register(UserRole role, User user) throws StoreException {
        String responseMessage = ResponseCode.FAILURE.name();
        Connection con = DBUtil.getConnection();
        try {
            PreparedStatement ps = con.prepareStatement(registerUserQuery);
            ps.setString(1, user.getEmailId());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getFirstName());
            ps.setString(4, user.getLastName());
            ps.setString(5, user.getAddress());
            ps.setLong(6, user.getPhone());
            ps.setString(7, user.getEmailId());
            int userType = UserRole.SELLER.equals(role) ? 1 : 2;
            ps.setInt(8, userType);
            int k = ps.executeUpdate();
            if (k == 1) {
                responseMessage = ResponseCode.SUCCESS.name();
                ;
            }
        } catch (Exception e) {
            responseMessage += " : " + e.getMessage();
            if (responseMessage.contains("Duplicate"))
                responseMessage = "User already registered with this email !!";
            e.printStackTrace();
        }
        return responseMessage;
    }

}
