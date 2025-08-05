package com.vti.backend;

import com.vti.entity.Exercise2.Question1.Student;
import com.vti.entity.Exercise2.Question2.Person;
import com.vti.entity.Exercise2.Question3.*;
import com.vti.entity.Exercise2.Question5.DienThoaiCoDien;
import com.vti.entity.Exercise2.Question5.DienThoaiThongMinh;

import java.util.Scanner;

import static com.vti.entity.Exercise2.Question2.Person.demoPerson;
import static com.vti.entity.Exercise2.Question2.Student.demoStudent;
import static com.vti.entity.Exercise2.Question4.MyMath.sum;


public class Exercise2 {
    public void Question1(){
        Student student1 = new Student(1, "Nguyen Van A", 1);
        Student student2 = new Student(2, "Nguyen Van B", 2);
        Student student3 = new Student(3, "Nguyen Van C", 3);

        Student[] students = new Student[3];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        for (Student student : students) {
            student.callRoll();
        }
        for (Student student : students) {
            student.study();
        }
        for (Student student : students) {
            student.goClean();
        }
    }
    public void Question2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Select function");
        System.out.println("a. Demo Person");
        System.out.println("b. Demo Student");
        System.out.println("Enter funtion: ");
        String funString = sc.nextLine();
        switch (funString) {
            case "a":
                demoPerson();
                break;
            case "b":
                demoStudent();
                break;
            default:
                break;
        }
    }
    public void Question3(){
        HinhChuNhat hcn = new HinhChuNhat(4, 5);
        System.out.println("Chu vi hinh chu nhat: " + hcn.tinhChuVi());
        System.out.println("Dien tich hinh chu nhat: " + hcn.tinhDienTich());

        HinhVuong hv = new HinhVuong(4);
        System.out.println("Chu vi hình vuông: " + hv.tinhChuVi());
        System.out.println("Diện tích hình vuông: " + hv.tinhDienTich());
    }
    public void Question4(){
        System.out.println("Sum: " + sum(4, 6));
    }
    public void Question5(){
        System.out.println("============ Classic Phone ============ ");
        DienThoaiCoDien dtcd = new DienThoaiCoDien();
        dtcd.Nghe();
        dtcd.Goi();
        dtcd.GuiTinNhan();
        dtcd.NhanTinNhan();
        dtcd.ngheRadio();
        dtcd.tanCongKeXau();

        System.out.println("============ Smart Phone ============ ");
        DienThoaiThongMinh dttm = new DienThoaiThongMinh();
        dttm.Nghe();
        dttm.Goi();
        dttm.GuiTinNhan();
        dttm.NhanTinNhan();
        dttm.SuDung3G();
        dttm.ChupHinh();
        dttm.tanCongKeXau();
    }
}
