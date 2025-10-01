package com.example.Assignment6.service;

import com.example.Assignment6.dto.DepartmentReponse;
import com.example.Assignment6.entity.Department;
import org.springframework.data.domain.Page;

public interface IDepartmentService {
    /**
     * Lấy danh sách Department có hỗ trợ filter, paging, sort
     *
     # @param nameFilter     lọc theo tên (có thể null)
     # @param minMember      lọc theo min member (có thể null)
     # @param maxMember      lọc theo max member
     # @param page           số trang (bắt đầu từ 0)
     # @param size           số bản ghi mỗi trang
     # @param sortBy         cột để sắp xếp
     # @param sortDir        hướng sắp xếp ("asc" hoặc "desc")
     # @return Page<Department> chứa danh sách Department và thông tin phân trang*/
    Page<DepartmentReponse> getAllDepartments(String nameFilter,
                                              Integer minMember,
                                              Integer maxMember,
                                              int page,
                                              int size,
                                              String sortBy,
                                              String sortDir);
}
