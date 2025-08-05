package com.vti.entity.Exercise5.Question1;

public class Staff extends Officer{
    private String work;

    public Staff(String fullName, int age, Gender gender, String address, String work) {
        super(fullName, age, gender, address);
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return "Staff [work=" + work + "]";
    }
}
