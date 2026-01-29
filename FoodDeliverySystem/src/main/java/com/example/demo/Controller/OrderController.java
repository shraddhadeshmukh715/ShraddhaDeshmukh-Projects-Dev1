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
import com.example.demo.Entity.Order;
import com.example.demo.Service.OrderService;

@RestController
@RequestMapping("order")
public class OrderController {

	@Autowired
	OrderService orderService;
	
	@PostMapping("/add")
	String saveOrder(@RequestBody Order order)
	{
		 orderService.saveOrder(order);
		 return MessageConstant.ORDER_ADDED_IN_DATABASE;
	}
	
	@GetMapping("/get/{id}")
	Order getById(@PathVariable int id)
	{
		return orderService.getOrderById(id);
	}
	
	@GetMapping("/get")
	List<Order> getAll()
	{
		return orderService.getAllOrder();
	}
	
	@DeleteMapping("/delete/{id}")
	String deleteById(@PathVariable int id)
	{
		orderService.deleteOrderById(id);
		return MessageConstant.ORDER_DELETED_FROM_DATABASE;
	}
	
	@DeleteMapping("/delete")
	String deleteAll()
	{
		orderService.deleteAllOrder();
		return MessageConstant.ALL_ORDERS_DELETED_FROM_DATABASE;
	}
}
