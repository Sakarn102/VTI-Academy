package com.vti.entity;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {
    public static void isConnectedForTesting() throws Exception{
        try {
            String url = "jdbc:mysql://localhost:3306/testingsystem";
            String userName = "root";
            String password = "root";
            Connection connection = (Connection) DriverManager.getConnection(url, userName, password);
            System.out.println("Connect success to database!");
        } catch (SQLException exception) {
            throw new SQLException("Connect fail to database!");
        } catch (Exception e) {
            throw new Exception("Connect fail to database!");
        }
    }

}
