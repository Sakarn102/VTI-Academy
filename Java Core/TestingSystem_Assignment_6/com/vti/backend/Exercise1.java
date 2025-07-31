package com.vti.backend;

import com.vti.entity.Exercise1.*;

import java.math.BigDecimal;


public class Exercise1 {
    private Student[] students;
    public void Question1() {
        Student student1 = new Student(1, "Nguyen Van A");
        Student student2 = new Student(2, "Nguyen Van B");
        Student student3 = new Student(3, "Nguyen Van C");
        students = new Student[]{student1, student2, student3};

        Student.COLLEGE = "Dai hoc Bach Khoa";
        for (Student student : students) {
            System.out.println(student.toString());
        }

        Student.COLLEGE = "Dai hoc Cong Nghe";
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }

        public void Question2 () {
            System.out.println("Money: " + Student.MONEY_GROUP);

            students[0].spendFund(new BigDecimal(50));
            students[1].spendFund(new BigDecimal(20));
            students[2].spendFund(new BigDecimal(150));
            System.out.println("Money balance: " + Student.MONEY_GROUP);

            students[0].closeFund(new BigDecimal(50));
            students[1].closeFund(new BigDecimal(50));
            students[2].closeFund(new BigDecimal(50));
            System.out.println("New money: " + Student.MONEY_GROUP);
        }

        public void Question3() {
            MyMath myMath = new MyMath();
            System.out.println("Sum: " + myMath.sum(4,5));
            System.out.println("Min: " + myMath.min(4,5));
        }

        public void Question4() {
            Student.setCOLLEGE("UNETI");
            Student.getCOLLEGE();
            for (Student student : students) {
                System.out.println(student.toString());
            }
        }
        public void Question5() {
            int count = 0;
            for (Student student : students) {
                System.out.println(student.toString());
                count++;
            }
            if (Student.countStudent > 0) {
                System.out.println("Count studentds: " + count);
            } else {
                System.out.println("List students empty ");
            }
            System.out.println();
        }

    public void Question6() {
        int count = 0;
        PrimaryStudent primaryStudent1 = new PrimaryStudent(1, "Primary Student A");
        PrimaryStudent primaryStudent2 = new PrimaryStudent(2, "Primary Student B");

        SecondaryStudent secondaryStudent1 = new SecondaryStudent(1, "Secondary Student A");
        SecondaryStudent secondaryStudent2 = new SecondaryStudent(2, "Secondary Student B");
        SecondaryStudent secondaryStudent3 = new SecondaryStudent(3, "Secondary Student C");
        SecondaryStudent secondaryStudent4 = new SecondaryStudent(4, "Secondary Student D");

        System.out.println("Total students: " + Student.countStudent);
        System.out.println("Primary students: " + PrimaryStudent.countPrimaryStudent);
        System.out.println("Secondary students: " + SecondaryStudent.countSecondaryStudent);
    }

    public void Question7() {
        Student[] students = new Student[Student.MAX_STUDENT];
        while (Student.countStudent >= Student.MAX_STUDENT) {
            throw new RuntimeException("Không thể tạo thêm học sinh! Đã đủ " + Student.MAX_STUDENT  + " học sinh.");
        }
    }

    public void Question8() {
        try {
            HinhHoc h1 = new HinhChuNhat(4,5);
            HinhHoc h2 = new HinhChuNhat(4,5);
            HinhHoc h3 = new HinhChuNhat(4,5);
            HinhHoc h4 = new HinhTron(5);
            HinhHoc h5 = new HinhTron(2);


            HinhHoc h6 = new HinhTron(4);  // Sẽ gây Exception

        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}
