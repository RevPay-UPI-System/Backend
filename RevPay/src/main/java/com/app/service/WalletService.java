package com.app.service;

import com.app.model.Wallet;

public interface WalletService {
	
	Wallet addWallet(Wallet wallet);
	Wallet viewWallet(long phoneNumber);
	Wallet updateWallet(long phoneNumber, long amount);

}
