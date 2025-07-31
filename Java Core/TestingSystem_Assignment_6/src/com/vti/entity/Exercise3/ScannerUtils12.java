package com.vti.entity.Exercise3;

import java.util.Scanner;

public class ScannerUtils12 {
    private static Scanner scanner = new Scanner(System.in);

    public static int inputInt(String errorMessage ) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(errorMessage);
            }
        }
    }
    public static int inputAge() throws InvalidAgeInputingException {
        int age = inputInt("Wrong input! Please input an age as int. Try again:");
        if (age <= 0) {
            throw new InvalidAgeInputingException("The age must be greater than 0");
        }
        return age;
    }

    public static class InvalidAgeInputingException extends Exception {
        public InvalidAgeInputingException(String message) {
            super(message);
        }
    }
}
