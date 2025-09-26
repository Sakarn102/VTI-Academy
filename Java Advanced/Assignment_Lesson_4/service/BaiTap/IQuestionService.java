package org.example.service.BaiTap;

import org.example.entity.Question;

import java.util.List;

public interface IQuestionService {
    List<Question> getQuestionsWithAtLeastTwoCorrectAnswers();
}
