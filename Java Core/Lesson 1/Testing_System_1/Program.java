package Testing_System;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Program {
	public static void main(String[] args) {
		
		Department dep1 = new Department(1, "Marketing");
		Department dep2 = new Department(2, "Sale");
		Department dep3 = new Department(3, "Bảo vệ");
		System.out.println("Table Department: " + "\n"+ dep1);
		
		Position pos1 = new Position(1, "Dev");
		Position pos2 = new Position(2, "Test");
		Position pos3 = new Position(3, "Scrum Master");
		System.out.println("Table Position: "+"\n"+ pos1);
	
		Account ac1 = new Account(1, "email1@gmail.com", "Username1", "Fullname1", Gender.MALE, dep1 , pos1, LocalDateTime.of(2021, 3, 5, 0, 0, 0));
		Account ac2 = new Account(1, "email2@gmail.com", "Username2", "Fullname2", Gender.FEMALE, dep2 , pos2, LocalDateTime.of(2021, 3, 7, 0, 0, 0));
		Account ac3 = new Account(1, "email3@gmail.com", "Username3", "Fullname3", Gender.UNKNOW, dep3 , pos3, LocalDateTime.of(2021, 3, 8, 0, 0, 0));
		System.out.println("Table Account: "+"\n"+ ac1);
		
		Group gr1 = new Group(1, "Testing System", ac1, LocalDateTime.of(2019, 3, 5, 1, 3, 32));
		Group gr2 = new Group(1, "Development", ac2, LocalDateTime.of(2020, 3, 7, 2, 4, 0));
		Group gr3 = new Group(1, "VTI Sale", ac3, LocalDateTime.of(2019, 3, 9, 0, 0, 0));
		System.out.println("Table Group: "+"\n"+ gr1);
		
		GroupAccount ga1 = new GroupAccount(gr1, ac1, LocalDateTime.of(2019, 3, 5, 0, 0, 0));
		GroupAccount ga2 = new GroupAccount(gr2, ac2, LocalDateTime.of(2022, 3, 7, 0, 0, 0));
		GroupAccount ga3 = new GroupAccount(gr3, ac3, LocalDateTime.of(2020, 4, 6, 0, 0, 0));
		System.out.println("Table Group Account: "+"\n"+ ga1);
		
		TypeQuestion tq1 = new TypeQuestion(1, Type_Name.Essay);
		TypeQuestion tq2 = new TypeQuestion(2, Type_Name.Multiple_Choice);
		System.out.println("Table Type Question: "+"\n"+ tq1);
		
		CategoryQuestion cq1 = new CategoryQuestion(1, "Java");
		CategoryQuestion cq2 = new CategoryQuestion(2, "My SQL");
		CategoryQuestion cq3 = new CategoryQuestion(3, "Python");
		System.out.println("Table Category Question: "+"\n"+ cq1);
		
		Question qt1 = new Question(1, "Câu hỏi về Java", cq1, tq1, ac1, LocalDateTime.of(2019, 4, 5, 0, 0, 0));
		Question qt2 = new Question(2, "Câu hỏi về PHP", cq2, tq2, ac2, LocalDateTime.of(2020, 4, 5, 0, 0, 0));
		Question qt3 = new Question(3, "Câu hỏi về C#", cq3, tq1, ac3, LocalDateTime.of(2021, 4, 6, 0, 0, 0));
		System.out.println("Table Question: "+"\n"+ qt1);
		
		Answer as1 = new Answer(1, "Trả lời 01", qt1, true);
		Answer as2 = new Answer(2, "Trả lời 02", qt2, false);
		Answer as3 = new Answer(3, "Trả lời 03", qt3, false);
		System.out.println("Table Answer: "+"\n"+ as1);
		
		Exam ex1 = new Exam(1, "VTIQ001", "Đề thi C#", cq1, 60, ac1, LocalDateTime.of(2019, 4, 5, 0, 0, 0));
		Exam ex2 = new Exam(2, "VTIQ001", "Đề thi PHP", cq2, 60, ac2, LocalDateTime.of(2019, 4, 6, 0, 0, 0));
		Exam ex3 = new Exam(3, "VTIQ001", "Đề thi C++", cq3, 120, ac3, LocalDateTime.of(2019, 4, 7, 0, 0, 0));
		System.out.println("Table Exam: "+"\n"+ ex3);
		
		ExamQuestion eq1 = new ExamQuestion(ex1, qt1);
		ExamQuestion eq2 = new ExamQuestion(ex2, qt2);
		ExamQuestion eq3 = new ExamQuestion(ex3, qt3);
		System.out.println("Table Exam Question: "+"\n"+ eq2);
	}
}
