package com.vti.backend;

import com.vti.entity.Account;
import com.vti.entity.Department;

import java.util.List;
import java.util.Scanner;

import static com.vti.backend.DepartmentDao.*;

public class Exercise2 {
    public void Question1() throws Exception {
        try {
            DepartmentDao departmentDao = new DepartmentDao();
            departmentDao.getDepartment();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void Question2() throws Exception {
        try {
            DepartmentDao departmentDao = new DepartmentDao();
            departmentDao.getDepartment5(5);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void Question3() throws Exception {
        try {
            DepartmentDao departmentDao = new DepartmentDao();
            Department dep = departmentDao.getDepartment_5();
            if (dep != null) {
                System.out.println(dep);
            } else {
                System.out.println("Don't find!...");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void Question4() throws Exception {
        try {
            DepartmentDao departmentDao = new DepartmentDao();
            boolean dep = departmentDao.isDepartmentNameExists("Sale");
            if (dep == true) {
                System.out.println(dep);
            } else {
                System.out.println("Don't find!...");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void Question5() {
            Scanner scanner = new Scanner(System.in);
            DepartmentDao departmentDao = new DepartmentDao();

            System.out.println("Enter department name add: ");
            String departmentName = scanner.nextLine();

            try {
                departmentDao.createDepartment(departmentName);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
            scanner.close();
    }
    public void Question6() {
        DepartmentDao departmentDao = new DepartmentDao();
        try {
            departmentDao.updateDepartmentName(9, "ABC");
        } catch (Exception e) {
            e.getMessage();
        }
    }
    public void Question7() {
        DepartmentDao departmentDao = new DepartmentDao();
        try {
            departmentDao.deleteDepartment(11);
        } catch (Exception e) {
            e.getMessage();
        }
    }
    public void Question8_Add() throws Exception {
        AccountDAO accountDAO = new AccountDAO();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter email: ");
        String email = scanner.nextLine();

        System.out.println("Enter userName: ");
        String userName = scanner.nextLine();

        System.out.println("Enter fullname: ");
        String fullName = scanner.nextLine();

        System.out.println("Enter department id: ");
        int departmentId = scanner.nextInt();

        System.out.println("Enter position id: ");
        int positionId = scanner.nextInt();

        try {
            accountDAO.createAccount(email, userName, fullName, departmentId, positionId);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
    public void Question8_Account() throws Exception {
        AccountDAO accountDAO = new AccountDAO();
        try {
            List<Account> accounts = accountDAO.getAccount();
            for (Account account : accounts) {
                System.out.println(account);
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public void Question8_Update() {
        AccountDAO accountDAO = new AccountDAO();
        try {
            accountDAO.updateAccountEmail(14, "email14@gmail.com");
        } catch (Exception e) {
            e.getMessage();
        }
    }
    public void Question8_Delete() {
        AccountDAO accountDAO = new AccountDAO();
        try {
            accountDAO.deleteAccount(14);
        } catch (Exception e) {
            e.getMessage();
        }
    }


}
