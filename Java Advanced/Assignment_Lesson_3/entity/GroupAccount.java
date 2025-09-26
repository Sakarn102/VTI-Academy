package org.example.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "groupaccount")
public class GroupAccount {
    @EmbeddedId
    private GroupAccountId id;

    @ManyToOne
    @MapsId
    @JoinColumn(name = "GroupID")
    private Group group;

    @ManyToOne
    @MapsId
    @JoinColumn(name = "AccountID")
    private Account account;

    @Column(name = "JoinDate")
    private LocalDateTime joinDate = LocalDateTime.now();

    public GroupAccountId getId() {
        return id;
    }

    public void setId(GroupAccountId id) {
        this.id = id;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public LocalDateTime getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDateTime joinDate) {
        this.joinDate = joinDate;
    }
}
