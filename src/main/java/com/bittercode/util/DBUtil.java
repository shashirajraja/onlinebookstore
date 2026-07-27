package com.bittercode.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.bittercode.constant.ResponseCode;
import com.bittercode.model.StoreException;

public class DBUtil {

    private static Connection connection;

    static {

        try {

            Class.forName(DatabaseConfig.DRIVER_NAME);

            try {
                connection = DriverManager.getConnection(DatabaseConfig.CONNECTION_STRING, DatabaseConfig.DB_USER_NAME,
                        DatabaseConfig.DB_PASSWORD);
            } catch (SQLException connEx) {
                // Attempt to create database and tables if they don't exist, then reconnect
                try {
                    String serverUrl = DatabaseConfig.DB_HOST + ":" + DatabaseConfig.DB_PORT + "/";
                    Connection adminCon = DriverManager.getConnection(serverUrl, DatabaseConfig.DB_USER_NAME,
                            DatabaseConfig.DB_PASSWORD);
                    Statement st = adminCon.createStatement();
                    st.executeUpdate("CREATE DATABASE IF NOT EXISTS " + DatabaseConfig.DB_NAME);
                    st.executeUpdate("USE " + DatabaseConfig.DB_NAME);
                    // Ensure tables exist (users and books)
                    st.executeUpdate("CREATE TABLE IF NOT EXISTS users ("
                            + "username VARCHAR(100) PRIMARY KEY,"
                            + "password VARCHAR(100) NOT NULL,"
                            + "firstname VARCHAR(100) NOT NULL,"
                            + "lastname VARCHAR(100) NOT NULL,"
                            + "address TEXT NOT NULL,"
                            + "phone BIGINT NOT NULL,"
                            + "mailid VARCHAR(100) NOT NULL,"
                            + "usertype INT)"
                    );
                    st.executeUpdate("CREATE TABLE IF NOT EXISTS books ("
                            + "barcode VARCHAR(100) PRIMARY KEY,"
                            + "name TEXT NOT NULL,"
                            + "author VARCHAR(100) NOT NULL,"
                            + "price INT,"
                            + "quantity REAL)"
                    );
                    // Insert a default test user if not present
                    st.executeUpdate("INSERT IGNORE INTO users(username,password,firstname,lastname,address,phone,mailid,usertype) VALUES ('test@user.com','password','Test','User','Default Address',1234567890,'test@user.com',2)");
                    st.close();
                    adminCon.close();

                    // try connecting again
                    connection = DriverManager.getConnection(DatabaseConfig.CONNECTION_STRING,
                            DatabaseConfig.DB_USER_NAME, DatabaseConfig.DB_PASSWORD);
                } catch (SQLException adminEx) {
                    adminEx.printStackTrace();
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }// End of static block

    public static Connection getConnection() throws StoreException {

        if (connection == null) {
            throw new StoreException(ResponseCode.DATABASE_CONNECTION_FAILURE);
        }

        return connection;
    }

}
