package Exercise_1;

public class Department {
	public int id;
	public String name;
	
	
	public Department() {

	}


	public Department(String nameDepartment) {
		this.id = 0;
		this.name = nameDepartment;
	}

	public static void main(String[] args) {
		
		//
		Department dep1 = new Department();
		System.out.println("Department 1: ");
		System.out.println("ID: " + dep1.id);
		System.out.println("Department Name: " + dep1.name);
		
		//
		Department dep2 = new Department("Sale");
		System.out.println("Department 2: ");
		System.out.println("ID: " + dep2.id);
		System.out.println("Department Name: " + dep2.name);
	}
	
}
