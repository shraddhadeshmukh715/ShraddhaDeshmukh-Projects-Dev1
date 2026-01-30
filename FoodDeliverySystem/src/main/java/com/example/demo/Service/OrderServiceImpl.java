package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Constant.MessageConstant;
import com.example.demo.Entity.Order;
import com.example.demo.Repositary.OrderRepositary;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	OrderRepositary orderRepositary;
	
	@Override
	public String saveOrder(Order order) {
		// TODO Auto-generated method stub
		orderRepositary.save(order);
		return MessageConstant.ORDER_ADDED_IN_DATABASE;
	}

	@Override
	public List<Order> getAllOrder() {
		// TODO Auto-generated method stub
		return orderRepositary.findAll();
	}

	@Override
	public Order getOrderById(int id) {
		// TODO Auto-generated method stub
		return orderRepositary.findById(id).get();
	}

	@Override
	public void deleteAllOrder() {
		// TODO Auto-generated method stub
		orderRepositary.deleteAll();
	}

	@Override
	public void deleteOrderById(int id) {
		// TODO Auto-generated method stub
		orderRepositary.deleteById(id);
	}

}
