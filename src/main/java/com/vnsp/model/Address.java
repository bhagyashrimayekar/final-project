package com.vnsp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@Data
@NoArgsConstructor
public class Address {
	
	private String landmark;
	private String city;
	private String pincode;
	private String state;
	private String country;
	@Id
	private String mobileNo;
	
	@ManyToOne
	private  Employee employee;
	
	@ManyToOne
	private  Customer customer;
	
	

}
