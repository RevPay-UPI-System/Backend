package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.BankDetails;
import com.app.service.BankDetailsService;

@RestController
@CrossOrigin
public class BankController{
	
	
	@Autowired
	private BankDetailsService service;

	@PostMapping("/bankdetails")
	public BankDetails addBankCustomer(@RequestBody BankDetails bankDetails) {
		// TODO Auto-generated method stub
		return service.addBankCustomer(bankDetails);
	}
	

}
