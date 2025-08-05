package Exercise_6;

import java.time.LocalDate;

import Testing_System.*;
import Testing_System.Position.PositionName;

public class Question_2 {
	public static void infAccount(Account[] accounts) {
		for (int i = 0; i < accounts.length; i++) {
	        System.out.println("===== Account thứ " + (i + 1) + " =====");
	        System.out.println("ID: " + accounts[i].id);
	        System.out.println("Email: " + accounts[i].email);
	        System.out.println("User Name: " + accounts[i].userName);
	        System.out.println("Full Name: " + accounts[i].fullName);
	        System.out.println("Department: " + accounts[i].department.id);
	        System.out.println("Position: " +accounts[i].position.id);
	        System.out.println();
	    }
		
	}
	
	public static void main(String[] args) {
		Department dep1 = new Department();
        dep1.id = 1;
        dep1.name = "Marketing";
        
        Department dep2 = new Department();
        dep2.id = 2;
        dep2.name = "Sale";
        
        Department dep3 = new Department();
        dep3.id = 3;
        dep3.name = "BOD";
        
        Position pos1 = new Position();
        pos1.id = 1;
        pos1.name = PositionName.Dev;
        
        Position pos2 = new Position();
        pos2.id = 2;
        pos2.name = PositionName.PM;
        
        Position pos3 = new Position();
        pos3.id = 3;
        pos3.name = PositionName.Scrum_Master;
        
		Account acc1 = new Account();
        acc1.id = 1;
        acc1.email = "anhnt1@gmail.com";
        acc1.userName = "anhnt1";
        acc1.fullName = "Anh Nguyen 1";
        acc1.department = dep1;
        acc1.position = pos1;
        acc1.createDate = LocalDate.now();
        
        Account acc2 = new Account();
        acc2.id = 2;
        acc2.email = "anhnt2@gmail.com";
        acc2.userName = "anhnt2";
        acc2.fullName = "Anh Nguyen 2";
        acc2.department = dep2;
        acc2.position = pos2;
        acc2.createDate = LocalDate.of(2021, 3, 17);
        
        Account acc3 = new Account();
        acc3.id = 3;
        acc3.email = "anhnt3@gmail.com";
        acc3.userName = "anhnt3";
        acc3.fullName = "Anh Nguyen 3";
        acc3.department = dep3;
        acc3.position = pos3;
        acc3.createDate = LocalDate.now();
        
        Account[] accounts = {acc1, acc2, acc3};
        infAccount(accounts);
	}
	
	
}
