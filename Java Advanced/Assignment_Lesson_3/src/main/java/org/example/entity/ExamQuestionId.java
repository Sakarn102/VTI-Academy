package org.example.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ExamQuestionId implements Serializable {
    private int examId;
    private int questionId;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        };
        if (!(o instanceof ExamQuestionId)) {
            return false;
        }

        ExamQuestionId that = (ExamQuestionId) o;
        return examId == that.examId && questionId == that.questionId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(examId, questionId);
    }
}
