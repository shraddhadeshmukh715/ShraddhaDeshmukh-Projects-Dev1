package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Customer;
import com.example.demo.Service.CustomerService;
import com.example.demo.Service.CustomerServiceImpl;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerService;

	@PostMapping("add")
	public String addCustomer(@PathVariable Customer customer)
	{
		customerService.saveCustomer(customer);
		return "Customer added in the Database";
	}
	
	@DeleteMapping("/{id}")
	public String deleteCustomer(@PathVariable int id)
	{
		customerService.deleteCustomer(id);
		return "Customer Deleted from the Database";
	}
	
	@GetMapping
	public Customer getCustomer(@PathVariable int id)
	{
		Customer customer = customerService.getCustomer(id);
		return customer;
	}
	
}
