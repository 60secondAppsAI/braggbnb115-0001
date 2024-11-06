package com.braggbnb115.dao;

import java.util.List;

import com.braggbnb115.dao.GenericDAO;
import com.braggbnb115.domain.Image;





public interface ImageDAO extends GenericDAO<Image, Integer> {
  
	List<Image> findAll();
	






}


