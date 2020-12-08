package com.example.SpringJpaapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringJpaapp.Entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

}
