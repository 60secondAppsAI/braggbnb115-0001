package com.braggbnb115.dao;

import java.util.List;

import com.braggbnb115.dao.GenericDAO;
import com.braggbnb115.domain.Property;





public interface PropertyDAO extends GenericDAO<Property, Integer> {
  
	List<Property> findAll();
	






}


