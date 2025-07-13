package Exercise_4;

import java.util.Random;

public class Question_3 {
	public static void main(String[] args) {
		Question3();
	}
	
	public static void Question3() {
		String [] name = {"A", "B", "C", "D", "E"};
		Random rand = new Random();
        int randomIndex = rand.nextInt(name.length);
        System.out.println(name[randomIndex]);
	}
}
