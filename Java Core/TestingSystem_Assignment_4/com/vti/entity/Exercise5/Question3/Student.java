package com.vti.entity.Exercise5.Question3;

public abstract class Student extends Person{
    protected static int id;
    public Student(String name, int id) {
        super(name);
        this.id = id;
    }
}
