package com.vti.entity;

import java.sql.Connection;

public class Dissconnection {
    public static Connection connectionn;

    public static  void disconnect() throws Exception{
        try {
            if (connectionn != null && !connectionn.isClosed()) {
                connectionn.close();
                System.out.println("Connection closed!");
            } else {
                System.out.println("Don't connection!");
            }
        } catch (Exception e) {
            throw new Exception("Cannot disconnect from database: " + e.getMessage());
        }
    }
}
