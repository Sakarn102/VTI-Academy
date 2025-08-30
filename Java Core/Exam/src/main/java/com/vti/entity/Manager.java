package com.vti.entity;

public class Manager extends User{
    private int expInYear;
    public Manager() {

    }

    public Manager(int id, String fullName, String email, String passWord, int projectId, Role role, int expInYear) {
        super(id, fullName, email, passWord, projectId, role);
        this.expInYear = expInYear;
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

}
