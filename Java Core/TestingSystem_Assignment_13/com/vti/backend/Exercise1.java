package com.vti.backend;

import com.vti.entity.Position;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Exercise1 {
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

    public void Question1() throws Exception {
        getConnection();
    }

    public void Question2() throws Exception {
        Connection connection = getConnection();
        System.out.println(connection);

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM POSITION");

        List<Position> positions = new ArrayList<>();
        while (resultSet.next()) {
            int positionId = resultSet.getInt(1);
            String positionName = resultSet.getString(2);

            Position position = new Position(positionId, positionName);
            positions.add(position);
        }
        System.out.println(positions);
        connection.close();
    }

    //Question 3
    public void Question3() throws Exception {
        addPosition("Test");
    }

    public static int addPosition(String positionName) throws Exception {
        String sql = "INSERT IGNORE INTO position (PositionName) VALUES (?)";
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, positionName);
            return statement.executeUpdate();
        }
    }

    //Question4
    public void Question4() throws Exception {
        System.out.println("Update: " + updatePosition(5, "Dev"));
    }

    public static int updatePosition(int positionId, String newPositionName) throws Exception {
        String sql = "UPDATE POSITION SET PositionName = ? WHERE (PositionID = ?)";
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, newPositionName);
            statement.setInt(2, positionId);

            return statement.executeUpdate();
        }
    }

    //Question5
    public void Question5() throws Exception {
        deletePosition(5);
    }

    public static int deletePosition(int positionId) throws Exception {
        String sql = "DELETE FROM `position` WHERE (PositionID = ?)";
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, positionId);
            return statement.executeUpdate();
            // Trả về số dòng bị xóa (1 nếu thành công, 0 nếu không tìm thấy ID)
        }
    }
}

