package com.employeedao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.javabean.Employee;

/**
 * EmployeeDao class for jdbc and mysql connection
 * 
 * @author DASHRATH
 * @version 1.0.0
 * @since
 */

public class EmployeeDao {
    private String jdbcURL = "jdbc:mysql://localhost:3306/employeedb?useSSL = false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "root";
    private static final String INSERT_EMPLOYEE_SQL = "INSERT INTO employee" + "(first_name, last_name, user_name, address, contact_no) VALUES " + "(?,?,?,?,?);";
    private static final String SELECT_EMPLOYEE_BY_ID = "select id, first_name, last_name, user_name, address, contact_no  from employee where id = ?";
    private static final String SELECT_ALL_EMPLOYEES = "select * from employee";
    private static final String DELETE_EMPLOYEE_SQL = "delete from employee where id = ?;";
    private static final String UPDATE_EMPLOYEE_SQL = "update employee set first_name =?, last_name =?, user_name = ?, address = ?, contact_no = ? where id = ?; ";
  
    public EmployeeDao() {}
    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }
    
    public void insertEmployee(Employee employee) throws SQLException {
        System.out.println(INSERT_EMPLOYEE_SQL);
        try (Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(INSERT_EMPLOYEE_SQL)) {
            preparedStatement.setString(1, employee.getFirstName());
            preparedStatement.setString(2, employee.getLastName());
            preparedStatement.setString(3, employee.getUserName());
            preparedStatement.setString(4, employee.getAddress());
            preparedStatement.setString(5, employee.getContactNo());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
    }
    
    public Employee selectEmployee(int id) {
        Employee employee = null;
        try (Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(SELECT_EMPLOYEE_BY_ID);) {
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement);
            ResultSet setResult = preparedStatement.executeQuery();
            while (setResult.next()) {
                String firstName = setResult.getString("first_name");
                String lastName = setResult.getString("last_name");
                String userName = setResult.getString("user_name");
                String address = setResult.getString("address");
                String contactNo = setResult.getString("contact_no");
                employee = new Employee(id, firstName, lastName, userName, address, contactNo);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return employee;
    }
    
    public List < Employee > selectAllEmployees() {
        List < Employee > employee = new ArrayList < > ();
        try (Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_EMPLOYEES);) {
            System.out.println(preparedStatement);
            ResultSet getResult = preparedStatement.executeQuery();
            while (getResult.next()) {
                int id = getResult.getInt("id");
                String firstName = getResult.getString("first_name");
                String lastName = getResult.getString("last_name");
                String userName = getResult.getString("user_name");
                String address = getResult.getString("address");
                String contactNo = getResult.getString("contact_no");
                employee.add(new Employee(id, firstName, lastName, userName, address, contactNo));
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return employee;
    }
    
    public boolean updateEmployee(Employee employee) throws SQLException {
        boolean rowUpdated = false;
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(UPDATE_EMPLOYEE_SQL);) {
            System.out.println(rowUpdated);
            statement.setString(1, employee.getFirstName());
            statement.setString(2, employee.getLastName());
            statement.setString(3, employee.getUserName());
            statement.setString(4, employee.getAddress());
            statement.setString(5, employee.getContactNo());
            statement.setInt(6, employee.getId());
            System.out.println(statement);
            rowUpdated = statement.executeUpdate() > 0;
            System.out.println(rowUpdated);
        } catch (SQLException e) {
            printSQLException(e);
        }
        return rowUpdated;
    }
    
    public boolean deleteEmployee(int id) throws SQLException {
        boolean rowDeleted;
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(DELETE_EMPLOYEE_SQL);) {
            statement.setInt(1, id);
            rowDeleted = statement.executeUpdate() > 0;
        }
        return rowDeleted;
    }
    
    private void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable error = ex.getCause();
                while (error != null) {
                    System.out.println("Cause: " + error);
                    error = error.getCause();
                }
            }
        }
    }
      
}