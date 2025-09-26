package org.example.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "`account`")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AccountID")
    private int id;

    @Column(name = "Email", nullable = false, unique = true, updatable = false, length = 50)
    private String email;

    @Column(name = "Username", nullable = false, unique = true, length = 50, updatable = false)
    private String username;

    @Column(name = "FirstName", nullable = false, length = 50)
    private String firstName;

    @Column(name = "LastName", length = 50, nullable = false)
    private String lastName;

    @Transient
    public String getFullName() {
        return firstName + " " + lastName;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DepartmentID", nullable = false)
    private  Department department;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PositionID", nullable = false)
    private Position position;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SalaryID", nullable = false)
    private Salary salary;

    @Column(name = "CreateDate", updatable = false, nullable = false)
    private LocalDateTime createDate;

    @OneToMany(mappedBy = "creator", fetch = FetchType.LAZY)
    List<Group> groups;

    @OneToMany(mappedBy = "creator", fetch = FetchType.LAZY)
    List<Exam> exams;

    @OneToMany(mappedBy = "account", fetch = FetchType.LAZY)
    List<GroupAccount> groupAccounts;

    @OneToMany(mappedBy = "creator", fetch = FetchType.LAZY)
    List<Question> questions;

    @OneToOne(mappedBy = "account", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Manager manager;

    @OneToOne(mappedBy = "creator")
    private Exam exam;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public List<Exam> getExams() {
        return exams;
    }

    public void setExams(List<Exam> exams) {
        this.exams = exams;
    }

    public List<GroupAccount> getGroupAccounts() {
        return groupAccounts;
    }

    public void setGroupAccounts(List<GroupAccount> groupAccounts) {
        this.groupAccounts = groupAccounts;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }
}
