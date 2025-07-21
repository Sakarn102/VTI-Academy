package Exercise_1;

import java.util.Random;

public class Question_3 {
	public static void Question_3() {
		Random random = new Random();
		
		int a = 10000 + random.nextInt(90000);
		
		String twoLastNumber = String.valueOf(a).substring(3);
		
		System.out.println(twoLastNumber);
	}
	public static void main(String[] args) {
		Question_3();
	}
}
