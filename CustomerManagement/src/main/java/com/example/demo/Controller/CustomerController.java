package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Customer;
import com.example.demo.Service.CustomerService;

@RestController
@RequestMapping("customer")
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@PostMapping("/add")
	public String addCustomer(@RequestBody Customer customer)
	{
		customerService.saveCusomer(customer);
		return"Customer added in DB";
	}
	
	@DeleteMapping("/{id}")
	public String deleteCustomer(@PathVariable int id)
	{
		customerService.deleteCustomer(id);
		return "Customer Deleted";
	}
	
	@GetMapping("/{id}")
	public Customer getCustomer(@PathVariable int id) {
		Customer customer = customerService.getCustomer(id);
	    return customer;
	}

}
