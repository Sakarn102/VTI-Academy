package Assignment_1;

public class Teacher {
	private String id;
    private String name;
    private int age;
    private String hometown; // Quê quán
    private double salary; // Lương
    private String subject; // Môn học dạy
    
	public Teacher(String id, String name, int age, String hometown, double salary, String subject) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.hometown = hometown;
		this.salary = salary;
		this.subject = subject;
	}
    
	public void teach() {
		System.out.println(name + " đang giảng dạy môn " + subject);
	}
	
	public void giveHomeWork() {
		System.out.println(name + " Đang giao bài tập");
	}
	
	public void fixHomeWork() {
		System.out.println(name + " Đang chữa bài tập");
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", age=" + age + ", hometown=" + hometown + ", salary=" + salary
				+ ", subject=" + subject + "]";
	}
	
}
