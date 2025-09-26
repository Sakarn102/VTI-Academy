package org.example.Repository.Department;

import org.example.Utils.HibernateUtils;
import org.example.entity.Department;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DepartmentRepository implements IDepartmentRepository {
    @Override
    public Department create(Department department) {
        Transaction transaction;
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.persist(department);
            transaction.commit();
        }
        return department;
    }

    @Override
    public Department findById(int id) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            return session.get(Department.class, id);
        }
    }
}
