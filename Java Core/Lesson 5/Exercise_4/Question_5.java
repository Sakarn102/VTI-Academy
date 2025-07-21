package Exercise_4;

import java.util.Scanner;

public class Question_5 {
	public static void Question_5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ho: ");
		String n1 = sc.nextLine();
		System.out.println("Enter ten: ");
		String n2 = sc.nextLine();
		System.out.println("Ho ten: " + n1.concat(" "+n2));
	}
	public static void main(String[] args) {
		Question_5();
	}
}
