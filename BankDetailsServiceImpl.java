package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.model.BankDetails;
import com.project.repository.BankDetailsRepository;

@Service
public class BankDetailsServiceImpl implements BankDetailsService {
	@Autowired
	private BankDetailsRepository bankDetailsRepository;

	@Override
	public void deleteById(Integer id) {
		bankDetailsRepository.deleteById(id);

	}

}
