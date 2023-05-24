package com.sample.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
// @author prathamesh
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.model.PremiumDetails;
import com.sample.service.PremiumDetailsService;

@RestController
public class PremiumDetailsController {

	private static final Logger logger = LoggerFactory.getLogger(PremiumDetailsController.class);
	@Autowired
	private PremiumDetailsService premiumDetailsService;

	@GetMapping("/Get/{Policycommencementdate}")
	public ResponseEntity<PremiumDetails> getData(
			@PathVariable("Policycommencementdate") String Policycommencementdate) {
		logger.info("At PremiumDetails controller");
		PremiumDetails details = premiumDetailsService.getData(Policycommencementdate);
		return ResponseEntity.ok().body(details);

	}

}
