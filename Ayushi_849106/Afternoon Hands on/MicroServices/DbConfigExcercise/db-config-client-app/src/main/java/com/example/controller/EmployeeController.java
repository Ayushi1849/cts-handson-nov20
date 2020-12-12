package com.example.controller;

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

import com.example.model.Employee;
import com.example.service.EmployeeService;


@RestController
@RequestMapping("employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;
	
	@PostMapping
	public Employee addNewEmployee(@RequestBody Employee emp) {
		return empService.addEmployee(emp);
	}
	
	@GetMapping
	public List<Employee> displayAllEmployee(){
		return empService.fetchAllEmployees();
	}
	
	@GetMapping("{id}")
	public Employee displayEmployeeById(@PathVariable("id") int id) {
		return empService.fetchEmployeeById(id);
	}
	
	@PutMapping("{id}/{salary}")
	public Employee updateSalary(@PathVariable("id")int id,@PathVariable("salary")double salary) {
		return empService.updateEmployee(id, salary);
	}
	
	@DeleteMapping("{id}")
	public List<Employee> deleteById(@PathVariable("id")int id){
		return empService.deleteEmployee(id);
	}
}

