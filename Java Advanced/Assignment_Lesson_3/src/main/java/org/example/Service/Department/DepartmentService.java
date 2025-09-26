package org.example.Service.Department;

import org.example.Repository.Department.DepartmentRepository;
import org.example.Repository.Department.IDepartmentRepository;
import org.example.entity.Department;
import org.example.mapper.DepaertmentMapper.DepartmentMapper;

public class DepartmentService implements IDepartmentService {
    private final IDepartmentRepository departmentRepository;
    public DepartmentService() {
        departmentRepository = new DepartmentRepository();
    }
    @Override
    public Department createDepartment(String departmentName) {
        Department department = DepartmentMapper.create(departmentName);
        return departmentRepository.create(department);
    }

    @Override
    public Department getDepartmentById(int id) {
        return departmentRepository.findById(id);
    }
}
