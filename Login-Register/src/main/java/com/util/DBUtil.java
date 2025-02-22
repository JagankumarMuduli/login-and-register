package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	 private static final String URL = "jdbc:mysql://localhost:3306/login";
	 private static final String USERNAME = "root";
	 private static final String PASSWORD = "password";
    static {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}
