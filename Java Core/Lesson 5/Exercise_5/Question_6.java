package Exercise_5;

import java.util.Arrays;
import java.util.Comparator;

import Exercise_5.*;

public class Question_6 {
	public static void main(String[] args) {
		Department dep1 = new Department(1, "Sale");
		Department dep2 = new Department(2, "Marketing");
		Department dep3 = new Department(3, "IT");
		Department dep4 = new Department(4, "Accounting");
		Department dep5 = new Department(5, "Security");
		Department[] arrDepartments = {dep1, dep2, dep3, dep4, dep5};
	
		Arrays.sort(arrDepartments, new Comparator<Department>() {
			@Override
			public int compare(Department dep1, Department dep2) {
				return dep1.name.compareTo(dep2.name);
			}
		});

		// In ra danh sách đã sắp xếp
		for (Department dep : arrDepartments) {
			System.out.println(dep);
		}
	}
}


