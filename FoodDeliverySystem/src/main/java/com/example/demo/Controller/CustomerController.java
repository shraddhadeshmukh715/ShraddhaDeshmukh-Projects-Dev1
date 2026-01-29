package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Constant.MessageConstant;
import com.example.demo.Entity.Customer;
import com.example.demo.Service.CustomerService;

@RestController
@RequestMapping("customer")
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@PostMapping("/add")
	String addCustomer(@RequestBody Customer customer )
	{
		customerService.saveCustomer(customer);
		return MessageConstant.CUSTOMER_ADDED_IN_DATABASE;
	}
	
	@GetMapping("/get/{id}")
	Customer getById(@PathVariable int id)
	{
		return customerService.getCustomerById(id);
	}
	
	@GetMapping("/get")
	List<Customer> getAll()
	{
		return customerService.getAllCustomer();
	}
	
	@DeleteMapping("/delete/{id}")
	String deleteById(int id)
	{
		customerService.deleteCustomerById(id);
		return  MessageConstant.CUSTOMER_DELETED_FROM_DATABASE;
	}
	
	@DeleteMapping("/delete")
	String deleteAll()
	{
		customerService.deleteAllCustomer();
		return MessageConstant.ALL_CUSTOMERS_DELETED_FROM_DATABASE;
	}
}
