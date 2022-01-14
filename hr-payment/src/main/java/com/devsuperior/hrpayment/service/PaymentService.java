package com.devsuperior.hrpayment.service;

import org.springframework.stereotype.Service;

import com.devsuperior.hrpayment.entity.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment(long workerId, int days) {
		return new Payment("BOb", 200.0, days );
	}
}
