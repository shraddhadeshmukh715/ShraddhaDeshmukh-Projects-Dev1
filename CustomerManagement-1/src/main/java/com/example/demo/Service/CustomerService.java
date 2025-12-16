package com.example.demo.Service;

import com.example.demo.Entity.Customer;

public interface CustomerService {

	void saveCustomer(Customer customer);
	
	void deleteCustomer(int id);
	
	Customer  getCustomer(int id);
}
