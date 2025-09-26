package org.example.service.BaiTap;

import org.example.entity.Enums.SalaryEnum;
import org.example.entity.Salary;
import org.example.repository.BaiTap.SalaryDepartmentRepo;

import java.math.BigDecimal;
import java.util.List;

public class SalaryDepartmentSer {
    private final SalaryDepartmentRepo salaryDepartmentRepo;
    public SalaryDepartmentSer() {
        this.salaryDepartmentRepo = new SalaryDepartmentRepo();
    }
    public void printSalaryByDepartment(int depId) {
        List<Salary> salaries = salaryDepartmentRepo.getTotalSalaryByDepartment(depId);
        BigDecimal total = BigDecimal.ZERO;
        for (Salary s : salaries) {
            BigDecimal value = s.getSalaryName();
            System.out.println("Salary: " + value);
            total = total.add(value);
        }
        System.out.println("===> Total Salary id  "+ depId + " = " + total);
    }
}
