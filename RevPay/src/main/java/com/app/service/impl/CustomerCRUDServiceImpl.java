package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Customer;
import com.app.repository.RegRepository;
import com.app.service.CustomerCRUDService;

@Service
public class CustomerCRUDServiceImpl implements CustomerCRUDService {

	
	@Autowired
	private RegRepository repository;
	
	
	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return repository.save(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return repository.save(customer);
	}

	@Override
	public Customer getCustomerById(int customer_id) {
		// TODO Auto-generated method stub
		return repository.findById(customer_id).get();
	}

	@Override
	public Customer findByEmail(String emailId) {
		// TODO Auto-generated method stub
		Customer c=new Customer();
		c=repository.findByEmailId(emailId);
		return c;
	}

}
