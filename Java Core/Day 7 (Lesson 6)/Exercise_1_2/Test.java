package Exercise_1_2;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Enrollment enrollment = new Enrollment();
		
		while (true) {
			 System.out.println("\n============ MENU ============");
	            System.out.println("a. Thêm mới thí sinh");
	            System.out.println("b. Hiển thị thông tin thí sinh");
	            System.out.println("c. Tìm kiếm theo số báo danh");
	            System.out.println("d. Thoát");
	            
	            System.out.println("Enter function: ");
	            String functions = scanner.nextLine();
	            
	            switch (functions) {
				case "a": {
					enrollment.addStudent();
					break;
				}
				case "b": {
					enrollment.printListStudent();
					break;
				}
				case "c": {
					System.out.println("Enter candidateId find: ");
					String id = scanner.nextLine();
					enrollment.searchStudent(id);
					break;
				}
				case "d": {
					System.out.println("Exit program");
					enrollment.Exit();
					break;
				}

				default:
					break;
				}
		}
	}
}
