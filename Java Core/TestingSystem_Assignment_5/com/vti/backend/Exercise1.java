package com.vti.backend;

import com.vti.entity.Exercise1.Question1.New;
import com.vti.entity.Exercise1.Question2.Enrollment;

import java.util.Scanner;

public class Exercise1 {
    public void Question1(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("============MENU============");
        System.out.println("1. Insert news");
        System.out.println("2. View list news");
        System.out.println("3. Average rate");
        System.out.println("4. Exit");
        System.out.println("Enter lệnh: ");
        int order = scanner.nextInt();
        New newView = new New();

        switch (order) {
            case 1: {
                creatObjectNew(scanner);
                break;

            }
            case 2: {
                newView.Display();
                break;
            }
            case 3: {
                newView.Caculate(null);
                newView.Display();
                break;
            }

            default:
                System.exit(0);
        }
        System.out.println(newView.toString());
    }

    private static New creatObjectNew(Scanner scanner) {
        System.out.println("Bat dau tao object!");

        System.out.println("Vui long nhap title: ");
        String title = scanner.nextLine();

        System.out.println("Vui long nhap PublishDate: ");
        String pubString = scanner.nextLine();

        System.out.println("Vui long nhap Author: ");
        String author = scanner.nextLine();

        System.out.println("Vui long nhap content: ");
        String content = scanner.nextLine();

        int[] rates = new int[3];
        for(int i = 0; i < rates.length; i++) {
            System.out.println("Vui long nhap danh gia so " + (i + 1));
            rates[i] = scanner.nextInt();
        }
        return new New(1, title, pubString, author, content, rates);
    }
    public void Question2(){
        Scanner scanner = new Scanner(System.in);
        Enrollment enrollment = new Enrollment();

        while (true) {
            System.out.println("\n============ MENU ============");
            System.out.println("a. Thêm mới thí sinh");
            System.out.println("b. Hiển thị thông tin thí sinh");
            System.out.println("c. Tìm kiếm theo số báo danh");
            System.out.println("d. Thoát");

            System.out.println("Enter function: ");
            String functions = scanner.nextLine();

            switch (functions) {
                case "a": {
                    enrollment.addStudent();
                    break;
                }
                case "b": {
                    enrollment.printListStudent();
                    break;
                }
                case "c": {
                    System.out.println("Enter candidateId find: ");
                    String id = scanner.nextLine();
                    enrollment.searchStudent(id);
                    break;
                }
                case "d": {
                    System.out.println("Exit program");
                    enrollment.Exit();
                    break;
                }

                default:
                    break;
            }
        }
    }
}
