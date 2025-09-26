package org.example.service.BaiTap;

import org.example.entity.Question;
import org.example.repository.BaiTap.QuestionRepository;

import java.util.List;

public class QuestionService implements IQuestionService {
    private final QuestionRepository questionRepository;
    public QuestionService() {
        this.questionRepository = new QuestionRepository();
    }
    @Override
    public List<Question> getQuestionsWithAtLeastTwoCorrectAnswers() {
        return questionRepository.getQuestionsWithAtLeastTwoCorrectAnswers();
    }
}
