package com.vti.backend;

import com.vti.entity.Exercise3.*;
import com.vti.frontend.Program2;

import javax.naming.AuthenticationException;

import java.util.Scanner;

import static com.vti.entity.Exercise3.Program2.divide;
import static com.vti.entity.Exercise3.Question5.inputAge;

public class Exercise3 {
    public void Question1() {
        try {
            float result = divide(7, 0);
        }catch (Exception e) {
            System.out.println("cannot divide 0");
        }
    }
    public void Question2() {
        try {
            float result = divide(7, 0);
        } finally {
            System.out.println("divide completed!");
        }
    }

    public void Question3() {
        Question3 question3 = new Question3();
        question3.print();
    }

    public void Question4() {
        Question4 question4 = new Question4();
        question4.getIndex();
    }

    public void Question5() {
        Question5 question5 = new Question5();
        int age = Question5.inputAge();
        System.out.println("Your age is: " + age);
    }

    public void Question6() {
        int age = Question6.inputAge();
        System.out.println("Your age is: " + age);
    }

    public void Question7() {
        System.out.println("Enter age: ");
        int age = ScannerUtils.inputInt("Wrong format!");

        System.out.println("Enter id: ");
        int id = ScannerUtils.inputInt("Wrong format!");

        System.out.println("Age: " + age);
        System.out.println("ID: " + id);

    }

    public void Question8() {
        System.out.println("Enter float: ");
        float inputFloat = Question8.inputFloat("Wrong format!...");

        System.out.println("Enter Double: ");
        double inputDouble = Question8.intputDouble("Wrong format!...");

        System.out.println("Enter string: ");
        String inputString = Question8.inputString();

        System.out.println("Float number: " + inputFloat);
        System.out.println("Double number: " + inputDouble);
        System.out.println("String: " + inputString);
    }

    public void Question9() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter select: ");
        System.out.println("1. Department");
        System.out.println("2. Position");
        int select = scanner.nextInt();
        /*try {
            select = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Please number 1 or 2 ...");
            return;
        }*/
        switch (select) {
            case 1:
                try {
                    Department department = new Department();
                    System.out.println("ID: " + department.getId());
                    System.out.println("Name: " + department.getName());
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                break;
            case 2:
                try {
                    Position position = new Position();
                    System.out.println("Position: " + position.getId());
                    System.out.println("Position: " + position.getName());
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn 1 hoặc 2.");
        }
    }

    public void Question10() {
        Group group = new Group();
        group.showInfo();
    }

    public void Question11() {
        Account account = new Account();
        try {
            account.inputAge();
        } catch (Account.InvalidAgeInputingException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void Question12() {
        Account12 account12 = new Account12();
        account12.inputAccountAge();
    }
}
