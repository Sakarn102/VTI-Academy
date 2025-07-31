package com.vti.backend;

import com.vti.entity.Exercise2.MyMath;
import com.vti.entity.Exercise2.SecondaryStudent;
import com.vti.entity.Exercise2.Student;

public class Exercise2 {
    public void Question1() {
        MyMath myMath = new MyMath();
        System.out.println("Sum: " + myMath.sum(5));
    }

    public void Question2() {
        Student student = new Student(1, "Nguyen tuan Anh");
        System.out.println(student.toString());
    }

    public void Question3() {
        Student s1 = new SecondaryStudent(2, "A");
        Student s2 = new SecondaryStudent(3, "B");
        s1.study();
        s2.study();
    }
}
