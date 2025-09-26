package org.example.repository.BaiTap;

import org.example.entity.Question;

import java.util.List;

public interface IQuestionRepository {
    List<Question> getQuestionsWithAtLeastTwoCorrectAnswers();
}
