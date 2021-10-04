package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Transaction;
import com.app.service.TransactionService;

@RestController
public class TransactionController {

	@Autowired
	private TransactionService service;
	
	@PostMapping("/sendMoney")
	public long sendMoney(@RequestBody Transaction transaction) {
		
		long senderPhoneNumber=transaction.getSenderPhoneNumber();
		long reciverPhoneNumber=transaction.getReciverPhoneNumber();
		long transactionAmount=transaction.getTransactionAmount();
		
		return service.sendMoney(senderPhoneNumber, reciverPhoneNumber, transactionAmount);
	}

	@GetMapping("/transaction/{phoneNumber}")
	public List<Transaction> getAllTransaction(@PathVariable long phoneNumber) {
		 
		return service.getAllTransaction(phoneNumber);
	}

}
