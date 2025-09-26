package org.example.entity;

import jakarta.persistence.*;
import org.example.entity.Enums.SalaryEnum;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "salary")
public class Salary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SalaryID", columnDefinition = "TINYINT UNSIGNED")
    private int id;

    @Column(name = "SalaryName", unique = true, nullable = false)
    //@Enumerated(EnumType.STRING)
    private SalaryEnum salaryName;

    @OneToMany(mappedBy = "salary", fetch = FetchType.LAZY)
    List<Account> accounts;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SalaryEnum getSalaryName() {
        return salaryName;
    }

    public void setSalaryName(SalaryEnum salaryName) {
        this.salaryName = salaryName;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}
