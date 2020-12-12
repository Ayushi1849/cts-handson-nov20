package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.DbJpaRepository;
import com.example.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	private DbJpaRepository dbDao;

	public Employee addEmployee(Employee emp) {
		Employee newEmployee = dbDao.save(emp);
		return newEmployee;
	}
	public List<Employee> fetchAllEmployees(){
		return dbDao.findAll();
	}
	public Employee fetchEmployeeById(int id) {
		Optional<Employee> option = dbDao.findById(id);
		if(option.isPresent()) 
			return option.get();
		else 
			return null;
	}
	public Employee updateEmployee(int id, double salary) {
		Employee emp=fetchEmployeeById(id);
		emp.setSalary(salary);
		emp = dbDao.save(emp); 
		return emp;
	}
	
	public List<Employee> deleteEmployee(int id) {
		dbDao.deleteById(id);
		return dbDao.findAll();
	}
}
