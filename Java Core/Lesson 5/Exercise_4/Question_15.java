package Exercise_4;

import java.util.Scanner;

public class Question_15 {
	public static void Question_15() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		String[] arr = name.trim().split("\\s+");
		String reversed = "";
		for(int i = arr.length - 1; i >= 0; i--) {
			reversed += arr[i] + " ";
		}
		System.out.println(reversed);
	}
	public static void main(String[] args) {
		Question_15();
	}
}
