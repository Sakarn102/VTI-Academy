package org.example.Service.Department;

import org.example.entity.Department;

public interface IDepartmentService {
    Department createDepartment(String departmentName);
    Department getDepartmentById(int id);
}
