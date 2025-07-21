package Exercise_5;
import Exercise_5.*;
public class Question_5 {
	public static void print() {
		Department dep1 = new Department(1, "Sale");
		Department dep2 = new Department(2, "Marketing");
		Department dep3 = new Department(3, "IT");
		if(dep1.name=="Phong A") {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}
	public static void main(String[] args) {
		print();
	}
}
