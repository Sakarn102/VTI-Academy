package Exercise_1_2;

public class StudentA extends Student{
	
	private String subjects = "Math, Physics, Chemistry";
	
	public StudentA(String candidateId, String fullName, String address, int priortyLevel) {
		super(candidateId, fullName, address, priortyLevel);
	}
	
	@Override
	public void showInfo() {
		System.out.println("Block A: " + subjects);
		System.out.println(
				"ID: " + getCandidateId() + "\n" +
				"Full Name: " + getFullName() + "\n" +
				"Address: " + getAddress() + "\n" +
				"Priorty Level: " + getPriortyLevel()
				); 
	}
	
}
