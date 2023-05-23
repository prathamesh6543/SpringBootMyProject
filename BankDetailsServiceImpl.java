package com.project.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.model.BankDetails;
import com.project.repository.BankDetailsRepository;

@Service
public class BankDetailsServiceImpl implements BankDetailsService {
	// inject repository here

	private static final Logger logger = LoggerFactory.getLogger(BankDetailsServiceImpl.class);
	@Autowired
	private BankDetailsRepository bankDetailsRepository;

	@Override
	public BankDetails getBankDetails(Integer id) {
		BankDetails details = bankDetailsRepository.finBankDetails(id);
		logger.info("Into service impl");
		return details;
	}

}
