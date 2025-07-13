package Exercise_5;

import java.util.Scanner;

import Testing_System.*;

public class Question_6 {
	public static Department creatDepartment() {
		Scanner sc = new Scanner(System.in);
		
		Department dep = new Department();
		
		System.out.println("Nhập ID: ");
		dep.id = sc.nextInt();
		
		System.out.println("Nhập name: ");
		dep.name = sc.next();
		
		return dep;
	}
	
	public static void main(String[] args) {
		Department newDepartment = Question_6.creatDepartment();
		System.out.println("=====Thông tin Department=====");
		System.out.println("ID: "+newDepartment.id);
		System.out.println("Name: "+newDepartment.name);
	}
}
