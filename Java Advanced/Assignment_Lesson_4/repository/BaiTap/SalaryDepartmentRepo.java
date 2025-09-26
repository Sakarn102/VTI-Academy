package org.example.repository.BaiTap;

import org.example.entity.Salary;
import org.example.utils.HibernateUtils;
import org.hibernate.Session;

import java.util.List;

public class SalaryDepartmentRepo {
    public List<Salary> getTotalSalaryByDepartment(int depId) {
        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            String hql = "SELECT a.salary FROM Account a WHERE a.department.id = :depId";
            return session.createQuery(hql, Salary.class)
                    .setParameter("depId", depId)
                    .getResultList();
        }
    }
}
