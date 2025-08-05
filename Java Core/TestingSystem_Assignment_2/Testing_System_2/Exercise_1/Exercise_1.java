package Exercise_1;


import java.time.LocalDate;

import Testing_System.*;
import Testing_System.Position.PositionName;

public class Exercise_1 {
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
        
        //Question 1: Question 1: Kiểm tra account thứ 2
        System.out.println("============Question 1============");
        if (acc2.department == null) {
        	System.out.println("Nhân viên này chưa có phòng ban");
        } else {
        	System.out.println("Phòng ban của nhân viên này là: " + acc2.department.name);
        }
        
        //Question 2: Kiểm tra account thứ 2
        System.out.println("\n");
        System.out.println("============Question 2============");
        int countGroup = acc2.groups.length;
        if (acc2.groups == null) {
        	System.out.println("Nhân viên này chưa có group");
        } else if (countGroup == 1 || countGroup == 2) {
        	System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
        } else if (countGroup == 3) {
        	System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
        } else {
        	System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các grop");
        }
        
        //Question 3: Sử dụng toán tử ternary để làm Question 1
        System.out.println("\n");
        System.out.println("============Question 3============");
        System.out.println(acc2.department == null ? "Nhân viên này chưa có phòng ban" : "Phòng ban của nhân viên này là: " + acc2.department.name);
	
        //Question 4: 
        System.out.println("\n");
        System.out.println("============Question 4============");
        System.out.println(acc1.position.name.toString() == "Dev" ? "Đây là Developer" : "Người này không phải là Developer");
        
        //Question 5:
        System.out.println("\n");
        System.out.println("============Question 5============");
        int countAcountInGroup1 = group1.accounts.length;
        switch (countAcountInGroup1) {
		case 1:
			System.out.println("Nhóm có một thành viên");
			break;
		case 2:
			System.out.println("Nhóm có hai thành viên");
			break;
		case 3:
			System.out.println("Nhóm có ba thành viên");
			break;
		default:
			System.out.println("Nhóm có nhiều thành viên");
			break;
		}
        
        //Question 6:
        System.out.println("\n");
        System.out.println("============Question 6============");
        int countAcountInGroup2 = acc2.groups.length;
        switch (countAcountInGroup2) {
        case 0:
        	System.out.println("Nhân viên này chưa có group");
        	break;
		case 1:
		case 2:
			System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
			break;
		case 3:
			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
			break;
		case 4:
			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các grop");
			break;
		default:
			break;
		}
        
        //Question 7:
        System.out.println("\n");
        System.out.println("============Question 7============");
        String Name_Position_Account_1 = acc1.position.name.toString();
        switch (Name_Position_Account_1) {
		case "Dev":
			System.out.println("Đây là Developer");
			break;
		default:
			System.out.println("Người này không phải là Developer");
			break;
		}
        
        //Question 8: In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của họ
        System.out.println("\n");
        System.out.println("============Question 8============");
        Account[] InformationAccount = {acc1, acc2, acc3};
        for (Account account : InformationAccount) {
        	System.out.println(
        			"Email: " + account.email + " "
        			+"FullName: " + account.fullName + " "
        			+"Tên phòng ban: " + account.department.name
        	);
		}
        
        //Question 9: In ra thông tin các phòng ban bao gồm: id và name
        System.out.println("\n");
        System.out.println("============Question 9============");
        Department[] InformationDepartment = {dep1, dep2, dep3};
        for (Department department : InformationDepartment) {
        	System.out.println(
        			"ID: " + department.id + " "
        			+"Name: " + department.name + " "
        			);
        }
        
        //Question 10:
        System.out.println("\n");
        System.out.println("============Question 10============");
        Account[] arrAccount_10 = {acc1, acc2};
        for (int i=0; i < arrAccount_10.length; i++) {
        	System.out.println("Thông tin account thứ " + (i+1) + " là:");
        	System.out.println("Email: " + arrAccount_10[i].email);
        	System.out.println("Full name: " + arrAccount_10[i].fullName);
        	System.out.println("Phòng ban: " + arrAccount_10[i].department.name);
        }
        	
        //Question 11
        System.out.println("\n");
        System.out.println("============Question 11============");
        Department[] arrDepartment_11 = {dep1, dep2};
        for (int i=0; i<arrDepartment_11.length; i++) {
        	System.out.println("Thông tin Department thứ "+(i+1)+" là:");
        	System.out.println("Id: "+arrDepartment_11[i].id);
        	System.out.println("Name: "+arrDepartment_11[i].name);
        }
        
        //Question 12: Chỉ in ra thông tin 2 department đầu tiên theo định dạng như Question 10
        System.out.println("\n");
        System.out.println("============Question 12============");
        Department[] arrDepartment_12 = {dep1, dep2, dep3};
        for(int i=0; i<2; i++) {
        	System.out.println("Thông tin account thứ " + (i+1) + " là:");
        	System.out.println("Email: " + arrDepartment_12[i].id);
        	System.out.println("Phòng ban: " + arrDepartment_12[i].name);
        }
        
        //Question 13: In ra thông tin tất cả các account ngoại trừ account thứ 2
        System.out.println("\n");
        System.out.println("============Question 13============");
        Account[] arrAccount_13 = {acc1, acc2,acc3};
        for(int i=0; i<arrAccount_13.length; i++) {
        	if (i != 1) { 
                System.out.println("Thông tin account thứ " + (i + 1));
                System.out.println("Email: " + arrAccount_13[i].email);
                System.out.println("Full name: " + arrAccount_13[i].fullName);
                System.out.println("Phòng ban: " + arrAccount_13[i].department.name);
                System.out.println();
            }
        }
        
        //Question 14: In ra thông tin tất cả các account có id < 4
        System.out.println("\n");
        System.out.println("============Question 14============");
        Account[] arrAccount_14 = {acc1, acc2,acc3};
        for(int i=0; i<arrAccount_14.length; i++) {
        	if(arrAccount_14[i].id<4) {
        		System.out.println("Thông tin account thứ " + (i + 1));
                System.out.println("Email: " + arrAccount_14[i].email);
                System.out.println("Full name: " + arrAccount_14[i].fullName);
                System.out.println("Phòng ban: " + arrAccount_14[i].department.name);
                System.out.println();
        	}
        }
        
        //Question 15: In ra các số chẵn nhỏ hơn hoặc bằng 20
        System.out.println("\n");
        System.out.println("============Question 15============");
        for(int i=0; i<=20; i++) {
        	if(i%2==0) {
        		System.out.println(i);
        	}
        }
        
        //Question16: Làm lại các Question ở phần FOR bằng cách sử dụng WHILE kết hợp với lệnh break, continue
        System.out.println("\n");
        System.out.println("============Question 16_10============");
        Account[] arrAccount_16_10 = {acc1, acc2};
        int count_16_10 = 0;
        while(count_16_10 < arrAccount_16_10.length) {
        	System.out.println("Thông tin account thứ " + ((count_16_10+1)) + " là:");
        	System.out.println("Email: " + arrAccount_16_10[count_16_10].email);
        	System.out.println("Full name: " + arrAccount_16_10[count_16_10].fullName);
        	System.out.println("Phòng ban: " + arrAccount_16_10[count_16_10].department.name);
        	count_16_10++;
        }
        
        System.out.println("\n");
        System.out.println("============Question 16_11============");
        Department[] arrDepartment_16_11 = {dep1, dep2};
        int count_16_11 = 0;
        while(count_16_11 < arrDepartment_16_11.length) {
        	System.out.println("Thông tin department thứ " + ((count_16_11)+1) + " là:");
        	System.out.println("Id: " + arrDepartment_16_11[count_16_11].id);
        	System.out.println("Name: " + arrDepartment_16_11[count_16_11].name);
        	count_16_11++;
        }
        
        System.out.println("\n");
        System.out.println("============Question 16_13============");
        Account[] arrAccounnt_16_13 = {acc1, acc2,acc3};
        int count_16_13 = 0;
        while(count_16_13 < arrAccounnt_16_13.length) {
        	if(count_16_13 != 1) {
        		System.out.println("Thông tin account thứ " + ((count_16_13) + 1));
                System.out.println("Email: " + arrAccounnt_16_13[count_16_13].email);
                System.out.println("Full name: " + arrAccounnt_16_13[count_16_13].fullName);
                System.out.println("Phòng ban: " + arrAccounnt_16_13[count_16_13].department.name);
                System.out.println();
        	}
        	count_16_13++;
        }
        
        System.out.println("\n");
        System.out.println("============Question 16_12============");
        Department[] arrDepartment_16_12 = {dep1, dep2, dep3};
        int count_16_12 = 0;
        while(count_16_12 < arrDepartment_16_12.length) {
        	if (count_16_12 != 2) { 
        		System.out.println("Thông tin department thứ " + ((count_16_12)+1) + " là:");
            	System.out.println("Id: " + arrDepartment_16_12[count_16_12].id);
            	System.out.println("Name: " + arrDepartment_16_12[count_16_12].name);
            	count_16_12++;
            	System.out.println();
            }
        }
	}
}
