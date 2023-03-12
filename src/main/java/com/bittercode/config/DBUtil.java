package com.bittercode.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.http.HttpSession;

import com.bittercode.model.UserRole;

public class DBUtil {

    private static Connection connection;

    private DBUtil() {
    }

    static {

        try {

            Class.forName(DatabaseConfig.DRIVER_NAME);

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {

            connection = DriverManager.getConnection(DatabaseConfig.CONNECTION_STRING, DatabaseConfig.DB_USER_NAME,
                    DatabaseConfig.DB_PASSWORD);
        } catch (SQLException e) {

            e.printStackTrace();

        }

    }// End of static block

    public static Connection getConnection() {
        return connection;
    }

    public static boolean isLoggedIn(UserRole role, HttpSession session) {

        return session.getAttribute(role.toString()) != null;
    }
}
