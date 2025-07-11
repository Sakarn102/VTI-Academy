package Testing_System;

public class ExamQuestion {
	Exam examID;
	Question questionID;
	@Override
	public String toString() {
		return 
				"QuestionIDL: " + questionID.getQuestionID() + "\n"
				+"ExamID: " + examID.getExamID() + "\n";
	}
	
	public ExamQuestion(Exam examID, Question questionID) {
		this.examID = examID;
		this.questionID = questionID;
	}
	 
}
