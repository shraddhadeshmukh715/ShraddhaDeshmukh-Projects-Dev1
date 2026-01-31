package com.example.demo.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entities.Payment;

public interface PaymentRepositary extends JpaRepository<Payment, Integer>{

}
