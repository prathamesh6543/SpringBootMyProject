package com.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.model.Claim;
@Repository
public interface ClaimRepository extends JpaRepository<Claim, Integer> {

}
