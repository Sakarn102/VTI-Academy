package Exercise_4;

import java.util.Scanner;

public class Question_11 {
	private static void Question_11() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		int count = 0;
		for(int i = 0; i < name.length(); i++) {
			if('a' == name.charAt(i)) {
				count++;
			}
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		Question_11();
	}
}
