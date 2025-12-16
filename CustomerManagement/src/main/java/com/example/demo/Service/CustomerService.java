package com.example.demo.Service;

import com.example.demo.Entity.Customer;

public interface CustomerService {

	void saveCusomer(Customer customer);  // add 1,2,3
	
	void deleteCustomer(int id);
	
	Customer getCustomer(int id);
}

