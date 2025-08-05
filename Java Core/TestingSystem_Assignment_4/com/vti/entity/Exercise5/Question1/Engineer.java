package com.vti.entity.Exercise5.Question1;

public class Engineer extends Officer{
    private String majorTraining;

    public Engineer(String fullName, int age, Gender gender, String address, String majorTraining) {
        super(fullName, age, gender, address);
        this.majorTraining = majorTraining;
    }

    public String getMajorTraining() {
        return majorTraining;
    }

    public void setMajorTraining(String majorTraining) {
        this.majorTraining = majorTraining;
    }

    @Override
    public String toString() {
        return "Engineer [majorTraining=" + majorTraining + "]";
    }
}
