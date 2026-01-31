
package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entities.Payment;

public interface PaymentService {

	String savePayment(Payment payment);
	
	Payment getPaymentById(int id);
	
	List<Payment> getAllPayment();
	
	void deletePaymentById(int id);
	
	void deleteAllPayment();
}
