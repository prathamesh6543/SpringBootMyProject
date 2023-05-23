package com.sample.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sample.model.PremiumDetails;

@Repository
public interface PremiumDetailsRepository extends CrudRepository<PremiumDetails, Serializable> {

	@Query(value = "select  * from premiumdetails e where policycommencementdate = ?1", nativeQuery = true)
	public PremiumDetails getData(String policycommencementdate);

}
