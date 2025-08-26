package com.vti.backend;

import java.sql.*;

public class Exercise4 {
    public void Question1() throws Exception {
        Connection connection = getConnection();
        int departmentId = 11;
        connection.setAutoCommit(false);
        try {
            deleteEmployee(connection, departmentId);
            deleteDepartmentUsingProcedure(connection, departmentId);
            connection.commit();
        } catch (Exception e) {
            e.printStackTrace();
            connection.rollback();
            System.out.println(e.getMessage());
        }
        connection.setAutoCommit(true);
        connection.close();
    }
    private static Connection getConnection() throws Exception{
        try {
            String url = "jdbc:mysql://localhost:3306/testingsystem";
            String userName = "root";
            String password = "root";
            java.sql.Connection connection = DriverManager.getConnection(url, userName, password);
            System.out.println("Connect success!");
            return connection;
        } catch (SQLException exception) {
            throw new SQLException("Connect fail!");
        } catch (Exception e) {
            throw new Exception("Connect fail!");
        }
    }
    private static void deleteEmployee(Connection connection, int departmentId) throws SQLException {
        PreparedStatement preparedStatement = connection.
                prepareStatement("delete from account where DepartmentID = ?");
        preparedStatement.setInt(1, departmentId);
        preparedStatement.executeUpdate();
        System.out.println("delete employee succesfully!...");
    }
    public static void deleteDepartmentUsingProcedure(Connection connection, int id) throws Exception {
        validateDepartmentId(id);
        String sql = "{Call sp_delete_department(?)}";
        CallableStatement callableStatement = connection.prepareCall(sql);
        callableStatement.setInt(1, id);
        callableStatement.executeUpdate();
        System.out.println("delete department successfully!...");
    }
    private static void validateDepartmentId(int id) throws Exception {
        if (!isExitsDepartment(id)) {
            throw new Exception("Can not find Department which has id: " + id);
        }
    }
    private static boolean isExitsDepartment(int id) throws Exception {
        java.sql.Connection connection = getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("Select * from Department where DepartmentID = ?");
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        return resultSet.next();
    }
}

