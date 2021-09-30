package com.app.service.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Transaction;
import com.app.model.Wallet;
import com.app.repository.TransactionRepository;
import com.app.repository.WalletRepository;
import com.app.service.TransactionService;

@Service
public class TransactionServiceImpl implements TransactionService{
	
	@Autowired
	private TransactionRepository transactionRepository;
	@Autowired
	private WalletRepository walletRepository;

	@Override
	public long sendMoney(long senderPhoneNumber, long reciverPhoneNumber, long transactionAmount) {
		// TODO Auto-generated method stub
		
		Wallet wallet=new Wallet();
		Transaction transaction=new Transaction();
		transaction.setSenderPhoneNumber(senderPhoneNumber);
		 DateFormat date_format_obj = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
	        Date date_obj = new Date();
	        String f="";
	        f=date_format_obj.format(date_obj);
	        transaction.setTranscationDate(f);
	        transaction.setTransactionAmount(transactionAmount);
	        transaction.setTransactionStatus("SUCCESSFULLY");
	        transactionRepository.save(transaction);
		wallet=walletRepository.findById(reciverPhoneNumber).get();
		
		long amount=wallet.getWalletAmount() + transactionAmount;
		wallet.setWalletAmount(amount);
		walletRepository.save(wallet);
		wallet=walletRepository.findById(senderPhoneNumber).get();
		amount=wallet.getWalletAmount() - transactionAmount;
		wallet.setWalletAmount(amount);
		walletRepository.save(wallet);
		
		return wallet.getWalletAmount();
		
	}

	@Override
	public List<Transaction> getAllTransaction(long phoneNumber) {
		// TODO Auto-generated method stub
		List<Transaction> transactionList=new ArrayList<Transaction>();
		transactionList.addAll(transactionRepository.findBySenderPhoneNumber(phoneNumber));
		transactionList.addAll(transactionRepository.findByReciverPhoneNumber(phoneNumber));
		return transactionList;
	}

}
