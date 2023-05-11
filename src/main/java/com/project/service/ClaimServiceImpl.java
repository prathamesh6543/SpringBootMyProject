package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Repository.ClaimRepository;
import com.project.model.Claim;

@Service
public class ClaimServiceImpl implements ClaimService {
   @Autowired
	private ClaimRepository claimrepository;
	
	@Override
	public Claim saveClaim(Claim claim) {
		Claim clm=claimrepository.save(claim);
		return clm;
	}

}
