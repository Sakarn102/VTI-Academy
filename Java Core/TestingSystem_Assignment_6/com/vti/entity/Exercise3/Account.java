package com.vti.entity.Exercise3;

import java.util.Scanner;

public class Account {
    private int id;
    private String userName;
    private int age;

    public Account() {
        id = ScannerUtils.inputInt("Enter id (Interger): ");
        System.out.println("Enter name: ");
        userName = ScannerUtils.inputString();
        age = ScannerUtils.inputInt("Enter age: ");
    }

    public void showInfo() {
        System.out.println("ID: " + id + " | Username: " + userName + " | Age: " + age);
    }

    public void inputAge() throws InvalidAgeInputingException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your age: ");
        try {
            int input = Integer.parseInt(scanner.nextLine());
            if (input <= 0) {
                throw new InvalidAgeInputingException("The age must be greater than 0");
            }
            this.age = input;
            System.out.println("Age set to: " + age);
        } catch (NumberFormatException e) {
            throw new InvalidAgeInputingException("Invalid input! Age must be a number.");
        }
    }

    public static class InvalidAgeInputingException extends Exception {
        public InvalidAgeInputingException(String message) {
            super(message);
        }
    }

    public int getAge() {
        return age;
    }
}
