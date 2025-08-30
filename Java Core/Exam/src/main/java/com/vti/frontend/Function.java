package com.vti.frontend;

import com.vti.backend.presentationlayer.UserController;
import com.vti.entity.Employee;
import com.vti.entity.Manager;
import com.vti.entity.User;
import com.vti.utils.ScannerUtils;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Function {
    private UserController userController;
    public Function() {
        userController = new UserController();
        Scanner scanner = new Scanner(System.in);
    }
    public void getEmployeeById(int projectId) throws Exception {
        List<Employee> employees = userController.getEmployeesByProjectId(projectId);

        if (employees.isEmpty()) {
            System.out.println("Không có Employee nào trong project ID: " + projectId);
        } else {
            System.out.println("===== EMPLOYEES in Project " + projectId + " =====");
            for (Employee e : employees) {
                System.out.println(e);
            }
        }
    }

    public void getManager() throws Exception {
        try {
            List<Manager> managers = userController.getManager();
            if (managers.isEmpty()) {
                System.out.println("Không có Manager nào!");
                return;
            }

            System.out.println("===== DANH SÁCH MANAGER =====");
            for (Manager m : managers) {
                System.out.println("ID: " + m.getId()
                        + " | FullName: " + m.getFullName()
                        + " | Email: " + m.getEmail()
                        + " | ProjectID: " + m.getProjectId()
                        + " | ExpInYear: " + m.getExpInYear());
            }
            System.out.println("=============================");
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
    public void login() throws Exception {
        while (true) {
            try {
                System.out.println("Moi ban nhap email: ");
                String email = ScannerUtils.inputEmail();

                System.out.println("Moi ban nhap pass word: ");
                String password = ScannerUtils.inputPassword();

                Manager manager = new UserController().loginManager(email, password);

                if (manager != null) {
                    System.out.println("Chao mung " + manager.getFullName() + " ( " + manager.getRole() + " ) " + " login...");
                    break;
                } else {
                    System.out.println("Ban xem lai Email/Password khong dung! Moi ban dang nhap lai!");
                }
            } catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }

}
