package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.BankDetails;
import com.app.repository.BankRepository;
import com.app.service.BankDetailsService;

@Service
public class BankDetailsServiceImpl implements BankDetailsService{

	@Autowired
	private BankRepository repository;
	
	@Override
	public BankDetails addBankCustomer(BankDetails bankDetails) {
		// TODO Auto-generated method stub
		return repository.save(bankDetails);
	}

}
