package com.bittercode.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DbInspectorMain {

    public static void main(String[] args) throws Exception {
        Connection con = null;
        try {
            con = DBUtil.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT username,password,usertype FROM users");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("username=" + rs.getString("username") + ", password=" + rs.getString("password") + ", usertype=" + rs.getInt("usertype"));
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

}
