package Exercise_4;

import java.util.Scanner;

public class Question_1 {
	public static void Question_1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		String[] a = name.trim().split("\\s+");
		System.out.println(a.length);
	}
	public static void main(String[] args) {
		Question_1();
	}
}
