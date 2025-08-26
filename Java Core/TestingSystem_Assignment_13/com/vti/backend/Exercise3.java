package com.vti.backend;

import java.sql.*;
import java.util.Scanner;

public class Exercise3 {
    public void Question3() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter department ID delete: ");
        int departmentId = scanner.nextInt();
        deleteDepartmentUsingProcedure(getConnection(), departmentId);
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
