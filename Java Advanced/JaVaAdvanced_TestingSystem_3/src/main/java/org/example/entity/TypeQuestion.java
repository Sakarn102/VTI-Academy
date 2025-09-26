package org.example.entity;

import jakarta.persistence.*;
import org.example.entity.Enums.TypeEnum;

import java.util.List;

@Entity
@Table(name = "typequestion")
public class TypeQuestion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TypeID")
    private int id;

    @Enumerated(EnumType.STRING)
    @Column(name = "TypeName", nullable = false, unique = true)
    private TypeEnum typeName;

    @OneToMany(mappedBy = "type", cascade = CascadeType.ALL)
    List<Question> questions;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TypeEnum getTypeName() {
        return typeName;
    }

    public void setTypeName(TypeEnum typeName) {
        this.typeName = typeName;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
