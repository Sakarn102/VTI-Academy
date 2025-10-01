package com.example.Assignment6.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class DepartmentReponse {
    private int departmentId;
    private int totalMember;
    private String departmentName;

    public DepartmentReponse() {}

    public DepartmentReponse(int departmentId, int totalMember, String departmentName) {
        this.departmentId = departmentId;
        this.totalMember = totalMember;
        this.departmentName = departmentName;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public int getTotalMember() {
        return totalMember;
    }

    public String getDepartmentName() {
        return departmentName;
    }

}
