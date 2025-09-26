package org.example.service.BaiTap;

import org.example.entity.Account;
import org.example.repository.BaiTap.MaxSalaryRepo;

import java.util.List;

public class MaxSalarySer {
    private final MaxSalaryRepo maxSalaryRepo;

    public MaxSalarySer() {
        maxSalaryRepo = new MaxSalaryRepo();
    }

    public void printHighestSalaryEmployees() {
        List<Account> accounts = maxSalaryRepo.accountMaxSalary();
        if (accounts == null || accounts.isEmpty()) {
            System.out.println("Không có nhân viên nào.");
            return;
        }
        System.out.println("Danh sách nhân viên lương cao nhất:");
        for (Account a : accounts) {
            // kiểm tra salary không null
            if (a.getSalary() != null && a.getSalary().getSalaryName() != null) {
                String fullName = a.getFirstName() + " " + a.getLastName();
                System.out.println(fullName + " - " + a.getSalary().getSalaryName());
            } else {
                System.out.println(a.getFirstName() + " " + a.getLastName() + " - Salary chưa gán");
            }
        }
    }
}
