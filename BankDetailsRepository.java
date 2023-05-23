package com.project.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.model.BankDetails;

@Repository
public interface BankDetailsRepository extends JpaRepository<BankDetails, Integer>{ 

	public BankDetails finBankDetails (Integer id);

}
