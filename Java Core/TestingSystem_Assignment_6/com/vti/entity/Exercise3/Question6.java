package com.vti.entity.Exercise3;

import java.util.Scanner;

public class Question6 {
    static Scanner scanner = new Scanner(System.in);
    static int age;
    public static int inputAge() {
        while(true){
            System.out.println("Enter age: ");
            String input = scanner.nextLine();
            try {
                age = Integer.parseInt(input);
                if (age <= 0) {
                    System.out.println("wrong inputing! Please input an age as int, input again.");
                    enterAge();
                } else {
                    return age;
                }
            } catch (NumberFormatException e) {
                System.out.println("wrong inputing! Please input an age as int, input again.");
            }
        }
    }

    public static void enterAge() {
        System.out.println("Enter age: ");
        age = scanner.nextInt();
    }
}
