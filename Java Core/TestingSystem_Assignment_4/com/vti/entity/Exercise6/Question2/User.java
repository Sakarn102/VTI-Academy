package com.vti.entity.Exercise6.Question2;

public abstract class User {
    protected String name;
    protected double salaryRatio;

    public User(String name, double salaryRatio) {
        super();
        this.name = name;
        this.salaryRatio = salaryRatio;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalaryRatio() {
        return salaryRatio;
    }
    public void setSalaryRatio(double salaryRatio) {
        this.salaryRatio = salaryRatio;
    }

    public abstract double caculatePay();

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary Ratio: " + salaryRatio);
        System.out.println("Total Salary: " + caculatePay());
    }
}
