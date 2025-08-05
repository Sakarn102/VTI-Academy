package Exercise_4;

import java.time.LocalDate;
import java.util.Random;

public class Question_4 {
	public static void main(String[] args) {
		Question3();
	}
	
	public static void Question3() {
		Random rd = new Random();
		
		int minDay = (int) LocalDate.of(1995, 07, 24).toEpochDay();
		int maxDay = (int) LocalDate.of(1995, 12, 20).toEpochDay();
		
		long randomInt = minDay + rd.nextInt(maxDay - minDay);
		
		LocalDate randomDay = LocalDate.ofEpochDay(randomInt);
		
		System.out.println(randomDay);
	}
}
