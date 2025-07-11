package Testing_System;

public class Department {
	private int departmentID;
	private String departmentName;
	
	public Department(int departmentID, String departmentName) {
		this.departmentID = departmentID;
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return 
				"DepartmentID: " + departmentID + "\n"
				+"DepartmentName: " + departmentName + "\n";
	}

	public int getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
}
