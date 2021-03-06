package com.app.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.registration.model.User;

public interface RegistrationRepository extends JpaRepository<User,Integer> {

	 public User findByEmailId(String email);
	//public User FindByEmailId(String emailId);

	public User findByEmailIdAndPassword(String email, String password);

}
