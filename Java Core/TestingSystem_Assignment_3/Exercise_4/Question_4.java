package Exercise_4;

import java.util.Scanner;

public class Question_4 {
	public static void Question_4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		for(int i = 0 ; i < name.length(); i++) {
				System.out.println("Ki tu thu "+ i + " la: "+ name.charAt(i));
		}
	}
	public static void main(String[] args) {
		Question_4();
	}
}
