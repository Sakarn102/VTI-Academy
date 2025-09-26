package org.example.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "categoryquestion")
public class CategoryQuestion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CategoryID")
    private int id;

    @Column(name = "CategoryName", length = 50, nullable = false, unique = true)
    private String name;

    @OneToMany(mappedBy = "category")
    List<Question> questions;

    @OneToMany(mappedBy = "category")
    List<Exam> exams;

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

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public List<Exam> getExams() {
        return exams;
    }

    public void setExams(List<Exam> exams) {
        this.exams = exams;
    }
}
