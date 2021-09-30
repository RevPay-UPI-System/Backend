package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Customer;
import com.app.repository.RegRepository;
import com.app.service.CustomerSearchService;


@Service
public class CustomerSearchServiceImpl implements CustomerSearchService{
	
	@Autowired
	private RegRepository repository;
	
	
	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	

	@Override
	public long getBalance(int id) {
		// TODO Auto-generated method stub
		Customer c=new Customer();
		c= repository.findById(id).get();
		return c.getBalance();
	}

	@Override
	public List<Customer> getCustomerByuserName(String userName) {
		// TODO Auto-generated method stub
		return repository.findByuserName(userName);
	}

}
