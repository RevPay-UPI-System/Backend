package com.app.service;

import java.util.List;

import com.app.model.Customer;

public interface CustomerSearchService {

	
	List<Customer> getAllCustomers();
	List<Customer> getCustomerByuserName(String userName);
	long getBalance(int id);
}
