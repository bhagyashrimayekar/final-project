package com.vnsp.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Setter
@Getter
@Data
@NoArgsConstructor
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long customerId;
	private String accountType;
	private String branchName;
	private String firstName;
	private String lastName;
	private String middleName;
	private double depositAmount;
	private long adharNo;
	private long panNo;
	private long mobileNo;
	private String emailId;
	private long accountNo;
	private long debitcardNo;
	@OneToMany(cascade=CascadeType.ALL)
	private List<Address> address;
	
	

}
