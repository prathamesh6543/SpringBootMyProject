package com.project.service;
/*
 *task no 8 Design the resful web service  for Nominee delete  operation  
 * @Author Hitesh.
 */



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Repository.NomineeRepository;
import com.project.service.NomineeService;

@Service
public class NomineeServiceImpl implements NomineeService {

	// inject the repository reference
	@Autowired
	private NomineeRepository nomineeRepository;

	@Override
	public void deleteById(Integer id) { 
		nomineeRepository.deleteById(id);
	}

}
