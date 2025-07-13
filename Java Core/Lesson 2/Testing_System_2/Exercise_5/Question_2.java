package Exercise_5;

import java.util.Scanner;

public class Question_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<2; i++) {
			System.out.println("Nhập số thực thứ "+(i+1));
			float s = sc.nextFloat();
			System.out.println("Số thực thứ "+(i+1)+": "+s );
		}
		sc.close();
	}
}
