package com.javabean;

/**
 * Employee class for set data and get data.
 * 
 * @author DASHRATH
 * @version 1.0.0
 * @since
 */

public class Employee {
	protected int id;
	protected String firstName;
	protected String lastName;
	protected String userName;
	protected String address;
	protected String contactNo;

	public Employee(int id, String firstName, String lastName, String userName, String address, String contactNo) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.address = address;
		this.contactNo = contactNo;
	}

	public Employee(String firstName, String lastName, String userName, String address, String contactNo) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.address = address;
		this.contactNo = contactNo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

}