package com.vti.entity.Exercise2;

import java.time.LocalDate;
import java.util.Scanner;

public class TelephoneConsultant extends Benefit{
    protected int duration;

    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter duration: ");
        duration = scanner.nextInt();
    }

    @Override
    public String toString() {
        return super.toString() +
                "TelephoneConsultant{" +
                "duration=" + duration +
                '}';
    }
}
