package com.vti.entity.Exercise2.Question2;

import java.util.Scanner;
import com.vti.entity.Exercise2.Question2.*;

public class Student extends Person{
    private String studentId;
    private float averageScore;
    private String email;

    public Student() {

    }
    public Student(String studentId, float averageScore, String email) {
        this.studentId = studentId;
        this.averageScore = averageScore;
        this.email = email;
    }


    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public float getAverageScore() {
        return averageScore;
    }
    public void setAverageScore(float averageScore) {
        this.averageScore = averageScore;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        super.inputInfo();

        System.out.println("Student ID: ");
        this.studentId = sc.nextLine();

        System.out.println("Avarage Score: ");
        this.averageScore = sc.nextFloat();

        sc.nextLine();

        System.out.println("Email: ");
        this.email = sc.nextLine();

    }
    @Override
    public String showInfo() {
        return
                super.showInfo() + "\n" +
                        "Student ID: " + this.studentId + "\n" +
                        "Average Score: " + this.averageScore + "\n" +
                        "Email: " + this.email;

    }
    public boolean scholarShip() {
        return averageScore > 8.0 ? true : false;
    }
    public static void demoStudent() {
        Student student = new Student();
        student.inputInfo();
        System.out.println("============ Information Student ============");
        System.out.println(student.showInfo());
        if(student.scholarShip() == true) {
            System.out.println("This student won a scholarship. ");
        } else {
            System.out.println("This student did not get the scholarship.");
        }
    }
}
