package com.hovs.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BenefitRepository extends JpaRepository<Benefit, Integer> {
	
}
