package Testing_System;

import java.time.LocalDate;
import java.time.LocalDateTime;

import Testing_System.Position.PositionName;
import Testing_System.TypeQuestion.TypeName;

public class Program {
	public static void main(String[] args) {
		
		// Create Departments
        Department dep1 = new Department();
        dep1.id = 1;
        dep1.name = "Marketing";
        
        Department dep2 = new Department();
        dep2.id = 2;
        dep2.name = "Sale";
        
        Department dep3 = new Department();
        dep3.id = 3;
        dep3.name = "BOD";
        
        // Create Positions
        Position pos1 = new Position();
        pos1.id = 1;
        pos1.name = PositionName.Dev;
        
        Position pos2 = new Position();
        pos2.id = 2;
        pos2.name = PositionName.PM;
        
        Position pos3 = new Position();
        pos3.id = 3;
        pos3.name = PositionName.Scrum_Master;
        
        // Create Groups
        Group group1 = new Group();
        group1.id = 1;
        group1.name = "Testing System";
        group1.createDate = LocalDate.now();
        
        Group group2 = new Group();
        group2.id = 2;
        group2.name = "Development";
        group2.createDate = LocalDate.of(2021, 3, 15);
        
        Group group3 = new Group();
        group3.id = 3;
        group3.name = "Sale";
        group3.createDate = LocalDate.of(2021, 3, 10);
        
        // Create Accounts
        Account acc1 = new Account();
        acc1.id = 1;
        acc1.email = "anhnt1@gmail.com";
        acc1.userName = "anhnt1";
        acc1.fullName = "Anh Nguyen 1";
        acc1.department = dep1;
        acc1.position = pos1;
        acc1.createDate = LocalDate.now();
        acc1.groups = new Group[]{group1, group2};
        
        Account acc2 = new Account();
        acc2.id = 2;
        acc2.email = "anhnt2@gmail.com";
        acc2.userName = "anhnt2";
        acc2.fullName = "Anh Nguyen 2";
        acc2.department = dep2;
        acc2.position = pos2;
        acc2.createDate = LocalDate.of(2021, 3, 17);
        acc2.groups = new Group[]{group3, group2};
        
        Account acc3 = new Account();
        acc3.id = 3;
        acc3.email = "anhnt3@gmail.com";
        acc3.userName = "anhnt3";
        acc3.fullName = "Anh Nguyen 3";
        acc3.department = dep3;
        acc3.position = pos3;
        acc3.createDate = LocalDate.now();
        acc3.groups = new Group[]{group1};
        
        // Set group creators
        group1.creator = acc1;
        group2.creator = acc2;
        group3.creator = acc3;
        
        // Create Type Questions
        TypeQuestion type1 = new TypeQuestion();
        type1.id = 1;
        type1.name = TypeName.Essay;
        
        TypeQuestion type2 = new TypeQuestion();
        type2.id = 2;
        type2.name = TypeName.Multiple_choice;
        
        // Create Category Questions
        CategoryQuestion cat1 = new CategoryQuestion();
        cat1.id = 1;
        cat1.name = "Java";
        
        CategoryQuestion cat2 = new CategoryQuestion();
        cat2.id = 2;
        cat2.name = "SQL";
        
        CategoryQuestion cat3 = new CategoryQuestion();
        cat3.id = 3;
        cat3.name = "Postman";
        
        CategoryQuestion cat4 = new CategoryQuestion();
        cat4.id = 4;
        cat4.name = ".NET";
        
        CategoryQuestion cat5 = new CategoryQuestion();
        cat5.id = 5;
        cat5.name = "Ruby";
        
        // Create Questions
        Question q1 = new Question();
        q1.id = 1;
        q1.content = "What is OOP in Java?";
        q1.category = cat1;
        q1.type = type1;
        q1.creator = acc1;
        q1.createDate = LocalDate.now();
        
        Question q2 = new Question();
        q2.id = 2;
        q2.content = "Which of the following is correct about Java?";
        q2.category = cat1;
        q2.type = type2;
        q2.creator = acc2;
        q2.createDate = LocalDate.of(2021, 3, 15);
        
        Question q3 = new Question();
        q3.id = 3;
        q3.content = "What is SELECT statement in SQL?";
        q3.category = cat2;
        q3.type = type1;
        q3.creator = acc3;
        q3.createDate = LocalDate.now();
        
        // Create Answers
        Answer ans1 = new Answer();
        ans1.id = 1;
        ans1.content = "Object-Oriented Programming";
        ans1.question = q1;
        ans1.isCorrect = true;
        
        Answer ans2 = new Answer();
        ans2.id = 2;
        ans2.content = "Java is platform independent";
        ans2.question = q2;
        ans2.isCorrect = true;
        
        Answer ans3 = new Answer();
        ans3.id = 3;
        ans3.content = "Java is only for web development";
        ans3.question = q2;
        ans3.isCorrect = false;
        
        // Create GroupAccount relationships
        GroupAccount ga1 = new GroupAccount();
        ga1.groupId = 1;
        ga1.accountId = 1;
        ga1.group = group1;
        ga1.account = acc1;
        ga1.joinDate = LocalDate.now();
        
        GroupAccount ga2 = new GroupAccount();
        ga2.groupId = 2;
        ga2.accountId = 1;
        ga2.group = group2;
        ga2.account = acc1;
        ga2.joinDate = LocalDate.of(2021, 3, 15);
        
        GroupAccount ga3 = new GroupAccount();
        ga3.groupId = 3;
        ga3.accountId = 2;
        ga3.group = group3;
        ga3.account = acc2;
        ga3.joinDate = LocalDate.of(2021, 3, 18);
        
        //Create Exam
        Exam exam1 = new Exam();
        exam1.id = 1;
        exam1.code = "JAVA_001";
        exam1.title = "Java Basic Test";
        exam1.category = cat1;
        exam1.duration = 60;
        exam1.creator = acc1;
        exam1.createDate = LocalDate.now();
        exam1.questions = new Question[]{q1, q2};
        
        Exam exam2 = new Exam();
        exam2.id = 2;
        exam2.code = "SQL_001";
        exam2.title = "SQL Fundamentals";
        exam2.category = cat2;
        exam2.duration = 45;
        exam2.creator = acc2;
        exam2.createDate = LocalDate.of(2021, 3, 20);
        exam2.questions = new Question[]{q3};
        
     // Create ExamQuestion relationships
        ExamQuestion eq1 = new ExamQuestion();
        eq1.examId = 1;
        eq1.questionId = 1;
        eq1.exam = exam1;
        eq1.question = q1;
        
        ExamQuestion eq2 = new ExamQuestion();
        eq2.examId = 1;
        eq2.questionId = 2;
        eq2.exam = exam1;
        eq2.question = q2;
        
        ExamQuestion eq3 = new ExamQuestion();
        eq3.examId = 2;
        eq3.questionId = 3;
        eq3.exam = exam2;
        eq3.question = q3;
        
     // Print information
        System.out.println("=== DEPARTMENT INFORMATION ===");
        System.out.println("Department 1: ID=" + dep1.id + ", Name=" + dep1.name);
        System.out.println("Department 2: ID=" + dep2.id + ", Name=" + dep2.name);
        System.out.println("Department 3: ID=" + dep3.id + ", Name=" + dep3.name);
        
        System.out.println("\n=== POSITION INFORMATION ===");
        System.out.println("Position 1: ID=" + pos1.id + ", Name=" + pos1.name);
        System.out.println("Position 2: ID=" + pos2.id + ", Name=" + pos2.name);
        System.out.println("Position 3: ID=" + pos3.id + ", Name=" + pos3.name);
        
        System.out.println("\n=== GROUP INFORMATION ===");
        System.out.println("Group 1: ID=" + group1.id + ", Name=" + group1.name + 
                          ", Creator=" + group1.creator.fullName + ", CreateDate=" + group1.createDate);
        System.out.println("Group 2: ID=" + group2.id + ", Name=" + group2.name + 
                          ", Creator=" + group2.creator.fullName + ", CreateDate=" + group2.createDate);
        System.out.println("Group 3: ID=" + group3.id + ", Name=" + group3.name + 
                          ", Creator=" + group3.creator.fullName + ", CreateDate=" + group3.createDate);
        
        System.out.println("\n=== CATEGORY QUESTION INFORMATION ===");
        System.out.println("Category 1: ID=" + cat1.id + ", Name=" + cat1.name);
        System.out.println("Category 2: ID=" + cat2.id + ", Name=" + cat2.name);
        System.out.println("Category 3: ID=" + cat3.id + ", Name=" + cat3.name);
        System.out.println("Category 4: ID=" + cat4.id + ", Name=" + cat4.name);
        System.out.println("Category 5: ID=" + cat5.id + ", Name=" + cat5.name);
        
        System.out.println("\n=== TYPE QUESTION INFORMATION ===");
        System.out.println("Type 1: ID=" + type1.id + ", Name=" + type1.name);
        System.out.println("Type 2: ID=" + type2.id + ", Name=" + type2.name);
        
        System.out.println("\n=== ACCOUNT INFORMATION ===");
        System.out.println("Account 1: ID=" + acc1.id + ", Email=" + acc1.email + 
                          ", UserName=" + acc1.userName + ", FullName=" + acc1.fullName + 
                          ", Department=" + acc1.department.name + ", Position=" + acc1.position.name + 
                          ", Groups=" + acc1.groups[0].name + ", " + acc1.groups[1].name + 
                          ", CreateDate=" + acc1.createDate);
        
        System.out.println("Account 2: ID=" + acc2.id + ", Email=" + acc2.email + 
                          ", UserName=" + acc2.userName + ", FullName=" + acc2.fullName + 
                          ", Department=" + acc2.department.name + ", Position=" + acc2.position.name + 
                          ", Groups=" + acc2.groups[0].name + ", " + acc2.groups[1].name + 
                          ", CreateDate=" + acc2.createDate);
        
        System.out.println("Account 3: ID=" + acc3.id + ", Email=" + acc3.email + 
                          ", UserName=" + acc3.userName + ", FullName=" + acc3.fullName + 
                          ", Department=" + acc3.department.name + ", Position=" + acc3.position.name + 
                          ", Groups=" + acc3.groups[0].name + ", CreateDate=" + acc3.createDate);
        
        System.out.println("\n=== QUESTION INFORMATION ===");
        System.out.println("Question 1: ID=" + q1.id + ", Content=" + q1.content + 
                          ", Category=" + q1.category.name + ", Type=" + q1.type.name + 
                          ", Creator=" + q1.creator.fullName + ", CreateDate=" + q1.createDate);
        
        System.out.println("Question 2: ID=" + q2.id + ", Content=" + q2.content + 
                          ", Category=" + q2.category.name + ", Type=" + q2.type.name + 
                          ", Creator=" + q2.creator.fullName + ", CreateDate=" + q2.createDate);
        
        System.out.println("Question 3: ID=" + q3.id + ", Content=" + q3.content + 
                          ", Category=" + q3.category.name + ", Type=" + q3.type.name + 
                          ", Creator=" + q3.creator.fullName + ", CreateDate=" + q3.createDate);
        
        System.out.println("\n=== ANSWER INFORMATION ===");
        System.out.println("Answer 1: ID=" + ans1.id + ", Content=" + ans1.content + 
                          ", Question=" + ans1.question.content + ", IsCorrect=" + ans1.isCorrect);
        
        System.out.println("Answer 2: ID=" + ans2.id + ", Content=" + ans2.content + 
                          ", Question=" + ans2.question.content + ", IsCorrect=" + ans2.isCorrect);
        
        System.out.println("Answer 3: ID=" + ans3.id + ", Content=" + ans3.content + 
                          ", Question=" + ans3.question.content + ", IsCorrect=" + ans3.isCorrect);
        
        System.out.println("\n=== EXAM INFORMATION ===");
        System.out.println("Exam 1: ID=" + exam1.id + ", Code=" + exam1.code + 
                          ", Title=" + exam1.title + ", Category=" + exam1.category.name + 
                          ", Duration=" + exam1.duration + " minutes" + 
                          ", Creator=" + exam1.creator.fullName + ", CreateDate=" + exam1.createDate);
        
        System.out.println("Exam 2: ID=" + exam2.id + ", Code=" + exam2.code + 
                          ", Title=" + exam2.title + ", Category=" + exam2.category.name + 
                          ", Duration=" + exam2.duration + " minutes" + 
                          ", Creator=" + exam2.creator.fullName + ", CreateDate=" + exam2.createDate);
        
        System.out.println("\n=== GROUP-ACCOUNT RELATIONSHIPS ===");
        System.out.println("GroupAccount 1: GroupID=" + ga1.groupId + ", AccountID=" + ga1.accountId + 
                          ", Group=" + ga1.group.name + ", Account=" + ga1.account.fullName + 
                          ", JoinDate=" + ga1.joinDate);
        
        System.out.println("GroupAccount 2: GroupID=" + ga2.groupId + ", AccountID=" + ga2.accountId + 
                          ", Group=" + ga2.group.name + ", Account=" + ga2.account.fullName + 
                          ", JoinDate=" + ga2.joinDate);
        
        System.out.println("GroupAccount 3: GroupID=" + ga3.groupId + ", AccountID=" + ga3.accountId + 
                          ", Group=" + ga3.group.name + ", Account=" + ga3.account.fullName + 
                          ", JoinDate=" + ga3.joinDate);
        
        System.out.println("\n=== EXAM-QUESTION RELATIONSHIPS ===");
        System.out.println("ExamQuestion 1: ExamID=" + eq1.examId + ", QuestionID=" + eq1.questionId + 
                          ", Exam=" + eq1.exam.title + ", Question=" + eq1.question.content);
        
        System.out.println("ExamQuestion 2: ExamID=" + eq2.examId + ", QuestionID=" + eq2.questionId + 
                          ", Exam=" + eq2.exam.title + ", Question=" + eq2.question.content);
        
        System.out.println("ExamQuestion 3: ExamID=" + eq3.examId + ", QuestionID=" + eq3.questionId + 
                          ", Exam=" + eq3.exam.title + ", Question=" + eq3.question.content);
	}
}
