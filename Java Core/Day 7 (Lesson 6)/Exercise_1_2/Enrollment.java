package Exercise_1_2;

import java.util.Scanner;

public class Enrollment implements IEnrollment{
	protected Student[] students = new Student[100];
	protected int numberOfStudent = 0;
	protected Scanner scanner = new Scanner(System.in);
	

	@Override
	public void addStudent() {
		System.out.println("Enter Block (A/B/C): ");
		String block = scanner. nextLine();
		
		System.out.println("Enter Candidate ID");
		String id = scanner.nextLine();
		
		System.out.println("Enter name: ");
		String name = scanner.nextLine();
		
		System.out.println("Enter address: ");
		String address = scanner.nextLine();
		
		System.out.println("Enter Prioty Level: ");
		int prioty = scanner.nextInt();
		
		if(numberOfStudent < students.length) {
			Student student = null;
			switch (block) {
			case "A":
				student = new StudentA(id, name, address, prioty);
				break;
			case "B":
				student = new StudentB(id, name, address, prioty);
				break;
			case "C":
				student = new StudentC(id, name, address, prioty);
				break;
			default:
				System.out.println("Invalid Block ");
				return;
			}
			students[numberOfStudent] = student;
			numberOfStudent++;
			System.out.println("Add succesfully");
		} else {
			System.out.println("Don't add student ");
		}
		
	}

	@Override
	public void printListStudent() {
		System.out.println("============ List Student ============");
		for (int i = 0; i < numberOfStudent; i++) {
			students[i].showInfo();
			System.out.println();
		}
		
	}
	
	@Override
	public void searchStudent(String candidateId) {
		for(int i = 0; i < students.length; i++) {
			if(students[i].getCandidateId().equalsIgnoreCase(candidateId)) {
				System.out.println("Find student: ");
				students[i].showInfo();
				return;
			} else {
				System.out.println("Don't find student has id: " + candidateId);
			}
		}
		
	}
	
	@Override
	public void Exit() {
		System.exit(0);
		
	}

}
