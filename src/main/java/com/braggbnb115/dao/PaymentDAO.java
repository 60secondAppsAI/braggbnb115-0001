package com.braggbnb115.dao;

import java.util.List;

import com.braggbnb115.dao.GenericDAO;
import com.braggbnb115.domain.Payment;





public interface PaymentDAO extends GenericDAO<Payment, Integer> {
  
	List<Payment> findAll();
	






}


