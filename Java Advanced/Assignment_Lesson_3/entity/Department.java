package org.example.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "department")
public class Department {
    @Id
    @Column(name = "DepartmentID", columnDefinition = "TINYINT UNSIGNED")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "DepartmentName", nullable = false, unique = true, length = 30)
    private String name;

    @OneToOne(mappedBy = "department", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private DetailDepartment detailDepartment;

    @OneToMany(mappedBy = "department", fetch = FetchType.LAZY)
    private List<Account> accounts = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DetailDepartment getDetailDepartment() {
        return detailDepartment;
    }

    public void setDetailDepartment(DetailDepartment detailDepartment) {
        this.detailDepartment = detailDepartment;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}
