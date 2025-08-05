package Exercise_4;

import java.util.Scanner;

public class Question_3 {
	public static void Question_3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		
		String result = capitalizeFirst(name);
		System.out.println("New Name: " + result);
	}
		
	public static String capitalizeFirst(String str) {
		if (str == null || str.isEmpty()) return str;
	    return str.substring(0, 1).toUpperCase() + str.substring(1);
	}
	public static void main(String[] args) {
		Question_3();
	}
}
