package com.bittercode.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.bittercode.constant.ErrorCodes;
import com.bittercode.model.StoreException;

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

    public static Connection getConnection() throws StoreException {

        if (connection == null) {
            throw new StoreException(ErrorCodes.DATABASE_CONNECTION_FAILURE);
        }

        return connection;
    }

}
