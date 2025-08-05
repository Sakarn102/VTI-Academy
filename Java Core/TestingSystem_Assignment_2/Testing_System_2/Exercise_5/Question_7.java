package Exercise_5;

import java.util.Scanner;

public class Question_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println("Nhập số chẵn: ");
			n = sc.nextInt();
		} while(n%2!=0);
		System.out.println("N: "+n);
	}
}
