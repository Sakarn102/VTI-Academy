package com.example.Assignment6.controller;

import com.example.Assignment6.dto.DepartmentReponse;
import com.example.Assignment6.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @GetMapping
    public Page<DepartmentReponse> getAllDepartments(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) Integer minMember,
            @RequestParam(required = false) Integer maxMember,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "departmentId") String sortBy,
            @RequestParam(defaultValue = "asc") String sortDir
    ) {
        return departmentService.getAllDepartments(name, minMember, maxMember, page, size, sortBy, sortDir);
    }
}
