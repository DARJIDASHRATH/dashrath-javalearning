package com.customer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.customer.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	List<Customer> findAllByOrderByIdDesc();

	public Customer findByEmail(String email);

	public Customer findByMobileNumber(String mobileNumber);

}