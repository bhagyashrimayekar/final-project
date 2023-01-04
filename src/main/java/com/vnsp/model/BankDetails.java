package com.vnsp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@Data
@NoArgsConstructor
public class BankDetails {

	@Id
	private String openTime;
	private String closeTime;
	private String address;
	private String city;
	private String state;
	private long phoneNo;
	private String accountBranch;
	private String ifscCode;
	private String micrCode;
	private String branchCode;
	
	
	
}
