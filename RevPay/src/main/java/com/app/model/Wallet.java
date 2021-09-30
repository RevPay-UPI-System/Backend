package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Entity
@Table
@Component
public class Wallet {
	
	@Id
	private long walletPhoneNumber;
	private long WalletAmount;

}
