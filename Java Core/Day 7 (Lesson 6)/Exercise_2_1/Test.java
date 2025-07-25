package Exercise_2_1;

public class Test {
	
	public static void main(String[] args) {
		
		
	
		Student student1 = new Student(1, "Nguyen Van A", 1);
		Student student2 = new Student(2, "Nguyen Van B", 2);
		Student student3 = new Student(3, "Nguyen Van C", 3);
		
		Student[] students = new Student[3];
		students[0] = student1;
		students[1] = student2;
		students[2] = student3;
		
		for (Student student : students) {
			student.callRoll();
		}
		for (Student student : students) {
			student.study();
		}
		for (Student student : students) {
			student.goClean();
		}
	}
}
