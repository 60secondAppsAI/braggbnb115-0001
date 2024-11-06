package com.braggbnb115.dto;

import java.sql.Timestamp;
import java.time.Year;
import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PropertySearchDTO {

	private Integer page = 0;
	private Integer size;
	private String sortBy;
	private String sortOrder;
	private String searchQuery;

	private Integer propertyId;
	
	private String name;
	
	private String description;
	
	private String address;
	
}
