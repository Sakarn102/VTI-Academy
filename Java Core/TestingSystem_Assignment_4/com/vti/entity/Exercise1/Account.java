package com.vti.entity.Exercise1;

import java.time.LocalDate;

public class Account {
    public int id;
    public String email;
    public String userName;
    public String firstName;
    public String lastName;
    public Department department;
    public Position position;
    public LocalDate createDate;
    public String fullName;

    public Account() {

    }

    public Account(int id, String email, String userName, String firstName, String lastName) {
        this.id = id;
        this.email = email;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
    }

    public Account(int id, String email, String userName, String firstName, String lastName, Position position, LocalDate createDate) {
        this.id = id;
        this.email = email;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
        this.position = position;
        this.createDate = createDate;
    }

    public Account(int id, String email, String userName, String firstName, String lastName, Position position) {
        this.id = id;
        this.email = email;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
        this.position = position;
        this.createDate = LocalDate.of(2002, 1, 2);
    }
    public static void printA() {
        Account account1 = new Account();
        System.out.println("============Account A============");
        System.out.println("ID: " + account1.id);
        System.out.println("Email: " + account1.email);
        System.out.println("User Name: " + account1.userName);
        System.out.println("First Name: " + account1.firstName);
        System.out.println("Last Name: " + account1.lastName);
        System.out.println("Full Name: " + account1.fullName);
        System.out.println("Position: " + account1.position);
        System.out.println("Create Date: " + account1.createDate);
    }

    public static void printB() {
        Account account2 = new Account(2, "emailB@gmail.com", "UserName2", "FirstName2", "LastName2");
        System.out.println("============Account B============");
        System.out.println("ID: " + account2.id);
        System.out.println("Email: " + account2.email);
        System.out.println("User Name: " + account2.userName);
        System.out.println("First Name: " + account2.firstName);
        System.out.println("Last Name: " + account2.lastName);
        System.out.println("Full Name: " + account2.fullName);
        System.out.println("Position: " + account2.position);
        System.out.println("Create Date: " + account2.createDate);
    }

    public static void printC() {
        Position pos = new Position(1, Position.PositionName.Dev);
        Account account3 = new Account(3, "emailC@gmail.com", "UserName3", "FirstName3", "LastName3", pos, LocalDate.now());
        System.out.println("============Account C============");
        System.out.println("ID: " + account3.id);
        System.out.println("Email: " + account3.email);
        System.out.println("User Name: " + account3.userName);
        System.out.println("First Name: " + account3.firstName);
        System.out.println("Last Name: " + account3.lastName);
        System.out.println("Full Name: " + account3.fullName);
        System.out.println("Position: " + account3.position.name);
        System.out.println("Create Date: " + account3.createDate);
    }

    public static void printD() {
        Position pos = new Position(1, Position.PositionName.Dev);
        Account account4 = new Account(4, "emailC@gmail.com", "UserName4", "FirstName4", "LastName4", pos);
        System.out.println("============Account D============");
        System.out.println("ID: " + account4.id);
        System.out.println("Email: " + account4.email);
        System.out.println("User Name: " + account4.userName);
        System.out.println("First Name: " + account4.firstName);
        System.out.println("Last Name: " + account4.lastName);
        System.out.println("Full Name: " + account4.fullName);
        System.out.println("Position: " + account4.position.name);
        System.out.println("Create Date: " + account4.createDate);
    }
}
