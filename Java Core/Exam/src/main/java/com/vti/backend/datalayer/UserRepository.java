package com.vti.backend.datalayer;

import com.vti.entity.Employee;
import com.vti.entity.Manager;
import com.vti.entity.Role;
import com.vti.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserRepository implements IUserRepository{
    private JDBCUtils jdbcUtils;

    public UserRepository() {
        jdbcUtils = new JDBCUtils();
    }

    @Override
    public List<Employee> getEmployeesByProjectId(int projectId) throws Exception {

        List<Employee> employees = new ArrayList<>();
        String sql = "SELECT * FROM user WHERE ProjectId = ?";
        try (Connection connection = jdbcUtils.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)
        ) {
            statement.setInt(1, projectId);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String role = resultSet.getString(8);
                Role rol = Role.valueOf(role.toUpperCase());

                if (Role.EMPLOYEE.equals(rol)) {
                    int userId = resultSet.getInt(1);
                    String fullName = resultSet.getString(2);
                    String email= resultSet.getString(3);
                    String passWord = resultSet.getString(4);
                    int projectID = resultSet.getInt(6);
                    String proSkill = resultSet.getString(7);

                    Employee e = new Employee(userId, fullName, email, passWord, projectID, rol, proSkill);
                    employees.add(e);

                }
            }
        } finally {
            jdbcUtils.disconnect();
        }
        return employees;
    }

    @Override
    public List<Manager> getManager() throws Exception {

        String sql = "SELECT * FROM user WHERE role = 'manager'";
        List<Manager> managers = new ArrayList<>();

        try (Connection conn = jdbcUtils.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                int id = rs.getInt(1);
                String fullName = rs.getString(2);
                String email = rs.getString(3);
                String password = rs.getString(4);
                int projectId = rs.getInt(6);
                int expInYear = rs.getInt(5);

                String role = rs.getString(8);
                Role rol = Role.valueOf(role.toUpperCase());

                Manager m = new Manager(id, fullName, email, password, projectId, rol, expInYear);
                managers.add(m);

            }
        } finally {
            jdbcUtils.disconnect();
        }
        return managers;
    }

    @Override
    public Manager loginManager(String email, String passWord) throws Exception {
        Manager m = null;

        try {

            Connection connection = jdbcUtils.getConnection();
            String sql = "SELECT * FROM user WHERE Email = ? and `Password` = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, email);
            statement.setString(2, passWord);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                int userId = resultSet.getInt(1);
                String fullName = resultSet.getString(2);
                int projectId = resultSet.getInt(6);
                String role = resultSet.getString(8);
                Role rol = Role.valueOf(role.toUpperCase());

                if (rol == Role.MANAGER) {
                    int expInYear = resultSet.getInt(5);
                    m = new Manager(userId, fullName, email, passWord, projectId, rol, expInYear);
                } else {
                    throw new IllegalArgumentException("Ban khong co quyen dang nhap voi vai tro " + rol);
                }
            }
        } finally {
            jdbcUtils.disconnect();
        }
        return m;
    }
}
