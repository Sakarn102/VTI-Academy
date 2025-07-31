package com.vti.entity.Exercise3;

import java.util.Scanner;

public class Department {
    private Scanner scanner;
    private int id;
    private String name;
    public Department() throws Exception {
        scanner = new Scanner(System.in);
        id = inputId();
        name = inputName();
    }

    private String inputName() throws Exception{
        try {
            System.out.println("Enter name: ");
            name = scanner.nextLine();
            return name;
        } catch (Exception e) {
            throw new Exception("Please input a Name as String");
        }

    }

    private int inputId() throws Exception {
        try {
            System.out.println("Enter Id: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            return id;
        } catch (Exception e) {
            throw new Exception("Please input a ID as int");
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
