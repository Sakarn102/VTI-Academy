package org.example.mapper.DepaertmentMapper;

import org.example.entity.Department;

public class DepartmentMapper {
    public static Department create(String name) {
        Department department = new Department();
        department.setName(name);
        return department;
    }
}
