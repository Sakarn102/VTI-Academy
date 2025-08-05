package com.vti.entity.Exercise6.Question3;

import com.vti.entity.Exercise6.Question2.User;

public class Manager extends User {
    public Manager(String name, double salaryRatio) {
        super(name, salaryRatio);
    }

    @Override
    public double caculatePay() {
        return getSalaryRatio() * 520;
    }
}
