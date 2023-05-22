package com.project.controller;



/*
 *task no 8 Design the resful web service  for Nominee delete  operation  
 * @Author Hitesh.
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.project.service.NomineeService;

@RestController
public class NomineeController  {
	@Autowired
	private NomineeService nomineeService;

	// Design Restful Web services to delete the data based on id

	@DeleteMapping("/delete/{id}")
	public void deleteNomineeById(@PathVariable("id") Integer id) { 	
		// calling the method
		nomineeService.deleteById(id); 
	}

}
