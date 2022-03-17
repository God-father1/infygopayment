package com.infygo.payment.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.infygo.payment.repository.CreditCardRepository;

public class PaymentService {

	@Autowired
	CreditCardRepository creditRepository;
	
}
