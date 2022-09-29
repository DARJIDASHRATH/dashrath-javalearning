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

public class UtilDb   {
	private static String jdbcURL = "jdbc:mysql://localhost:3306/employeedb?useSSL = false";
	private static String jdbcUsername = "root";
	private static String jdbcPassword = "root";
	
	public static final String INSERT_EMPLOYEE_SQL = "INSERT INTO employee"
			+ "(first_name, last_name, user_name, address, contact_no) VALUES " + "(?,?,?,?,?);";
	public static final String SELECT_EMPLOYEE_BY_ID = "select id, first_name, last_name, user_name, address, contact_no  from employee where id = ?";
	public static final String SELECT_ALL_EMPLOYEES = "select * from employee";
	public static final String DELETE_EMPLOYEE_SQL = "delete from employee where id = ?;";
	public static final String UPDATE_EMPLOYEE_SQL = "update employee set first_name =?, last_name =?, user_name = ?, address = ?, contact_no = ? where id = ?; ";

	public UtilDb() {
	}

	protected static Connection getConnection() {
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

}