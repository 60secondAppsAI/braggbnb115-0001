package com.braggbnb115.dto;

import java.util.List;
import java.util.Date;
import java.sql.Timestamp;
import java.time.Year;

import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class ReservationDTO {

	private Integer reservationId;

	private Date startDate;

	private Date endDate;

	private Double totalPrice;






}
