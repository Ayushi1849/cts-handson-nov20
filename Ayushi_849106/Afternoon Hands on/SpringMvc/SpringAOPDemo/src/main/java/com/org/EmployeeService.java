package com.org;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	public void store() {
		System.out.println("**** store() inside EmployeeService ****");
	}
	
	public void delete() {
		System.out.println("*** delete() inside EmployeeService ****");
	}
	
	public void getEmployee(int id) {
		System.out.println("*** getEmployee() inside EmployeeService "+id);
	}
	public void getAllEmployee(int id,String name) {
		System.out.println("*** getAllEmployee() inside EmployeeService "+id+" name="+name);
	}
	public void loadedEmployee(int id,double salary) {
		System.out.println("*** loadedEmployee() inside EmployeeService "+id+" salary="+salary);
	}
	public String updateEmployee(int id) {
		System.out.println("*** updateEmployee() inside EmployeeService "+id);
		return "Employeeupdated";
	}
}
