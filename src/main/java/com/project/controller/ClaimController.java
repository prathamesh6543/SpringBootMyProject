package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.Claim;
import com.project.service.ClaimService;

@RestController
public class ClaimController {
	@Autowired
 private ClaimService claimService;

	@PostMapping("/saveClaimData")
 public ResponseEntity<Claim> saveClaim(@RequestBody Claim claim){
		Claim clm=claimService.saveClaim(claim);
	return ResponseEntity.ok().body(clm);

}
}