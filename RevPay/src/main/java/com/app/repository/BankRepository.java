package com.app.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.BankDetails;


@Repository
public interface BankRepository extends JpaRepository<BankDetails,Integer>{

}
