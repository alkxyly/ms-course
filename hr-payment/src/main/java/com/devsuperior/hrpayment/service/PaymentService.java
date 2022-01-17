package com.devsuperior.hrpayment.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.devsuperior.hrpayment.entity.Payment;
import com.devsuperior.hrpayment.entity.Worker;

@Service
public class PaymentService {
	
	@Value("${hr-worker.host}")
	private String workerHost;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public Payment getPayment(long workerId, int days) {
		var uriVariable = new HashMap<String, String>();
		uriVariable.put("id", String.valueOf(workerId));
		
		Worker worker = restTemplate.getForObject(this.workerHost.concat("/workers/{id}"), Worker.class, uriVariable);
		
		return new Payment(worker.getName(), worker.getDailyIncome(), days );
	}
}
