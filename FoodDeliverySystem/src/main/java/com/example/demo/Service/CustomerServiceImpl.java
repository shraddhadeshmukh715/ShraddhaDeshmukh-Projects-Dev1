package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.Constant.MessageConstant;
import com.example.demo.Entity.Customer;
import com.example.demo.Repositary.CustomerRepositary;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerRepositary customerRepositary;
	
	@Override
	public String saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerRepositary.save(customer);
		return MessageConstant.CUSTOMER_ADDED_IN_DATABASE;
	}

	@Override
	public Customer getCustomerById(int id) {
		// TODO Auto-generated method stub
		return customerRepositary.findById(id).get();
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return customerRepositary.findAll();
	}

	@Override
	public void deleteCustomerById(@PathVariable int id) 
	{
		// TODO Auto-generated method stub
		customerRepositary.deleteById(id);
	}

	@Override
	public void deleteAllCustomer() {
		// TODO Auto-generated method stub
		
	}

}