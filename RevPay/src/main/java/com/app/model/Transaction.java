package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;



import lombok.Data;

@Data
@Entity
@Table
@Component
public class Transaction {
	
	@Id
	@GeneratedValue
	private int transactionId;
	private long senderPhoneNumber;
	private long reciverPhoneNumber;
	private String transcationDate;
	private long transactionAmount;
	private String transactionStatus;
	

}
