package com.example.demo.Service;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Customer;
import com.example.demo.Repositary.CustomerRepositary;

@Service
public class CustomerServiceImpl implements CustomerService{

	CustomerRepositary customerRepositary;
	
	@Override
	public void saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerRepositary.save(customer);
	}

	@Override
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		customerRepositary.deleteById(id);
	}

	@Override
	public Customer getCustomer(int id) {
		// TODO Auto-generated method stub
		return customerRepositary.findById(id).get();
	}

}
