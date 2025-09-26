package org.example.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AddressID")
    private int id;

    @Column(name = "AddressName", nullable = false, length = 100, unique = true)
    private String name;

    @OneToMany(mappedBy = "address")
    List<DetailDepartment> departments = new ArrayList<>();

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

    public List<DetailDepartment> getDepartments() {
        return departments;
    }

    public void setDepartments(List<DetailDepartment> departments) {
        this.departments = departments;
    }
}
