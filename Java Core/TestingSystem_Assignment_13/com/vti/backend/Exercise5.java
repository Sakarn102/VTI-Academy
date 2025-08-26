package com.vti.backend;

import com.vti.entity.Connection;
import com.vti.entity.Dissconnection;

public class Exercise5 {
    public void Question1() throws Exception {
        try {
            Connection.isConnectedForTesting();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public void Question3() {
        try {
            Dissconnection.disconnect();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
