package com.app.service;

import java.util.List;

import com.app.model.*;

public interface TransactionService {
	
	long sendMoney(long senderPhoneNumber,long reciverPhoneNumber,long transactionAmount);
	List<Transaction> getAllTransaction(long phoneNUmber);

}
