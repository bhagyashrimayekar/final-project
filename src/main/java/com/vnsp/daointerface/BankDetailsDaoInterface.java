package com.vnsp.daointerface;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vnsp.model.BankDetails;

public interface BankDetailsDaoInterface extends JpaRepository<BankDetails, String> {

}
