package com.vti.entity.Exercise1;

import java.math.BigDecimal;

public class Student {
    private int id;
    private String name;
    public static String COLLEGE;
    public static BigDecimal MONEY_GROUP = BigDecimal.ZERO;
    public static int countStudent;
    public static final int MAX_STUDENT = 7;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        Student.MONEY_GROUP = Student.MONEY_GROUP.add(new BigDecimal(100));
        countStudent++;
    }

    @Override
    public String toString() {
        return "ID: " + this.id + "\n" +
                "Name: " + this.name + "\n" +
                "College: " + Student.COLLEGE + "\n";

    }

    public void spendFund(BigDecimal value) {
        Student.MONEY_GROUP = Student.MONEY_GROUP.subtract(value);
    }

    public void closeFund(BigDecimal value) {
        Student.MONEY_GROUP = Student.MONEY_GROUP.add(new BigDecimal(50));
    }

    public static String getCOLLEGE() {
        return COLLEGE;
    }

    public static void setCOLLEGE(String COLLEGE) {
        Student.COLLEGE = COLLEGE;
    }
}
