package org.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "examquestion")
public class ExamQuestion {

    @EmbeddedId
    private ExamQuestionId id;

    @ManyToOne
    @MapsId("examID")
    @JoinColumn(name = "ExamID", nullable = false)
    private Exam exam;

    @ManyToOne
    @MapsId("questionId")
    @JoinColumn(name = "QuestionID", nullable = false)
    private Question question;

    public ExamQuestionId getId() {
        return id;
    }

    public void setId(ExamQuestionId id) {
        this.id = id;
    }

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}
