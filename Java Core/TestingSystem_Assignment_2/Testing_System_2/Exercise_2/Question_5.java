package Exercise_2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Question_5 {
	public static void main(String[] args) {
		Question5();
	}
	
	public static void Question5() {
		String dateTime = "dd/MM/yyyy HH:mm:ss";
		SimpleDateFormat formatter = new SimpleDateFormat(dateTime);
		String strDateTime = formatter.format(new Date());
		System.out.println(strDateTime);
	}
}
