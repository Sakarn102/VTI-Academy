package com.vti.entity.Exercise6.Question3;

import com.vti.entity.Exercise6.Question2.User;

public class Employee extends User {
    public Employee(String name, double salaryRatio) {
        super(name, salaryRatio);
    }

    @Override
    public double caculatePay() {
        return getSalaryRatio() * 420;
    }
}
