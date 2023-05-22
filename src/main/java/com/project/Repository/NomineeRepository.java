package com.project.Repository;
/*
 *task no 8 Design the resful web service  for Nominee delete  operation  
 * @Author Hitesh.
 */


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.model.Nominee;

@Repository
public interface NomineeRepository extends  JpaRepository<Nominee, Integer>
{

	
}
	