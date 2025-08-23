package com.vti.backend;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Position;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AccountDAO {
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
    public boolean isAccountExists(String email) throws Exception {
        String sql = "SELECT 1 FROM Account WHERE Email = ? LIMIT 1";
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, email);
            try (ResultSet resultSet = statement.executeQuery()) {
                return resultSet.next();
            }
        }
    }
    public void createAccount(String email, String username, String fullName, int departmentID, int positionID) throws Exception {
        if (isAccountExists(email)) {
            throw new Exception("Email or Username already exists!");
        }

        String sql = "INSERT INTO Account (Email, Username, FullName, DepartmentID, PositionID, CreateDate) "
                + "VALUES (?, ?, ?, ?, ?, NOW())";
        try (Connection connection = getConnection(); PreparedStatement statement = getConnection().prepareStatement(sql)) {
            statement.setString(1, email);
            statement.setString(2, username);
            statement.setString(3, fullName);
            statement.setInt(4, departmentID);
            statement.setInt(5, positionID);

            int rows = statement.executeUpdate();
            if (rows > 0) {
                System.out.println("Create Account successfully!");
            } else {
                System.out.println("Create Account failed!");
            }
        }
    }

    public List<Account> getAccount() throws Exception {
        String sql =
                "SELECT * FROM account a " +
                "LEFT JOIN position p ON a.PositionID = p.PositionID " +
                "LEFT JOIN department d ON a.DepartmentID = d.DepartmentID";
        List<Account> accounts = new ArrayList<>();

        try(Connection connection = getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {

                int accountId = resultSet.getInt(1);
                String email = resultSet.getString(2);
                String userNameAccount = resultSet.getString(3);
                String fullName = resultSet.getString(4);
                Timestamp createDate = resultSet.getTimestamp(7);

                int positionID = resultSet.getInt(8);
                String positionName = resultSet.getString(9);
                Position position = new Position(positionID, positionName);

                int departmentId = resultSet.getInt(10);
                String departmentName = resultSet.getNString(11);
                Department department = new Department(departmentId, departmentName);

                Account account = new Account(accountId, email, userNameAccount, fullName, department, position, createDate);
                accounts.add(account);
            }
        }
        return accounts;
    }

    public void updateAccountEmail(int id, String newEmail) throws Exception {
        String sql = "UPDATE account SET email = ? WHERE AccountID = ?";
        try
                (Connection connection = getConnection();
                 PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, newEmail);
            statement.setInt(2, id);

            int updateRows = statement.executeUpdate();
            if (updateRows > 0) {
                System.out.println("Update Account "+ id + " successfully!");
            } else {
                System.out.println("Account not found id: " + id + " !...");
            }
        }
    }
    public void deleteAccount(int id) throws Exception {
        String sql = "DELETE FROM account WHERE AccountID = ?";
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);

            int deleteRows = statement.executeUpdate();
            if (deleteRows > 0) {
                System.out.println("Delete Account " + id + " successfully! ");
            } else {
                System.out.println("Account not found id: " + id + " !...");
            }
        }
    }
}
