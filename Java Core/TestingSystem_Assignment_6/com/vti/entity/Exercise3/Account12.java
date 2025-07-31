package com.vti.entity.Exercise3;

import java.util.Scanner;

public class Account12 {
    private int age;

    public Account12() {
        inputAccountAge();
    }

    public void inputAccountAge() {
        while (true) {
            try {
                int inputAge = ScannerUtils12.inputAge();

                if(inputAge < 18) {
                    System.out.println("Your age must be greater than 18. Please input again:");
                    continue;
                }
                this.age = inputAge;
                System.out.println("Your age set to: " + age);
                break;
            } catch (ScannerUtils12.InvalidAgeInputingException e) {
                throw new RuntimeException(e.getMessage());
            }
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
