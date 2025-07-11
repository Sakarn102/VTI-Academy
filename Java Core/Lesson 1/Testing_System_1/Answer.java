package Testing_System;

public class Answer {
	private int answerID;
	private String content;
	Question questionID;
	private boolean isCorrect;
	
	public Answer(int answerID, String content, Question questionID, boolean isCorrect) {
		this.answerID = answerID;
		this.content = content;
		this.questionID = questionID;
		this.isCorrect = isCorrect;
	}

	@Override
	public String toString() {
		return 
				"AnswerID: " + answerID + "\n"
				+"Content: " + content + "\n"
				+ "QuestionID: " + questionID.getQuestionID() + "\n"
				+ "IsCorrect: " + isCorrect + "\n";
	}
}
