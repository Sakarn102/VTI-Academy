package Exercise_4;

import java.util.Scanner;

public class Question_13 {
	public static void Question_13() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		for(int i = 0; i < name.length(); i++) {
			if(CheckNumber(name.charAt(i))) {
				System.out.println("False");
				return;
			}
		}
	}
	public static boolean CheckNumber(char str) {
		if (str >= '0' && str <= '9') {
			return true;
		} else {
			return false;
		}
	}
	public static void main(String[] args) {
		Question_13();
	}
}
