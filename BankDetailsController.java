package com.project.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.BankDetails;
import com.project.service.BankDetailsService;

@RestController
public class BankDetailsController {
	private static final Logger logger = LoggerFactory.getLogger(BankDetailsController.class);

	// inject service here
	@Autowired
	private BankDetailsService bankDetailsService;

	@GetMapping("/fetch/{id}")
	public ResponseEntity<BankDetails> getBranchDetails(@PathVariable("id") Integer id) {
		BankDetails details = bankDetailsService.getBankDetails(id);
		logger.info("In loging service mithod");
		return ResponseEntity.ok().body(details);
	}

}
