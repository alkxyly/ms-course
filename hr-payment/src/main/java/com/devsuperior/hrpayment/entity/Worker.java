package com.devsuperior.hrpayment.entity;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode.Include;

@Data
public class Worker implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Include
	private Long id;
	private String name;
	private Double dailyIncome;
}
