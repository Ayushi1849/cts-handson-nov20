package com.example.SpringJpaapp.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringJpaapp.Entity.Customer;
import com.example.SpringJpaapp.dao.CustomerRepository;


@Service
public class CustomerService {

	@Autowired
	private CustomerRepository dbDao;

	public Customer addCustomer(Customer emp) {
		Customer newCustomer = dbDao.save(emp);
		return newCustomer;
	}
	public List<Customer> fetchAllCustomer(){
		return dbDao.findAll();
	}
	public Customer fetchCustomerById(int id) {
		Optional<Customer> option = dbDao.findById(id);
		if(option.isPresent()) 
			return option.get();
		else 
			return null;
	}
	public Customer updateCustomer(int id, String name, LocalDate dob) {
		
		Customer c= fetchCustomerById(id);
		if(c!=null) {
			c.setName(name);
			c.setDob(dob);
			return dbDao.save(c);
		}
		else
			return null;
	}
	
	
	public List<Customer> deleteCustomer(int id) {
		dbDao.deleteById(id);
		return dbDao.findAll();
	}
}
