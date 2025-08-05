package Exercise_4;

import java.util.Scanner;

public class Question_12 {
	private static void Question_12() {
		Scanner sc = new Scanner(System.in);
		System.out.println("String s1: ");
		String s1 = sc.nextLine();
		String reversed = "";
		for(int i = s1.length() - 1; i >= 0; i--) {
			reversed += s1.charAt(i);
		}
		System.out.println(reversed);
	}
	public static void main(String[] args) {
		Question_12();
	}
}
