package org.example.repository.Position;

import org.example.utils.HibernateUtils;
import org.example.entity.Position;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class PositionRepository implements IPositionRepository {
    @Override
    public Position create(Position position) {
        Transaction transaction = null;
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.persist(position);
            transaction.commit();
        }
        return position;
    }

    @Override
    public List<Position> getAllPosition() {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            return session.createQuery("FROM Position", Position.class).list();
        }
    }
}
