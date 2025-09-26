package org.example.controller;

import org.example.service.BaiTap.SalaryDepartmentSer;

public class SalaryDepartment {
    public static void main(String[] args) {
        SalaryDepartmentSer departmentSer = new SalaryDepartmentSer();
        departmentSer.printSalaryByDepartment(1);
    }
}
