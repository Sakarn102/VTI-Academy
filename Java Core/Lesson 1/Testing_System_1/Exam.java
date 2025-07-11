package Testing_System;

import java.time.LocalDateTime;

public class Exam {
	private int examID;
	private String code;
	private String title;
	CategoryQuestion categoryID;
	private int duration;
	private Account creatorID;
	private LocalDateTime createDate;
	
	
	public Exam(int examID, String code, String title, CategoryQuestion categoryID, int duration, Account creatorID, LocalDateTime createDate) {
		this.examID = examID;
		this.code = code;
		this.title = title;
		this.categoryID = categoryID;
		this.duration = duration;
		this.creatorID = creatorID;
		this.createDate = createDate;
	}


	@Override
	public String toString() {
		return 
				"ExamID: " + examID + "\n"
				+"Code: " + code + "\n"
				+"Title: " + title + "\n"
				+"CategoryID: " + categoryID.getCategoryID() + "\n"
				+"Duration: " + duration + "\n"
				+"CreatorID: " + creatorID.getAccountID() + "\n"
				+"CreateDate: " + createDate + "\n";
	}

	public int getExamID() {
		return examID;
	}


	public void setExamID(int examID) {
		this.examID = examID;
	}
	
}
