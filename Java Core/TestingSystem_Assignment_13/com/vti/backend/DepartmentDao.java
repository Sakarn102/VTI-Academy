package com.vti.backend;

import com.vti.entity.Department;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DepartmentDao {
    private static Connection getConnection() throws Exception {
        try {
            String url = "jdbc:mysql://localhost:3306/testingsystem";
            String userName = "root";
            String password = "root";
            Connection connection = DriverManager.getConnection(url, userName, password);
            System.out.println("Connect success!");
            return connection;
        } catch (SQLException exception) {
            throw new SQLException("Connect fail!");
        } catch (Exception e) {
            throw new Exception("Connect fail!");
        }
    }
    public void getDepartment() throws Exception {
        Connection connection = getConnection();
        System.out.println(connection);

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM DEPARTMENT");

        List<Department> departments = new ArrayList<>();
        while (resultSet.next()) {
            int departmentId = resultSet.getInt(1);
            String departmentName = resultSet.getString(2);

            Department department = new Department(departmentId, departmentName);
            departments.add(department);
        }
        System.out.println(departments);
        connection.close();
    }
    public Department getDepartment5(int id) throws Exception {
        Connection connection = getConnection();
        String sql = "SELECT * FROM Department WHERE DepartmentID = ?";

        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);

        ResultSet rs = statement.executeQuery();

        Department dep = null;
        if (rs.next()) {
            int departmentId = rs.getInt("DepartmentID");
            String departmentName = rs.getString("DepartmentName");
            dep = new Department(departmentId, departmentName);
        }
        connection.close();
        return dep;
    }
    public Department getDepartment_5() throws Exception {
        Connection connection = getConnection();
        String sql = "SELECT * FROM Department WHERE DepartmentID = ?";

        PreparedStatement statement = connection.prepareStatement(sql);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap department id can tim: ");
        int id = scanner.nextInt();
        statement.setInt(1, id);

        ResultSet rs = statement.executeQuery();

        Department dep = null;
        if (rs.next()) {
            int departmentId = rs.getInt("DepartmentID");
            String departmentName = rs.getString("DepartmentName");
            dep = new Department(departmentId, departmentName);
        }
        connection.close();
        return dep;

    }
    public boolean isDepartmentNameExists(String name) throws Exception {
        String sql = "SELECT * FROM Department WHERE DepartmentName = ?";
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, name);

            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        }
        return false;
    }

    public void createDepartment(String name) throws Exception {
        if (isDepartmentNameExists(name)) {
            throw new Exception("Department Name is Exists!..." + name);
        }
        String sql = "INSERT INTO department (DepartmentName) VALUES (?)";
        try (Connection connection = getConnection();
            PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, name);

            int rows = statement.executeUpdate();
            if (rows > 0) {
                System.out.println("Create Department successfully!");
            }
            statement.close();
            connection.close();
        }
    }
    public void updateDepartmentName(int id, String newName) throws Exception {
        String sql = "UPDATE department SET DepartmentName = ? WHERE DepartmentID = ?";
        try
            (Connection connection = getConnection();
            PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, newName);
                statement.setInt(2, id);

                int updateRows = statement.executeUpdate();
                if (updateRows > 0) {
                    System.out.println("Update Department successfully!");
                } else {
                    System.out.println("Department not found!");
                }
        }
    }
    public void deleteDepartment(int id) throws Exception {
        String sql = "DELETE FROM department WHERE DepartmentID = ?";
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);

            int deleteRows = statement.executeUpdate();
            if (deleteRows > 0) {
                System.out.println("Delete Department successfully!");
            } else {
                System.out.println("Department not found!");
            }
        }
    }
}
