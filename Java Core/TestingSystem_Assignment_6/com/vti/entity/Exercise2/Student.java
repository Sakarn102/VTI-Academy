package com.vti.entity.Exercise2;

public class Student {
    private int id;
    private String name;

    public Student(final int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static final void study() {
        System.out.println("Dang hoc bai...");
    }

    @Override
    public String toString() {
        return "ID: " + this.id + "\n" +
                "Name: " + this.name + "\n";
    }
}
