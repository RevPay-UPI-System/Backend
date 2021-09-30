package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.BankDetails;
import com.app.repository.BankRepository;
import com.app.service.BankSearchService;

@Service
public class BankSearchServiceImpl implements BankSearchService{

	@Autowired
	private BankRepository repository;
	
	
	@Override
	public List<BankDetails> getAllBankDetails() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
