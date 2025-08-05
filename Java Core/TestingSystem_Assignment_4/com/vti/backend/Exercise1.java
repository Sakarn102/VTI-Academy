package com.vti.backend;

import com.vti.entity.Exercise1.Account;
import com.vti.entity.Exercise1.Department;
import com.vti.entity.Exercise1.Group;

public class Exercise1 {
    public void Question1(){
        //
        Department dep1 = new Department();
        System.out.println("Department 1: ");
        System.out.println("ID: " + dep1.id);
        System.out.println("Department Name: " + dep1.name);

        //
        Department dep2 = new Department("Sale");
        System.out.println("Department 2: ");
        System.out.println("ID: " + dep2.id);
        System.out.println("Department Name: " + dep2.name);
    }
    public void Question2(){
        Account account = new Account();
        account.printA();
        System.out.println();
        account.printB();
        System.out.println();
        account.printC();
        System.out.println();
        account.printD();
    }

    public void Question3() {
        Group group = new Group();
        group.printA();
        group.printB();
        group.printB();
    }
}
