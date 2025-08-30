package com.vti.frontend;

import java.util.Scanner;

public class Program {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        functionUser();
    }
    public static void functionUser() throws Exception {
        Function function = new Function();
        System.out.println("Moi nhap lua chon");
        System.out.println("1. In thong tin tat ca Employee");
        System.out.println("2. In ra thong tin tat ca Manager");
        System.out.println("3. Login manager");
        System.out.println("Chon chuc  nang: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        switch (n) {
            case 1:
                System.out.println("Nhap project id tim kiem: ");
                int idSearch = scanner.nextInt();
                function.getEmployeeById(idSearch);
                break;
            case 2:
                function.getManager();
                break;
            case 3:
                function.login();
                break;
        }
    }
}
