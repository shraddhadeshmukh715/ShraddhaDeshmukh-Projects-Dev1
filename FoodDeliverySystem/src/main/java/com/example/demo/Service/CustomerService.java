package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Customer;

public interface CustomerService {

	String saveCustomer(Customer customer);
	
	Customer getCustomerById(int id);
	
	List<Customer> getAllCustomer();
	
	void deleteCustomerById(int id);
	
	void deleteAllCustomer();
}
