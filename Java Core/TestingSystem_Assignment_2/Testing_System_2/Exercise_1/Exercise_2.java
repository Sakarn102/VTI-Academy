package Exercise_1;

import java.time.LocalDate;

import Testing_System.*;
import Testing_System.Position.PositionName;

public class Exercise_2 {
	public static void main(String[] args) {
		// Create Departments
        Department dep1 = new Department();
        dep1.id = 1;
        dep1.name = "Marketing";
        
        Department dep2 = new Department();
        dep2.id = 2;
        dep2.name = "Sale";
        
        Department dep3 = new Department();
        dep3.id = 3;
        dep3.name = "BOD";
        
        // Create Positions
        Position pos1 = new Position();
        pos1.id = 1;
        pos1.name = PositionName.Dev;
        
        Position pos2 = new Position();
        pos2.id = 2;
        pos2.name = PositionName.PM;
        
        Position pos3 = new Position();
        pos3.id = 3;
        pos3.name = PositionName.Scrum_Master;
        
        // Create Groups
        Group group1 = new Group();
        group1.id = 1;
        group1.name = "Testing System";
        group1.createDate = LocalDate.now();
        
        Group group2 = new Group();
        group2.id = 2;
        group2.name = "Development";
        group2.createDate = LocalDate.of(2021, 3, 15);
        
        Group group3 = new Group();
        group3.id = 3;
        group3.name = "Sale";
        group3.createDate = LocalDate.of(2021, 3, 10);
        
        // Create Accounts
        Account acc1 = new Account();
        acc1.id = 1;
        acc1.email = "anhnt1@gmail.com";
        acc1.userName = "anhnt1";
        acc1.fullName = "Anh Nguyen 1";
        acc1.department = dep1;
        acc1.position = pos1;
        acc1.createDate = LocalDate.now();
        acc1.groups = new Group[]{group1, group2};
        
        Account acc2 = new Account();
        acc2.id = 2;
        acc2.email = "anhnt2@gmail.com";
        acc2.userName = "anhnt2";
        acc2.fullName = "Anh Nguyen 2";
        acc2.department = dep2;
        acc2.position = pos2;
        acc2.createDate = LocalDate.of(2021, 3, 17);
        acc2.groups = new Group[]{group3, group2};
        
        Account acc3 = new Account();
        acc3.id = 3;
        acc3.email = "anhnt3@gmail.com";
        acc3.userName = "anhnt3";
        acc3.fullName = "Anh Nguyen 3";
        acc3.department = dep3;
        acc3.position = pos3;
        acc3.createDate = LocalDate.now();
        acc3.groups = new Group[]{group1};
        
		System.out.println("\n");
        System.out.println("============Question 16_14============");
        Account[] arrAccount_16_14 = {acc1, acc2, acc3};
        int count_16_14 = 0;
        while(count_16_14 < arrAccount_16_14.length) {
        	if (count_16_14 < 4) {
        		System.out.println("Thông tin account thứ " + ((count_16_14) + 1));
                System.out.println("Email: " + arrAccount_16_14[count_16_14].email);
                System.out.println("Full name: " + arrAccount_16_14[count_16_14].fullName);
                System.out.println("Phòng ban: " + arrAccount_16_14[count_16_14].department.name);
                System.out.println();
        	}
                count_16_14++;
        }
        
        System.out.println("\n");
        System.out.println("============Question 16_15============");
        int count_16_15 = 0;
        while(count_16_15 <= 20) {
        	if(count_16_15%2==0) {
        		System.out.println(count_16_15);
        	}
        	count_16_15++;
        }
        
        System.out.println("\n");
        System.out.println("============Question 17_10============");
        Account[] arrAccount_17_10 = {acc1, acc2, acc3};
        int count_17_10 = 0;
        do {
        	System.out.println("Thông tin account thứ " + ((count_17_10)+1) + " là:");
        	System.out.println("Email: " + arrAccount_17_10[count_17_10].email);
        	System.out.println("Full name: " + arrAccount_17_10[count_17_10].fullName);
        	System.out.println("Phòng ban: " + arrAccount_17_10[count_17_10].department.name);
        	count_17_10++;
        	System.out.println();
        } while (count_17_10 < (arrAccount_17_10.length)-1);
        
        System.out.println("\n");
        System.out.println("============Question 17_11============");
        Department[] arrDepartment_17_11 = {dep1, dep2, dep3};
        int count_17_11 = 0;
        do {
        	System.out.println("Thông tin department thứ: "+((count_17_11)+1)+" là: ");
        	System.out.println("Id: "+ arrDepartment_17_11[count_17_11].id);
        	System.out.println("Name: " + arrDepartment_17_11[count_17_11].name);
        	count_17_11++;
        	System.out.println();
        } while (count_17_11 < 2);
        
        System.out.println("\n");
        System.out.println("============Question 17_13============");
        Account[] arrAccount_17_13 = {acc1, acc2, acc3};
        int count_17_13 = 0;
        do {
        	if(count_17_13 == 1) {
        		count_17_13++;
        		continue;
        	}
        	else {
        		System.out.println("Thông tin account thứ " + ((count_17_13)+1) + " là:");
            	System.out.println("Email: " + arrAccount_17_13[count_17_13].email);
            	System.out.println("Full name: " + arrAccount_17_13[count_17_13].fullName);
            	System.out.println("Phòng ban: " + arrAccount_17_13[count_17_13].department.name);
            	System.out.println();
            	count_17_13++;
        	}
        } while(count_17_13 < arrAccount_17_13.length);
        
        System.out.println("\n");
        System.out.println("============Question 17_14============");
        Account[] arrAccount_17_14 = {acc1, acc2, acc3};
        int count_17_14 = 0;
        do {
        	if(arrAccount_17_14[count_17_14].id > 4) {
        		break;                           
        	} else {
        		System.out.println("Thông tin account thứ " + ((count_17_14)+1) + " là:");
            	System.out.println("Email: " + arrAccount_17_14[count_17_14].email);
            	System.out.println("Full name: " + arrAccount_17_14[count_17_14].fullName);
            	System.out.println("Phòng ban: " + arrAccount_17_14[count_17_14].department.name);
            	System.out.println();
            	count_17_14++;
        	}
        } while(count_17_14 < arrAccount_17_14.length);
        
        System.out.println("\n");
        System.out.println("============Question 17_15============");
        int count_17_15 = 0;
        do {
        	if(count_17_15 % 2 == 0) {
        		System.out.println(count_17_15);
        	}count_17_15++;
        } while (count_17_15 <= 20);
	}
}
