package Testing_System;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Account {
	
	private int accountID;
	private String email;
	private String userName;
	private String fullName;
	private Gender gender;
	private Department departmentID;
	private Position positionID;
	private LocalDateTime createDate;
	
	//Constructor
	public Account (int accountID, String email, String userName, String fullName, Gender gender, Department departmentID, Position positionID, LocalDateTime createDate) {
		this.accountID = accountID;
		this.email = email;
		this.userName = userName;
		this.fullName = fullName;
		this.gender = gender;
		this.departmentID = departmentID;
		this.positionID = positionID;
		this.createDate = createDate;
	}
	
	@Override
	public String toString() {
		return 
				"AccountID: " + accountID + "\n"
				+ "Email: " + email + "\n"
				+ "UserName: " + userName + "\n"
				+ "FullName: " + fullName + "\n"
				+ "Gender: " + gender + "\n"
				+ "Department: " + departmentID.getDepartmentID() +"\n"
				+ "Position: " + positionID.getPositionID() + "\n"
				+ "CreateDate: " + createDate  + "\n";
	}

	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}
	
	
}
