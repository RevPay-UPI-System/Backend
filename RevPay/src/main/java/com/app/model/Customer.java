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
public class Customer {
	@Id
	@GeneratedValue
	private int id;
	private String firstName;
	private String lastName;
	private String userName;
	private String emailId;
	private String password;
	private Long contact;
	private Long balance;
	

}
