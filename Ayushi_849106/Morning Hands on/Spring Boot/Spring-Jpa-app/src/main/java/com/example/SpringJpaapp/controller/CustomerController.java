package com.example.SpringJpaapp.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringJpaapp.Entity.Customer;
import com.example.SpringJpaapp.Service.CustomerService;

@RestController
@RequestMapping("customer")
public class CustomerController {
	
	@Autowired
	private CustomerService custService;
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public Customer add(@RequestBody Customer c) {
		
		Customer customer=custService.addCustomer(c);
		return customer;
	}
	
	@GetMapping
	public List<Customer> getAllCustomer(){
		return custService.fetchAllCustomer();
	}
	
	@GetMapping(value="{customerId}")
	public Customer getCustomerById(@PathVariable("customerId")int id) {
		
		return custService.fetchCustomerById(id);
		
	}
	
	@PutMapping(value="{id}/{name}/{dob}")
	public Customer update(@PathVariable("id")int id, @PathVariable("name")String name, @PathVariable("dob")String dob) {
		
		return custService.updateCustomer(id, name, LocalDate.parse(dob));
	}
	
	@DeleteMapping(value="{id}")
	public List<Customer> delete(@PathVariable("id")int id){
		
		return custService.deleteCustomer(id);
		
	}
}
