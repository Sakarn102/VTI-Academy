package com.vti.utils;

import com.mysql.cj.util.StringUtils;

import java.util.Scanner;

public class ScannerUtils {
    private static Scanner sc = new Scanner(System.in);
    public static int inputInt() {
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (Exception e) {
                System.out.println("Nhập lại...");
            }
        }
    }

    public static String inputString() {
        while (true) {
            String string = sc.nextLine();
            if (!StringUtils.isNullOrEmpty(string)) {
                return string;
            } else {
                System.err.println("Nhập lại:");
            }
        }
    }

    public static String inputPassword() {
        while (true) {
            String password = ScannerUtils.inputString();
            if (password.length() < 6 || password.length() > 12) {
                System.out.print("Nhập lại: ");
                continue;
            }
            boolean hasAtLeast1Character = false;
            for (int i = 0; i < password.length(); i++) {
                if (Character.isUpperCase(password.charAt(i)) == true) {
                    hasAtLeast1Character = true;
                    break;
                }
            }

            if (hasAtLeast1Character == true) {
                return password;
            } else {
                System.out.print("Mời bạn nhập lại password: ");
            }
        }
    }

    public static String inputEmail() {
        while (true) {
            String email = sc.nextLine();
            if (email == null || !email.matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")) {// a@b
                System.out.print("Nhập lại: ");
            } else {
                return email;
            }
        }
    }

}
