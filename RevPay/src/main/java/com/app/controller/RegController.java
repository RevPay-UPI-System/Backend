package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Customer;
import com.app.service.CustomerCRUDService;




@RestController
@CrossOrigin
public class RegController {
	
	
	@Autowired
	private CustomerCRUDService service;
	
	@PostMapping("/customer")
	public Customer addCustomer(@RequestBody Customer customer) throws Exception {
		 Customer c=new Customer();
			String email = customer.getEmailId();
			
			  c=service.findByEmail(email);
			
			  if(c!=null) {
		        	throw new Exception("Email exists");
		        }
		         c=null;
		         c=service.addCustomer(customer);
				return c;

	}
	
	@PutMapping("/customer")
	public Customer updateCustomer(@RequestBody Customer customer) {

		return service.updateCustomer(customer);

	}
	@GetMapping("/customer/{id}")
	public Customer getCustomerById(@PathVariable int customer_id) {
		return service.getCustomerById(customer_id);
	}
	
}
