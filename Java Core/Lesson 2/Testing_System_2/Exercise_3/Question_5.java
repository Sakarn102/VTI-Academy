package Exercise_3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import Testing_System.Exam;

public class Question_5 {
	public static void main(String[] args) {
		Exam exam1 = new Exam();
        exam1.id = 1;
        exam1.code = "JAVA_001";
        exam1.title = "Java Basic Test";
        exam1.duration = 60;
        exam1.createDate = LocalDate.now();
        
        DateTimeFormatter formatter  = DateTimeFormatter.ofPattern("MM-dd");
        
        System.out.println(exam1.id);
        System.out.println(exam1.code);
        System.out.println(exam1.title);
        System.out.println(exam1.duration);
        System.out.println(exam1.createDate.format(formatter));
	}
}
