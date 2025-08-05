package Exercise_4;

import java.util.Scanner;

public class Question_2 {
	public static void Question_2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter s1: ");
		String s1 = scanner.nextLine();
		System.out.println("Enter s2: ");
		String s2 = scanner.nextLine();
		s1 = s1.concat(s2);
		System.out.println(s1);
	}
	public static void main(String[] args) {
		Question_2();
	}
}
