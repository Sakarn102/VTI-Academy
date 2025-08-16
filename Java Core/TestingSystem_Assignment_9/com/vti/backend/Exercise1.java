package com.vti.backend;

import com.vti.entity.Exercise1.Student;

import java.util.Date;

public class Exercise1 {
    @SuppressWarnings("deprecation")
    public void Question1() {
        Date date = new Date(2020,4,18);
        System.out.println("Date is: " + date);
    }
    public void Question2() {
        Student student = new Student(1, "Nguyễn Văn A");
        System.out.println("Name student is: " + student.getName());
        System.out.println("Student id: " + student.getStudentId());
    }
}
