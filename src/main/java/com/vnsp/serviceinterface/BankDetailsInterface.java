package com.vnsp.serviceinterface;

import java.util.List;

import com.vnsp.model.BankDetails;

public interface BankDetailsInterface {
	
	public BankDetails addDetails(BankDetails bankDetails);
	public List<BankDetails> getDetails();
	
	

}
