package com.braggbnb115.dao;

import java.util.List;

import com.braggbnb115.dao.GenericDAO;
import com.braggbnb115.domain.Amenity;





public interface AmenityDAO extends GenericDAO<Amenity, Integer> {
  
	List<Amenity> findAll();
	






}


