package com.vnsp.daointerface;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vnsp.model.BankDetails;

@Repository
public interface BankDetailsDaoInterface extends JpaRepository<BankDetails, String> {

}
