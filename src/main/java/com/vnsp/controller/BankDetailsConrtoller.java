package com.vnsp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vnsp.model.BankDetails;
import com.vnsp.serviceinterface.BankDetailsInterface;

@RestController
@RequestMapping("/details")
public class BankDetailsConrtoller {

	@Autowired
	private BankDetailsInterface serv;
	
	@PostMapping("/addData")
	public BankDetails addDetails(@RequestBody BankDetails bankDetails)
	{
		return serv.addDetails(bankDetails);
	}
	
	@GetMapping("/getData")
	public List<BankDetails> getDetails(){
		
		List<BankDetails> bdlist=serv.getDetails();
		return bdlist;
	}
	
}
