package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Customer;
import com.app.service.CustomerSearchService;

@RestController
@CrossOrigin
public class CustomerSearchController {
	
	@Autowired
	private CustomerSearchService service;
	
	
	@GetMapping("/customers")
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return service.getAllCustomers();
	}

	
	@GetMapping("/customers/username/{name}")
	public List<Customer> getCustomerByuserName(@PathVariable String name) {
		// TODO Auto-generated method stub
		return service.getCustomerByuserName(name);
	}
	
	@GetMapping("/customers/{id}")
	public long getBalance(@PathVariable int id) {
		// TODO Auto-generated method stub
		return service.getBalance(id);
	}
}
