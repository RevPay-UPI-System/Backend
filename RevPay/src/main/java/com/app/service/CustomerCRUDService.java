package com.app.service;

import com.app.model.Customer;

public interface CustomerCRUDService {
	Customer addCustomer(Customer customer);
	Customer updateCustomer(Customer customer);
	Customer getCustomerById(int customer_id);
	Customer findByEmail(String emailId);
	
}
