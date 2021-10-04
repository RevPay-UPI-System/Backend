package com.app.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Wallet;
import com.app.repository.WalletRepository;
import com.app.service.WalletService;

@Service
public class WalletServiceImpl implements WalletService{
	
	@Autowired
	private WalletRepository repository;

	@Override
	public Wallet addWallet(Wallet wallet) {
		// TODO Auto-generated method stub
		return repository.save(wallet);
	}	
	
	@Override
	public Wallet viewWallet(long phoneNumber) {
		
		return repository.findById(phoneNumber).get();
	}

	@Override
	public Wallet updateWallet(long phoneNumber, long amount) {
		// TODO Auto-generated method stub
		Wallet wallet=new Wallet();
		wallet.setWalletPhoneNumber(phoneNumber);
		wallet.setWalletAmount(amount);
		
		return repository.save(wallet);
	}

	

}
