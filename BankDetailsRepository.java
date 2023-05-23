package com.project.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.model.BankDetails;

@Repository
public interface BankDetailsRepository extends CrudRepository<BankDetails, Serializable> {

}
