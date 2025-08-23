package com.vti.entity;

import com.vti.backend.DepartmentDao;

import java.sql.Timestamp;

public class Account {
    private int accountId;
    private String email;
    private String userNameAccount;
    private String fullName;
    private Department department;
    private Position position;
    private Timestamp createDate;

    public Account(int accountId, String email,
                   String userNameAccount, String fullName, Department department, Position position, Timestamp createDate) {
        this.accountId = accountId;
        this.email = email;
        this.userNameAccount = userNameAccount;
        this.fullName = fullName;
        this.department = department;
        this.position = position;
        this.createDate = createDate;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserNameAccount() {
        return userNameAccount;
    }

    public void setUserNameAccount(String userNameAccount) {
        this.userNameAccount = userNameAccount;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public Account() {

    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", email='" + email + '\'' +
                ", userNameAccount='" + userNameAccount + '\'' +
                ", fullName='" + fullName + '\'' +
                ", department=" + department +
                ", position=" + position +
                ", createDate=" + createDate +
                '}';
    }
}
