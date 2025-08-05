package Exercise_4;

import java.util.Scanner;

public class Question_10 {
	public static void Question_10() {
		Scanner sc = new Scanner(System.in);
		System.out.println("String s1: ");
		String s1 = sc.nextLine();
		System.out.println("String s2: ");
		String s2 = sc.nextLine();
		String reversed = new StringBuilder(s2).reverse().toString();
		if(s1.equals(reversed)) {
			System.out.println("s1 is reversed s2");
		} else {
			System.out.println("s1 is not reversed s2");
		}
	}
	public static void main(String[] args) {
		Question_10();
	}
}
