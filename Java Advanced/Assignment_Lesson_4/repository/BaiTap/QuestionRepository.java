package org.example.repository.BaiTap;

import org.example.entity.Question;
import org.example.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class QuestionRepository implements IQuestionRepository {
    @Override
    public List<Question> getQuestionsWithAtLeastTwoCorrectAnswers() {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            String hql = "SELECT q FROM Question q JOIN q.answers a WHERE a.isCorrect = true GROUP BY q HAVING COUNT(a) >= 2";
            Query<Question> query = session.createQuery(hql, Question.class);
            return query.list();
        }
    }
}
