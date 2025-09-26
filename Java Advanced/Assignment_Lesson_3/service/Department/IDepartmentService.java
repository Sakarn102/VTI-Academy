package org.example.service.Department;

import org.example.entity.Department;

public interface IDepartmentService {
    Department createDepartment(String departmentName);
    Department getDepartmentById(int id);
}
