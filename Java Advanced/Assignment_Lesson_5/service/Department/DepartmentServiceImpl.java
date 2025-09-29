package com.example.service.Department;

import com.example.dto.request.DepartmentDTORequest;
import com.example.dto.response.DepartmentDTOResponse;
import com.example.entity.Department;
import com.example.mapper.response.DepartmentMapperResponse;
import com.example.repository.IDepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DepartmentServiceImpl implements IDepartmentService {

    @Autowired
    private IDepartmentRepository departmentRepository;

    @Override
    public List<DepartmentDTOResponse> getDepartments() {
        return departmentRepository.findAll().stream().map(DepartmentMapperResponse::toDTO).collect(Collectors.toList());
    }

    @Override
    public DepartmentDTOResponse createDepartment(DepartmentDTORequest dtoRequest) {
        Department department = DepartmentMapperResponse.toEntity(dtoRequest);
        Department saved = departmentRepository.save(department);
        return DepartmentMapperResponse.toDTO(saved);
    }
}
