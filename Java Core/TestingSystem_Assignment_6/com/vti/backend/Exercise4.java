package com.vti.backend;

import com.vti.entity.Exercise4.FileManager;

import java.io.File;

public class Exercise4 {
    public void Question1() {
        FileManager fileManager = new FileManager();
        String path = "C:\\Users\\tuf\\OneDrive\\Desktop";

        // Question 1: Check File Exists
        if (fileManager.isPathExists(path)) {
            System.out.println("File exists.");
        } else {
            System.out.println("File not found.");
        }
    }
    public void Question2() {
        }
    }
