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
import com.example.demo.Entities.Payment;
import com.example.demo.Service.PaymentService;

@RestController
@RequestMapping("payment")
public class PaymentController {

	@Autowired
	PaymentService paymentService;
	
	@PostMapping("/add")
	String addPayment(@RequestBody Payment payment)
	{
		paymentService.savePayment(payment);
		return MessageConstant.PAYMENT_ADDED_IN_DATABASE;
	}
	
	@GetMapping("/get/{id}")
	Payment getById(@PathVariable int id)
	{
		return paymentService.getPaymentById(id);
	}
	
	@GetMapping("/get")
	List<Payment> getAll()
	{
		return paymentService.getAllPayment();
	}
	
	@DeleteMapping("/delete/{id}")
	String deleteById(@PathVariable int id)
	{
		paymentService.deletePaymentById(id);
		return MessageConstant.PAYMENT_DELETED_FROM_DATABASE;
	}
	
	@DeleteMapping("/delete")
	String deleteAll()
	{
		paymentService.deleteAllPayment();
		return MessageConstant.ALL_PAYMENTS_DELETED_FROM_DATABASE;
	}
	
}	
