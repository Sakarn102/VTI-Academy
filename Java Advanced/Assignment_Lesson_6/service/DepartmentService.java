package com.example.Assignment6.service;

import com.example.Assignment6.dto.DepartmentReponse;
import com.example.Assignment6.entity.Department;
import com.example.Assignment6.repository.DepartmentRepository;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService implements IDepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Page<DepartmentReponse> getAllDepartments(String nameFilter,
                                                     Integer minMember,
                                                     Integer maxMember,
                                                     int page,
                                                     int size,
                                                     String sortBy,
                                                     String sortDir) {

        Sort sort = sortDir.equalsIgnoreCase("desc") ? Sort.by(sortBy).descending() : Sort.by(sortBy).ascending();
        Pageable pageable = PageRequest.of(page,size, sort);
        Specification<Department> specification = ((root, query, criteriaBuilder) -> null);

        if (nameFilter!= null && nameFilter.isEmpty()) {
            specification = specification.and((root, query, criteriaBuilder) -> criteriaBuilder.like(root.get("departmentName"), "%" + nameFilter.toLowerCase() + "%"));
        }

        if (minMember!= null) {
            specification = specification.and((root, query, criteriaBuilder) -> criteriaBuilder.greaterThanOrEqualTo(root.get("totalMember"), minMember));
        }

        if (maxMember!= null) {
            specification = specification.and((root, query, criteriaBuilder) -> criteriaBuilder.greaterThanOrEqualTo(root.get("totalMember"), maxMember));
        }

        Page<Department> departments = departmentRepository.findAll(specification, pageable);
        return departments.map(department -> new DepartmentReponse(department.getDepartmentId(), department.getTotalMember(), department.getDepartmentName()));
    }
}
