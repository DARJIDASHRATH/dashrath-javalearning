package com.customer.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.repository.CustomerRepository;
import com.customer.service.CustomerService;
import com.customer.entity.Customer;
import com.customer.model.CustomerModel;

@Service
public class CustomerServiceImp implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public CustomerModel setCustomerToCustomerModel(Customer customer) {
		return new CustomerModel(customer.getId(), customer.getFirstName(), customer.getLastName(),
				customer.getDateOfBirth(), customer.getMobileNumber(), customer.getAddress1(), customer.getAddress2(),
				customer.getAge(), customer.getGender(), customer.getEmail());
	}

	public Customer setCustomerModelToCustomer(CustomerModel customerModel) {
		return new Customer(customerModel.getId(), customerModel.getFirstName(), customerModel.getLastName(),
				customerModel.getDateOfBirth(), customerModel.getMobileNumber(), customerModel.getAddress1(),
				customerModel.getAddress2(), customerModel.getAge(), customerModel.getGender(),
				customerModel.getEmail());
	}

	@Override
	public List<CustomerModel> getAllCustomers() {
		List<Customer> customer = customerRepository.findAllByOrderByIdDesc();
		List<CustomerModel> customerModels = new ArrayList<>();
		for (Customer customer1 : customer) {
			customerModels.add(setCustomerToCustomerModel(customer1));
		}
		return customerModels;
	}

	@Override
	public String saveCustomer(CustomerModel customer) {
		try {
			customerRepository.save(setCustomerModelToCustomer(customer));
		} catch (Exception e) {
			return "Duplicate successs";
		}
		return "Save successs";
	}

	@Override
	public CustomerModel getCustomerById(int id) {
		return setCustomerToCustomerModel(customerRepository.findById(id).get());
	}

	@Override
	public String updateCustomer(CustomerModel customer) {
		customerRepository.save(setCustomerModelToCustomer(customer));
		return "Update successs";
	}

	@Override
	public void deleteCustomerById(int id) {
		customerRepository.deleteById(id);
	}

}