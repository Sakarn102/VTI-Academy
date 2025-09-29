package com.example.controller;

import com.example.dto.request.DepartmentDTORequest;
import com.example.dto.response.DepartmentDTOResponse;
import com.example.entity.Department;
import com.example.service.Department.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/departments")
public class DepartmentController {

    @Autowired
    private IDepartmentService departmentService;

    @GetMapping
    public List<DepartmentDTOResponse> getDepartments() {
        return departmentService.getDepartments();
    }

    @PostMapping("/simple")
    public DepartmentDTOResponse createDepartmentSimple(@RequestParam String name) {
        DepartmentDTORequest dtoRequest = new DepartmentDTORequest();
        dtoRequest.setDepartmentName(name);
        return departmentService.createDepartment(dtoRequest);
    }
}
