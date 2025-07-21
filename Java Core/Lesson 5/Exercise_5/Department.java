package Exercise_5;

public class Department {
	int id;
	String name;
	
	public Department(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public static void Question_1() {
		Department dep1 = new Department(1, "Sale");
		Department dep2 = new Department(3, "Marketing");
		Department dep3 = new Department(3, "IT");
		Department[] arr = {dep1, dep2, dep3};
		System.out.println("============Department 1============");
		System.out.println("ID: " + dep1.id);
		System.out.println("Department name: " + dep1.name);
	}
	
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		Question_1();
	}
}
