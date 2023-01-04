package com.vnsp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Address {
	@Id
	private double mobileNo;
	private String cityName;
	@ManyToOne
	private Customer customer;
	

}
