package com.vti.entity.Exercise3;

public class Question3 {
    static int[] numbers = {1, 2, 3};
    public static void print() {
        try {
            System.out.println(numbers[10]); // gây lỗi
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Đã xảy ra lỗi: " + e);
        }
    }
}
