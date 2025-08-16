package com.vti.entity.Exercise2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BenefitManage {
    static List<Benefit> benefits = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void addBenefit() {
        Benefit benefit = null;
        int type;
        do {
            System.out.println("===== Add Benefit =====");
            System.out.println("1. Add voucher");
            System.out.println("2. Add telephone Consultant");
            System.out.println("Enter your tyme (1 or 2): ");
            type = Integer.parseInt(scanner.nextLine());
        } while (type != 1 && type != 2);
        switch (type) {
            case 1:
                benefit = new Voucher();
                break;
            case 2:
                benefit = new TelephoneConsultant();
                break;
            default:
                System.out.println("Invalid coice!");
                break;
        }
        if (benefit != null) {
            benefit.input();
            benefits.add(benefit);
            System.out.println("Add succesfulle benefit!");
        }
    }

    public static void updateVoucher() {
        System.out.println("===== Update Voucher =====");
        System.out.println("Enter code voucher: ");
        String codeFoune = scanner.nextLine();
        for (Benefit b : benefits) {
            if (b instanceof Voucher) {
                Voucher voucher = (Voucher) b;
                if (voucher.getCode().equals(codeFoune)) {
                    System.out.println("Enter voucher: ");
                    voucher.input();
                    System.out.println("Update succesfully information voucher!");
                    return;
                }
            }
        }
        System.out.println("Don't find code voucher!...");
    }
    public static void removeExpiredBenefit() {
        LocalDate date = LocalDate.now();
        benefits.removeIf(b -> b.getEndDate() != null && !b.getEndDate().isAfter(LocalDate.now()));
        System.out.println("Remove succesfully!");
    }
    public static void telephoneConsultantReport() {
        LocalDate localDate = LocalDate.now();
        System.out.println("===== List Telephone Consultant Report =====");
        for (Benefit b : benefits) {
            if (b instanceof TelephoneConsultant tc) {
            boolean available = (tc.getEndDate() == null || tc.getEndDate().isAfter(LocalDate.now()));
            if (tc.duration > 10 && available) {
                System.out.println(tc);
            }
            }
        }
    }
    public static void exit() {
        System.out.println("Exit program!");
        System.exit(0);
        System.out.println("Exit Succesfully!");
    }
}


