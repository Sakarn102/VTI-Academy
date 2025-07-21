package Exercise_1;

import java.util.Random;

public class Question_2 {
	public static void Question_2() {
		Random random = new Random();
		
		int a = 10000 + random.nextInt(90000);
		
		System.out.println(a);
	}
	public static void main(String[] args) {
		Question_2();
	}
}
