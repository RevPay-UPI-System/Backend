package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.app.model.*;

@Repository
public interface WalletRepository extends JpaRepository<Wallet,Long>{

}
