package com.braggbnb115.dao;

import java.util.List;

import com.braggbnb115.dao.GenericDAO;
import com.braggbnb115.domain.Reservation;





public interface ReservationDAO extends GenericDAO<Reservation, Integer> {
  
	List<Reservation> findAll();
	






}


