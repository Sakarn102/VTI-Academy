package com.vti.entity.Exercise2;

import java.time.LocalDate;
import java.util.Scanner;

public class Voucher extends Benefit{
    protected String displayFormat;
    protected String code;


    public String getCode() {
        return code;
    }

    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter display format: ");
            displayFormat = scanner.nextLine();
        } while (!displayFormat.matches("QRCODE|BARCODE|ORIGINAL"));

        do {
            System.out.println("Enter 6-chacracter code: ");
            code = scanner.nextLine().trim();
        }while (!code.matches("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{6}$"));
    }

    @Override
    public String toString() {
        return super.toString() +
                "Voucher{" +
                "displayFormat='" + displayFormat + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
