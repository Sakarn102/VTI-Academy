package org.example.controller;

import org.example.Service.Department.DepartmentService;
import org.example.Service.Department.IDepartmentService;
import org.example.entity.Department;

public class DepartmentController {
    public static void main(String[] args) {
        IDepartmentService departmentService = new DepartmentService();
//        departmentService.createDepartment("Manchester City");
        Department dep = departmentService.getDepartmentById(1);
        if (dep != null) {
            System.out.println("ID: " + dep.getId() + " - " + "Name: " + dep.getName());
        } else {
            System.out.println("Cannot find department!");
        }
    }
}
