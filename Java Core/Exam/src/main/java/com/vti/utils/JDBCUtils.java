package com.vti.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCUtils {
    private static Connection connection;

    public Connection getConnection() throws Exception {
        if (connection == null || connection.isClosed()) {
            String url = "jdbc:mysql://localhost:3306/exam";
            String username = "root";
            String password = "root";

            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(url, username, password);
        }
        return connection;
    }

    public void disconnect() throws Exception {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }

}
