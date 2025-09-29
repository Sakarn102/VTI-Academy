package com.example.dto.response;

public class DepartmentDTOResponse {
    private int departmentId;
    private String departmentName;

    public int getDepartmentId() {
        return departmentId;
    }

    public DepartmentDTOResponse() {}

    public DepartmentDTOResponse(int departmentId, String departmentName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
