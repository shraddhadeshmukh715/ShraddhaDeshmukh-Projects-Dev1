package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Constant.MessageConstant;
import com.example.demo.Entities.Payment;
import com.example.demo.Repositary.PaymentRepositary;
import com.example.demo.Service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService{

	@Autowired
	PaymentRepositary paymentRepositary;
	
	@Override
	public String savePayment(Payment payment) {
		// TODO Auto-generated method stub
		paymentRepositary.save(payment);
		return MessageConstant.PAYMENT_ADDED_IN_DATABASE;
	}

	@Override
	public Payment getPaymentById(int id) {
		// TODO Auto-generated method stub
		return paymentRepositary.findById(id).get();
	}

	@Override
	public List<Payment> getAllPayment() {
		// TODO Auto-generated method stub
		return paymentRepositary.findAll();
	}

	@Override
	public void deletePaymentById(int id) {
		// TODO Auto-generated method stub
		paymentRepositary.deleteById(id);
	}

	@Override
	public void deleteAllPayment() {
		// TODO Auto-generated method stub
		paymentRepositary.deleteAll();
	}

}
