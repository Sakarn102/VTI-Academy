package Assignment_1;

import java.util.ArrayList;
import java.util.List;

public class Class {
	private String className;
    private String subject;
    private String schedule;
    private Teacher teacher;
    private List<Student> students = new ArrayList<>();

	public Class(String className, String subject, String schedule, Teacher teacher, List<Student> students) {
		this.className = className;
		this.subject = subject;
		this.schedule = schedule;
		this.teacher = teacher;
		this.students = students;
	}
	
	 public String getClassName() {
		 return className;
	 }
	 
	 public void addStudent(Student student) {
		students.add(student);
		System.out.println("Thêm sinh viên " + student + " vào lớp " + className);
	}
	 
	public void startClass() {
		System.out.println("Lớp " + className + " bắt đầu.");
	    teacher.teach();
	}
}
