package com.example.mapStrcutBasic.DTO;

import java.time.LocalDate;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class OrderDTO {

	private String orderAmount;
	private String description;	
	private String orderDate;
	
}
