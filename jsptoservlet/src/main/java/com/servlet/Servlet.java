package com.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employeedao.EmployeeDao;
import com.employeedao.UtilDb;
import com.javabean.Employee;
import com.mysql.cj.util.Util;

/**
 * Servlet class for add, edit and update method  
 * 
 * @author DASHRATH
 * @version 1.0.0
 * @since
 */

@WebServlet("/")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID=1L; 
	private static EmployeeDao employeeDao;
	private String firstName;
	private String contactNo;

	public void Employee() {
	}
	
	public void init() {
		 employeeDao = new EmployeeDao();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		try {
			switch (action) {
			case "/new":
				showNewForm(request, response);
				break;
			case "/insert":
				insertEmployee(request, response);
				break;
			case "/delete":
				deleteEmployee(request, response);
				break;
			case "/edit":
				showEditForm(request, response);
				break;
			case "/update":
				updateEmployee(request, response);
				break;
			default:
				listEmployee(request, response);
				break;
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}

	private static void listEmployee(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {
		List<Employee> listEmployee = EmployeeDao.selectAllEmployees();
		request.setAttribute("listemployee", listEmployee);
		RequestDispatcher dispatchar = request.getRequestDispatcher("EmployeeTable.jsp");
		dispatchar.forward(request, response);
	}

	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatchar = request.getRequestDispatcher("Home.jsp");
		request.setAttribute("redirection","insert"); 
		dispatchar.forward(request, response);
	}

	private static void showEditForm(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		Employee existingEmployee = EmployeeDao.selectEmployee(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("Home.jsp");
		request.setAttribute("employee", existingEmployee);
		request.setAttribute("redirection","update"); 
		dispatcher.forward(request, response);
	}

	private static void insertEmployee(HttpServletRequest request, HttpServletResponse response)
			throws IOException, SQLException {
		String firstName = request.getParameter("first_name");
		String lastName = request.getParameter("last_name");
		String userName = request.getParameter("user_name");
		String address = request.getParameter("address");
		String contactNo = request.getParameter("contact_no");
		Employee newEmployee = new Employee(firstName, lastName, userName, address, contactNo);
		EmployeeDao.insertEmployee(newEmployee);
		response.sendRedirect("list");
	}

	private static void updateEmployee(HttpServletRequest request, HttpServletResponse response)
			throws IOException, SQLException {
		int id = Integer.parseInt(request.getParameter("id"));
		String firstName = request.getParameter("first_name");
		String lastName = request.getParameter("last_name");
		String userName = request.getParameter("user_name");
		String address = request.getParameter("address");
		String contactNo = request.getParameter("contact_no");
		Employee updateEmp = new Employee(id, firstName, lastName, userName, address, contactNo);
		EmployeeDao.updateEmployee(updateEmp);
		response.sendRedirect("list");
	}

	private static void deleteEmployee(HttpServletRequest request, HttpServletResponse response)
			throws IOException, SQLException {
		int id = Integer.parseInt(request.getParameter("id"));
		EmployeeDao.deleteEmployee(id);
		response.sendRedirect("list");
	}

}