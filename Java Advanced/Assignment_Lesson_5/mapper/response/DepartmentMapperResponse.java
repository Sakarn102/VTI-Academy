package com.example.mapper.response;

import com.example.dto.request.DepartmentDTORequest;
import com.example.dto.response.DepartmentDTOResponse;
import com.example.entity.Department;

public class DepartmentMapperResponse {

    // DTO --> Entity
    public static Department toEntity(DepartmentDTORequest dto) {
        Department department = new Department();
        department.setDepartmentName(dto.getDepartmentName());
        return department;
    }


    // Mapping Entity Department trong Database --> Object
    public static DepartmentDTOResponse toDTO(Department department) {
        return new DepartmentDTOResponse(department.getDepartmentId(), department.getDepartmentName());
    }
}
