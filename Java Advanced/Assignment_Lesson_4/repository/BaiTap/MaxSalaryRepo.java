package org.example.repository.BaiTap;

import org.example.entity.Account;
import org.example.entity.Employee;
import org.example.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.math.BigDecimal;
import java.util.List;

public class MaxSalaryRepo {
    public List<Account> accountMaxSalary() {
        Transaction tx = null;
        List<Account> accounts = null;

        try (Session session = HibernateUtils.getSessionFactory().openSession()) {
            tx = session.beginTransaction();

            // 1 query duy nhất: lấy tất cả nhân viên có lương cao nhất
            Query<Account> query = session.createQuery(
                    "SELECT a FROM Account a JOIN FETCH a.salary " +
                            "WHERE a.salary.salaryName = (SELECT MAX(s.salaryName) FROM Salary s)",
                    Account.class);

            accounts = query.getResultList();

            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        }

        return accounts;
    }
}
