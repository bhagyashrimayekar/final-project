package com.vnsp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vnsp.daointerface.BankDetailsDaoInterface;
import com.vnsp.model.BankDetails;
import com.vnsp.serviceinterface.BankDetailsInterface;

@Service
public class BankDetailsServiceImpl implements BankDetailsInterface{
	
	@Autowired
	private BankDetailsDaoInterface dao;

	@Override
	public BankDetails addDetails(BankDetails bankDetails) {
		return dao.save(bankDetails);
	}

	@Override
	public List<BankDetails> getDetails() {
		List<BankDetails> bdlist=dao.findAll();
		return bdlist;
	}

}
