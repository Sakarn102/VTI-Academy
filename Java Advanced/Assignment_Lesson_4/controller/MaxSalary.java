package org.example.controller;

import org.example.service.BaiTap.MaxSalarySer;

public class MaxSalary {
    public static void main(String[] args) {
        MaxSalarySer maxSalarySer = new MaxSalarySer();
        maxSalarySer.printHighestSalaryEmployees();
    }
}
