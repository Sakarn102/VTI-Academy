package org.example.entity;

import jakarta.persistence.*;
import org.example.entity.Enums.PositionEnum;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "position")
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PositionID", columnDefinition = "TINYINT UNSIGNED")
    private int id;

    @Column(name = "PositionName", nullable = false, unique = true)
    @Enumerated(EnumType.STRING)
    private PositionEnum name;

    @OneToMany(mappedBy = "position", fetch = FetchType.LAZY)
    List<Account> accounts = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PositionEnum getName() {
        return name;
    }

    public void setName(PositionEnum name) {
        this.name = name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}
