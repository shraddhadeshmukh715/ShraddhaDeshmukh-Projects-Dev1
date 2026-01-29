package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Order;

public interface OrderService {

	String saveOrder(Order order);
	
	List<Order> getAllOrder();
	
	Order getOrderById(int id);
	
	void deleteAllOrder();
	
	void deleteOrderById(int id);
}
