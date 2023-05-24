package com.sample.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.model.PremiumDetails;
import com.sample.repository.PremiumDetailsRepository;

@Service
public class PremiumDetailsServiceImpl implements PremiumDetailsService {

	@Autowired
	private PremiumDetailsRepository premiumDetailsRepository;

	@Override
	public PremiumDetails getData(String policycommencementdate) {
		PremiumDetails details = premiumDetailsRepository.getData(policycommencementdate);
		return details;
	}

}
