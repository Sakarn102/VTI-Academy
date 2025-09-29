package com.example.service.Department;

import com.example.dto.request.DepartmentDTORequest;
import com.example.dto.response.DepartmentDTOResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IDepartmentService {
    List<DepartmentDTOResponse> getDepartments();
    DepartmentDTOResponse createDepartment(DepartmentDTORequest dtoRequest);
}
