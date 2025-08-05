package com.vti.entity.Exercise1.Question2;

public class StudentB extends Student{
    private String subjects = "Math, Chemistry, Biology";

    public StudentB(String candidateId, String fullName, String address, int priortyLevel) {
        super(candidateId, fullName, address, priortyLevel);
    }

    @Override
    public void showInfo() {
        System.out.println("Block B: " + subjects);
        System.out.println(
                "ID: " + getCandidateId() + "\n" +
                        "Full Name: " + getFullName() + "\n" +
                        "Address: " + getAddress() + "\n" +
                        "Priorty Level: " + getPriortyLevel()
        );
    }
}
