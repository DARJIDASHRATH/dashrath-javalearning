package com.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.customer.service.CustomerService;
import com.customer.model.CustomerModel;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@GetMapping
	public String listCustomers(Model model) {
		List<CustomerModel> list = customerService.getAllCustomers();
		model.addAttribute("customer", list);
		return "customerlist";
	}

	@GetMapping("/new")
	public String createCustomerForm(Model model) {
		CustomerModel customer = new CustomerModel();
		model.addAttribute("customer", customer);
		return "customerpage";
	}

	@PostMapping
	public String saveCustomer(@ModelAttribute("customer") CustomerModel customer) {
		customerService.saveCustomer(customer);
		return "redirect:/customer";
	}

	@GetMapping("/new/{id}")
	public String editCustomerForm(@PathVariable int id, Model model) {
		model.addAttribute("customer", customerService.getCustomerById(id));
		return "customerpage";
	}

	@PostMapping("/{id}")
	public String updateCustomer(@PathVariable int id, @ModelAttribute("customer") CustomerModel customer,
			Model model) {
		CustomerModel existingCustomer = customerService.getCustomerById(id);
		existingCustomer.setId(id);
		existingCustomer.setFirstName(customer.getFirstName());
		existingCustomer.setLastName(customer.getLastName());
		existingCustomer.setDateOfBirth(customer.getDateOfBirth());
		existingCustomer.setMobileNumber(customer.getMobileNumber());
		existingCustomer.setAddress1(customer.getAddress1());
		existingCustomer.setAddress2(customer.getAddress2());
		existingCustomer.setAge(customer.getAge());
		existingCustomer.setGender(customer.getGender());
		existingCustomer.setEmail(customer.getEmail());
		customerService.updateCustomer(existingCustomer);
		return "redirect:/customer";
	}

	@GetMapping("/{id}")
	public String deleteCustomer(@PathVariable int id) {
		customerService.deleteCustomerById(id);
		return "redirect:/customer";
	}

	@GetMapping("/validate-email/{email}")
	public @ResponseBody String checkEmailValidation(@PathVariable String email) {
		return customerService.findByEmail(null, email);
	}

	@GetMapping("/validate-email/{email}/{id}")
	public @ResponseBody String checkEmailValidation(@PathVariable String email, @PathVariable int id) {
		return customerService.findByEmail(id, email);
	}

	@GetMapping("/validate-mobile/{mobileNumber}")
	public @ResponseBody String checkMobileNumberValidation(@PathVariable String mobileNumber) {
		return customerService.findByMobileNumber(null, mobileNumber);
	}

	@GetMapping("/validate-mobile/{mobileNumber}/{id}")
	public @ResponseBody String checkMobileNumberValidation(@PathVariable String mobileNumber, @PathVariable int id) {
		return customerService.findByMobileNumber(id, mobileNumber);
	}

}