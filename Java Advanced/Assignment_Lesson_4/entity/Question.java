package org.example.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "question")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "QuestionID")
    private int id;

    @Column(name = "Content", length = 100, nullable = false)
    private String content;

    @ManyToOne
    @JoinColumn(name = "CategoryID", nullable = false)
    private CategoryQuestion category;

    @ManyToOne
    @JoinColumn(name = "TypeID", nullable = false)
    private TypeQuestion type;

    @OneToOne
    @JoinColumn(name = "CreatorID", nullable = false, unique = true, updatable = false)
    private Account creator;

    @Column(name = "CreateDate", updatable = false)
    private LocalDateTime createDate = LocalDateTime.now();

    @OneToMany(mappedBy = "question")
    List<ExamQuestion> examQuestions;

    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL)
    List<Answer> answers;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public CategoryQuestion getCategory() {
        return category;
    }

    public void setCategory(CategoryQuestion category) {
        this.category = category;
    }

    public TypeQuestion getType() {
        return type;
    }

    public void setType(TypeQuestion type) {
        this.type = type;
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

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }
}
