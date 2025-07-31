package com.vti.entity.Exercise3;

public class Question4 {
    int[] departments = {1, 2, 3};

    public int[] getIndex() {
        try {
            for(int i = 0; i <= 3; i++) {
                System.out.println("Phan tu thu " + i + " la: " + departments[i]);
            }
        } catch (Exception e) {
            System.out.println("Cannot find department.");
        }
        return new int[0];
    }
}
