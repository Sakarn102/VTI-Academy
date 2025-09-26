package org.example.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "exam")
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ExamID")
    private int id;

    @Column(name = "Code", length = 10, nullable = false, updatable = false)
    private String code;

    @Column(name = "Title", length = 50, nullable = false)
    private String title;

    @ManyToOne
    @JoinColumn(name = "CategoryID", nullable = false)
    private CategoryQuestion category;

    @Column(name = "Duration", nullable = false)
    private int duration = 45;

    @ManyToOne
    @JoinColumn(name = "CreatorID", nullable = false, updatable = false)
    private Account creator;

    @Column(name = "CreateDate", updatable = false)
    private LocalDateTime createDate = LocalDateTime.now();

    @OneToMany(mappedBy = "exam")
    List<ExamQuestion> examQuestions;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CategoryQuestion getCategory() {
        return category;
    }

    public void setCategory(CategoryQuestion category) {
        this.category = category;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Account getCreator() {
        return creator;
    }

    public void setCreator(Account creator) {
        this.creator = creator;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public List<ExamQuestion> getExamQuestions() {
        return examQuestions;
    }

    public void setExamQuestions(List<ExamQuestion> examQuestions) {
        this.examQuestions = examQuestions;
    }
}
