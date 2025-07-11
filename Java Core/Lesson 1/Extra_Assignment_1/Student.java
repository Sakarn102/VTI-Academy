package Assignment_1;

public class Student {
	private String id;
	private String name;
	private int age;
	private String homeTown; // Địa chỉ
	private String level; // Đại học (h) Cao đẳng
	private int durationYears; // Thời gian đào tạo
	private int totalCredits; // Số tín chỉ tích lũy
	
	public Student(String id, String name, int age, String homeTown, String level, int durationYears, int totalCredits) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.homeTown = homeTown;
		this.level = level;
		this.durationYears = durationYears;
		this.totalCredits = totalCredits;
	}
	
	public void study() {
		System.out.println(name + " đang học bài...");
	}
	
	public void doHomeWork() {
		System.out.println(name + " đang làm bài tập...");
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", homeTown=" + homeTown + ", level=" + level
				+ ", durationYears=" + durationYears + ", totalCredits=" + totalCredits + "]";
	}
	
}
