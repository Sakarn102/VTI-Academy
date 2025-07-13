package Exercise_4;

import java.util.Random;

public class Question_7 {
	public static void main(String[] args) {
		Question7();
	}
	
	public static void Question7() {
		Random rand = new Random();
        int randomNumber = rand.nextInt(900) + 100; // từ 100 đến 999

        System.out.println("Số ngẫu nhiên có 3 chữ số là: " + randomNumber);
	}
}
