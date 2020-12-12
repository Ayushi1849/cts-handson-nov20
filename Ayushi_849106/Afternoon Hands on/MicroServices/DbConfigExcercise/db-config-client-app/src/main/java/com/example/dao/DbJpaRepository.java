package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.model.Employee;

public interface DbJpaRepository extends JpaRepository<Employee,Integer> {
	
	

}
