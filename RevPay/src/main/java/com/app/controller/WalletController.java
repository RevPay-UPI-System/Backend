package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Wallet;
import com.app.service.WalletService;

@RestController
public class WalletController {

	@Autowired
	private WalletService service;
	
	@PostMapping("/wallet")
	public Wallet addWallet(@RequestBody Wallet wallet) {
		
		return service.addWallet(wallet);
	}

	@GetMapping("/wallet/{phoneNumber}")
	public Wallet viewWallet(@PathVariable long phoneNumber) {
		
		return service.viewWallet(phoneNumber);
	}

	@PutMapping("/wallet")
	public Wallet updateWallet(@RequestBody Wallet wallet) {
		
		long phoneNumber=wallet.getWalletPhoneNumber();
		long amount=wallet.getWalletAmount();
		return service.updateWallet(phoneNumber, amount);
	}

}
