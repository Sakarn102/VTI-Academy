package org.example.controller;

import org.example.entity.Question;
import org.example.service.BaiTap.QuestionService;

import java.util.List;

public class QuestionController {
    public static void main(String[] args) {
        QuestionService questionService = new QuestionService();
        List<Question> questions = questionService.getQuestionsWithAtLeastTwoCorrectAnswers();

        for (Question q : questions) {
            System.out.println("==== Quesstion is 2 answer ====");
            System.out.println("QuestionID: " + q.getId() + " - " + "Content: " + q.getContent());
        }
    }
}
