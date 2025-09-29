/*
package com.example.repository;

import com.example.entity.Department;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DepartmentRepositoryImpl implements IDepartmentRepository {
    public List<Department> getDepartments() {
        Query<Department> query;
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            String hql = "FROM department";
            query = session.createQuery(hql, Department.class);
            return query.list();

        }
    }
}
*/
