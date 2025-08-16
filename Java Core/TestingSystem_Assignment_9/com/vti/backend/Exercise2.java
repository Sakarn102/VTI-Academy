package com.vti.backend;

import com.vti.entity.Exercise2.Benefit;
import com.vti.entity.Exercise2.BenefitManage;

import java.util.Scanner;

import static com.vti.entity.Exercise2.BenefitManage.*;

public class Exercise2 {
    public void Question1() {
        BenefitManage benefit = new BenefitManage();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("===== Benefit management: =====");
            System.out.println("1. Add Benefit");
            System.out.println("2. Update voucher by code");
            System.out.println("3. Remove expired Benefit");
            System.out.println("4. Telephone Consultant Reporrt");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addBenefit();
                    break;
                case 2:
                    updateVoucher();
                    break;
                case 3:
                    removeExpiredBenefit();
                    break;
                case 4:
                    telephoneConsultantReport();
                    break;
                case 5:
                    exit();
                    break;
                default:
                    System.out.println("Choice don't invalid!");
                    break;
            }
        }

    }
}
