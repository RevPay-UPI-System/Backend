package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@Entity
@Table
public class BankDetails {
	private int id;
	@Id
	@GeneratedValue
	private int bankId;
	private String holderName;
	private Long accountNo;
	private Long phonoNo;
	private String bankEmailId;
	private String bankName;
	
	

}
