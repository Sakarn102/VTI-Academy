package com.vti.backend;

import com.vti.entity.Exercise1.Account;
import com.vti.entity.Exercise4.Circle;
import com.vti.entity.Exercise4.Student;

import java.util.Date;

public class Exercise4 {
    public void Question1(){
        Student student = new Student();
        student.print();
    }
    public void Question2(){
        Circle circle = new Circle();
        circle.toString();

        Account account = new Account();
        account.toString();

        Date date = new Date();
        date.toString();
    }
}
