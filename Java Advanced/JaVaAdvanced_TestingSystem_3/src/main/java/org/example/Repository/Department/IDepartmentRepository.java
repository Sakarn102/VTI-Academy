package org.example.Repository.Department;

import org.example.entity.Department;

public interface IDepartmentRepository {
    Department create(Department department);
    Department findById(int id);
}
