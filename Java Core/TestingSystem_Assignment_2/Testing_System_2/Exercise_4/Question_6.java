package Exercise_4;

import java.time.LocalDate;
import java.util.Random;

public class Question_6 {
	public static void main(String[] args) {
		Question6();
	}
	
	public static void Question6() {
		Random rand = new Random();

        int daysBack = rand.nextInt(1000) + 1; // random từ 1 đến 1000 ngày trước
        LocalDate today = LocalDate.now();
        LocalDate randomPastDate = today.minusDays(daysBack);

        System.out.println("Ngày được chọn ngẫu nhiên trong quá khứ là: " + randomPastDate);
	}
}
