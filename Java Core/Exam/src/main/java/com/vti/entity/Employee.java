package com.vti.entity;

public class Employee extends User{
    private String proSkill;

    public Employee(int id, String fullName, String email, String passWord, int projectId, Role role, String proSkill) {
        super(id, fullName, email, passWord, projectId, role);
        this.proSkill = proSkill;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }
}
