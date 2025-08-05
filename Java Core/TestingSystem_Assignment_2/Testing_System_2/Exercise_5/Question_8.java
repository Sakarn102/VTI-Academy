package Exercise_5;

import java.util.Scanner;
import Testing_System.*;

public class Question_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int chon;
		while (true) {
			System.out.println("=====Mời banh nhập vào chức năng muốn sử dụng=====");
			System.out.println("1. Tạo account");
			System.out.println("2. Tạo department");
			System.out.println("n. Mời bạn nhập lại");
			chon = sc.nextInt();
			sc.nextLine();
			
			switch (chon) {
			case 1:
				Account ac = new Account();
				Department dep = new Department();
				Position pos = new Position();
				System.out.println("Nhập ID: ");
		        ac.id = sc.nextInt();
		        sc.nextLine();

		        System.out.println("Nhập email: ");
		        ac.email = sc.nextLine();

		        System.out.println("Nhập full name: ");
		        ac.fullName = sc.nextLine();
		        
		        System.out.println("Nhập department id: ");
		        dep.id = sc.nextInt();
		        
		        System.out.println("Nhập position id: ");
		        pos.id = sc.nextInt();
		        
		        System.out.println("=====Thông tin Account=====");
		        System.out.println("ID: " + ac.id);
		        System.out.println("Email: " + ac.email);
		        System.out.println("Full name: " + ac.fullName);
		        System.out.println("Position: " + pos.id);
		        System.out.println("Department: "+ dep.id);
		        sc.close();
				return;

				case 2:
					Department dep1 = new Department();
					
					System.out.println("Nhập ID: ");
					dep1.id = sc.nextInt();
					
					System.out.println("Nhập name: ");
					dep1.name = sc.next();
					
					System.out.println("=====Thông tin Department=====");
					System.out.println("ID: "+dep1.id);
					System.out.println("Name: "+dep1.name);
					sc.close();
					return;
			default:
				System.out.println("Mời bạn nhập lại ");
			}
		}
		
	}
}
