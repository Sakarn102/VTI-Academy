package Exercise_5;

import java.util.Scanner;

public class Question_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Mời nhập họ: ");
		String s1 = sc.next();
		System.out.println("Mời nhập tên: ");
		String s2 = sc.next();
		
		System.out.println("Họ tên: " +s1+" "+s2);
		
		sc.close();
	}
}
