package org.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "detaildepartment")
public class DetailDepartment {
    @Id
    @Column(name = "DepartmentID")
    private int deptId;

    @OneToOne
    @MapsId // dung DepartmentID lam khoa phu luon
    @JoinColumn(name = "DepartmentID")
    private Department department;

    @ManyToOne
    @JoinColumn(name = "AddressID")
    private Address address;
    @Column(name = "EmulationPoint")
    private int emulationPoint;

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getEmulationPoint() {
        return emulationPoint;
    }

    public void setEmulationPoint(int emulationPoint) {
        this.emulationPoint = emulationPoint;
    }
}
