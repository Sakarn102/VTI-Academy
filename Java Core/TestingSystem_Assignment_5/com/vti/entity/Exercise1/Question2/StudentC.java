package com.vti.entity.Exercise1.Question2;

public class StudentC extends Student{
    private String subjects = "Literature, History, Geography";

    public StudentC(String candidateId, String fullName, String address, int priortyLevel) {
        super(candidateId, fullName, address, priortyLevel);
    }

    @Override
    public void showInfo() {
        System.out.println("Block C: " + subjects);
        System.out.println(
                "ID: " + getCandidateId() + "\n" +
                        "Full Name: " + getFullName() + "\n" +
                        "Address: " + getAddress() + "\n" +
                        "Priorty Level: " + getPriortyLevel()
        );

    }
}
