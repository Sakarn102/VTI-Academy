package com.vti.entity.Exercise2;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public abstract class Benefit {
    protected String name;
    protected String thumbnailUrl;
    protected LocalDate startDate;
    protected LocalDate endDate;

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = scanner.nextLine();
        System.out.println("Enter thumbnail url: ");
        thumbnailUrl = scanner.nextLine();
        System.out.println("Enter start date (dd/MM/yyyy): ");
        startDate = LocalDate.parse(scanner.nextLine(), FORMATTER);

        System.out.println("Enter end date (dd/MM/yyyy, để trống nếu chưa có)");
        scanner.nextLine();
        if (endDate != null) {
            endDate = LocalDate.parse(scanner.nextLine(), FORMATTER);
        } else {
            endDate = null;
        }
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    @Override
    public String toString() {
        return "Benefit{" +
                "name='" + name + '\'' +
                ", thumbnailUrl='" + thumbnailUrl + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
