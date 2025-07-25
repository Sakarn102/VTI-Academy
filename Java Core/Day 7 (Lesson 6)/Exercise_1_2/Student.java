package Exercise_1_2;

public abstract class Student {
	private String candidateId; //số báo danh
	private String fullName;
	private String address; // địa chỉ
	private int priortyLevel; // mức ưu tiên
	
	public Student(String candidateId, String fullName, String address, int priortyLevel) {
		this.candidateId = candidateId;
		this.fullName = fullName;
		this.address = address;
		this.priortyLevel = priortyLevel;
	}
	
	public String getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(String candidateId) {
		this.candidateId = candidateId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPriortyLevel() {
		return priortyLevel;
	}
	public void setPriortyLevel(int priortyLevel) {
		this.priortyLevel = priortyLevel;
	}

	public abstract void showInfo();

	
}
