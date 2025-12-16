package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Customer;
import com.example.demo.Repositary.CustomerRepositary;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerRepositary customerRepositary;
	
	@Override
	public void saveCusomer(Customer customer) {
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
//		Optional<Customer> optional  = customerRepositary.findById(id);
//	Customer customer = optional.get();
//		return customer;
		
		return customerRepositary.findById(id).get();
	}

}
