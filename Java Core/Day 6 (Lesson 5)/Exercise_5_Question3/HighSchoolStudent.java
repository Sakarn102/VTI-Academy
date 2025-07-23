package Exercise_5_Question3;

public class HighSchoolStudent extends Student {
	protected String clazz;
	protected String desiredUniversity;
	
	public HighSchoolStudent(int id, String name, String clazz, String desiredUniversity) {
		super(name, id);
		this.clazz = clazz;
		this.desiredUniversity = desiredUniversity;
	}

	@Override
	public String toString() {
		return "ID: " + id + "\n"
				+"Name: " + name + "\n"
				+"Clazz: " + clazz + "\n"
				+"Desired University: " + desiredUniversity;
	}
	
	
	
}
