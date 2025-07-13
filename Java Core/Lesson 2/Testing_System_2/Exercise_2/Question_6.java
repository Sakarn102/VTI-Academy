package Exercise_2;

import java.time.LocalDate;

import Testing_System.*;
import Testing_System.Position.PositionName;

public class Question_6 {
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
        
        //Add Group Account
        group1.accounts = new Account[] {acc1};
        group2.accounts = new Account[] {acc1, acc2};
        group3.accounts = new Account[] {acc2};
        
		Account[] accounts = { acc1, acc2, acc3 };
		System.out.printf("+----+----------------------+----------------------+----------------------+\n");
		System.out.printf("| %-2s | %-20s | %-20s | %-20s |\n", "ID", "Email", "Full Name", "Department");
		System.out.printf("+----+----------------------+----------------------+----------------------+\n");

		// In dữ liệu từng account
		for (Account acc : accounts) {
		    System.out.printf("| %-2d | %-20s | %-20s | %-20s |\n",
		            acc.id,
		            acc.email,
		            acc.fullName,
		            acc.department.name);
		}

		// In footer bảng
		System.out.printf("+----+----------------------+----------------------+----------------------+\n");
	}
	
	
}
