package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.project.service.BankDetailsService;

@RestController
public class BankDetailsController {
	@Autowired
	private BankDetailsService bankDetailsService;

	@DeleteMapping("/delete/{id}")
	void deleteById(@PathVariable("id") Integer id) {
		bankDetailsService.deleteById(id);

	}

}
