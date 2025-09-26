package org.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "`manager`")
public class Manager {
    @Id
    @Column(name = "AccountID")
    private int accountId;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn(name = "AccountID")
    private Account account;

    @Column(name = "ManagementNumberOfYear", nullable = false)
    private int managementNumberOfYear;

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public int getManagementNumberOfYear() {
        return managementNumberOfYear;
    }

    public void setManagementNumberOfYear(int managementNumberOfYear) {
        this.managementNumberOfYear = managementNumberOfYear;
    }
}
