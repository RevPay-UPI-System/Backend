package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.BankDetails;
import com.app.service.BankSearchService;



@RestController
@CrossOrigin
public class BankSearchController{
	
	@Autowired
	private BankSearchService service;

	@GetMapping("/allbankdetails")
	public List<BankDetails> getAllBankDetails() {
		// TODO Auto-generated method stub
		return service.getAllBankDetails();
	}
	
	
}
