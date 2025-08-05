package Exercise_1;

import java.util.Scanner;

public class Question_4 {
	public static void Question_4() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a: ");
		int a = scanner.nextInt();
		System.out.println("Enter b: ");
		int b = scanner.nextInt();
		
		int c = a / b;
		
		System.out.println(c);
		
		scanner.close();
	}
	public static void main(String[] args) {
		Question_4();
	}
}
