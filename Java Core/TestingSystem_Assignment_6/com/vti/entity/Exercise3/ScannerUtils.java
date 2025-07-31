package com.vti.entity.Exercise3;

import java.util.Scanner;

public class ScannerUtils {
    private static Scanner scanner = new Scanner(System.in);
    public static int inputInt(String errorMessage ) {
        while (true) {
            String input = scanner.nextLine();
            try {
                int value = Integer.parseInt(input);
                if (value <= 0) {
                    System.out.println("Wrong inputing! The number must be greater than 0, please input again.");
                } else {
                    return value;
                }
            } catch (NumberFormatException e) {
                System.out.println(errorMessage);
            }
        }
    }
    public static String inputString() {
        return scanner.nextLine();
    }
}
