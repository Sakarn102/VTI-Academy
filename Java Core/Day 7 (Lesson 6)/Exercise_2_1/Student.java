package Exercise_2_1;

public class Student implements IStudent{
	protected int id;
	protected String name;
	protected int group;
	public Student(int id, String name, int group) {
		super();
		this.id = id;
		this.name = name;
		this.group = group;
	}
	@Override
	public void callRoll() {
		System.out.println("Name: " + this.name + "diem danh");
		
	}
	@Override
	public void study() {
		System.out.println("Name: " + this.name + " hoc bai");
		
	}
	@Override
	public void goClean() {
		System.out.println("Name: " + this.name + " don ve sinh");
		
	}
	
}
