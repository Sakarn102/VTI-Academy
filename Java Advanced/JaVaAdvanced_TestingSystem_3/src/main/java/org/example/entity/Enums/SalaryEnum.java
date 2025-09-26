package org.example.entity.Enums;

public enum SalaryEnum {
    Dev(600), Test(700), ScrumMaster(1500), PM(2000);

    private final int value;
    SalaryEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static SalaryEnum fromValue(int value) {
        for (SalaryEnum s : values()) {
            if (s.value == value) return s;
        }
        throw new IllegalArgumentException("Invalid salary value: " + value);
    }
}
