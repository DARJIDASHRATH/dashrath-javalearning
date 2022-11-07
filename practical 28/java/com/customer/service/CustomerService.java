package com.customer.service;

import java.util.List;

import com.customer.model.CustomerModel;

public interface CustomerService {

	List<CustomerModel> getAllCustomers();

	String saveCustomer(CustomerModel customer);

	CustomerModel getCustomerById(int id);

	String updateCustomer(CustomerModel customer);

	void deleteCustomerById(int id);

}