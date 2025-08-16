package com.vti.entity.Exercise1;

public class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     *
     * @deprecated Hãy sử dụng getStudentId() thay vì getId
     */
    @Deprecated
    public int getId() {
        return id;
    }

    public String getStudentId() {
        return "MSV: " + id;
    }

    public String getName() {
        return name;
    }
}
