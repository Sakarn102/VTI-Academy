package Exercise_2_2;

import java.util.Scanner;

import Exercise_2_2.Person.Gender;

public class Test {
	public static void main(String[] args) {
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
	public static void demoPerson() {
		Person person = new Person();
		person.inputInfo();
		System.out.println("============ Information Student ============");
		System.out.println(person.showInfo());
	}
	public static void demoStudent() {
		Student student = new Student();
		student.inputInfo();
		System.out.println("============ Information Student ============");
		System.out.println(student.showInfo());
		if(student.scholarShip() == true) {
			System.out.println("This student won a scholarship. ");
		} else {
			System.out.println("This student did not get the scholarship.");
		}
	}
}
