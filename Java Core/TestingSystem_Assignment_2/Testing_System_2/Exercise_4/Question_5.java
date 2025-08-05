package Exercise_4;

import java.time.LocalDate;
import java.util.Random;

public class Question_5 {
	public static void main(String[] args) {
		Question5();
	}
	
	public static void Question5() {
Random rd = new Random();
		
		int minDay = (int) LocalDate.of(2024, 07, 14).toEpochDay();
		int maxDay = (int) LocalDate.now().toEpochDay();
		
		long randomInt = minDay + rd.nextInt(maxDay - minDay);
		
		LocalDate randomDay = LocalDate.ofEpochDay(randomInt);
		
		System.out.println(randomDay);
	}
}
