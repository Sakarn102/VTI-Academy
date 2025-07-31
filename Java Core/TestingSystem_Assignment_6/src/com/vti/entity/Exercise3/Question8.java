package com.vti.entity.Exercise3;

import java.util.Scanner;

public class Question8 {
    private static Scanner scanner = new Scanner(System.in);
    public static float inputFloat(String errorMessage) {
        while (true) {
            String inputFloat = scanner.nextLine();
            try {
                return Float.parseFloat(inputFloat);
            } catch (NumberFormatException e) {
                System.out.println(errorMessage);
            }
        }
    }
    public static double intputDouble(String errorMessage) {
        while (true) {
            String inputDouble = scanner.nextLine();
            try {
                return Double.parseDouble(inputDouble);
            } catch (NumberFormatException e) {
                System.out.println(errorMessage);
            }
        }
    }
    public static String inputString() {
        String inputString;
        return  inputString = scanner.nextLine();
    }
}
