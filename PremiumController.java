package com.Premium.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.project.Service.PremiumService;
@RestController
public class PremiumController {
	@Autowired
	private PremiumService premiumservice;
	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable("id")Integer id) {
	premiumservice.deleteById(id);

	}
}
