package com.example.restservicesdemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("customer")
@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerservice;
	
	@PostMapping(consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public Customer createCustomer(@RequestBody Customer customer){
		return customerservice.addCustomer(customer);
	}
	
	@GetMapping
	public List<Customer> getAllCustomer(){
		return customerservice.fetchCustomers();
	}
	
	@GetMapping("{customerId}")
	public Customer getCustomer(@PathVariable("customerId") int id) {
		Customer customer = customerservice.fetchCustomer(id);
		return customer;
	}
	
	@DeleteMapping("{customerId}")
	public List<Customer> deleteCustomer(@PathVariable("customerId") int id){
		return customerservice.delete(id);
	}
	
}
