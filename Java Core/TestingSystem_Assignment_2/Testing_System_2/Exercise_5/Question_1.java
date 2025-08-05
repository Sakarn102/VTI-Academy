package Exercise_5;

import java.util.Scanner;

public class Question_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<3; i++) {
			System.out.println("Mời nhập số nguyên thứ "+(i+1));
			String s1 = sc.next();
			System.out.println("Số nguyên thứ "+(i+1)+" :"+ s1);
		}
		sc.close();
	}
}
