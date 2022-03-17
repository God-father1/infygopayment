package com.infygo.payment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infygo.payment.entity.CreditCardDetails;



public interface CreditCardRepository extends JpaRepository<CreditCardDetails, String> {

}
