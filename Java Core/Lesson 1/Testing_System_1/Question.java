package Testing_System;

import java.time.LocalDateTime;

public class Question {
	private int questionID;
	private String content;
	CategoryQuestion categoryID;
	TypeQuestion typeID;
	Account creatorID;
	LocalDateTime createDate;
	
	public Question(int questionID, String content, CategoryQuestion categoryID, TypeQuestion typeID, Account creatorID, LocalDateTime createDate) {
		this.questionID = questionID;
		this.content = content;
		this.categoryID = categoryID;
		this.typeID = typeID;
		this.creatorID = creatorID;
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return 
				"QuyestionID: " + questionID + "\n"
				+"Content: " + content + "\n"
				+"CategoryID: " + categoryID.getCategoryID() + "\n"
				+"TypeID: " + typeID.getTypeID() + "\n"
				+"CreatorID: " + creatorID.getAccountID() + "\n"
				+"CreateDate: " + createDate + "\n";
	}

	public int getQuestionID() {
		return questionID;
	}

	public void setQuestionID(int questionID) {
		this.questionID = questionID;
	}
	
}
