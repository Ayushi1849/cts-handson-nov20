package com.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Service {

	List<Employee> empList=new ArrayList<Employee>();
	
	public void add(Employee emp)
	{
		empList.add(emp);
	}
	
	public Employee findEmployee(int id) {
		for(Employee e1: empList)
		{
			if(e1.getId()==id)
				return e1;
		}
		return null;
	}
	
	public List<Employee> getEmployee()
	{
		return empList;
	}
	
	public List<Employee> getSortedEmployeesById(){
		Collections.sort(empList,(e1,e2)-> e1.getId()-e2.getId());
		return empList;
	}
	
	public List<Employee> getSortedEmployeesByDob(){
		Collections.sort(empList,(e1,e2)-> e1.getDob().compareTo(e2.getDob()));
		return empList;
	}
	
	public List<Employee> getSortedEmployeesByName(){
		Collections.sort(empList,(e1,e2)-> e1.getName().compareTo(e2.getName()));
		return empList;
	}
	
	public List<Employee> getSortedEmployeesBySalary(){
		Collections.sort(empList,(e1,e2)-> Double.compare(e1.getSalary(), e2.getSalary()));
		return empList;
	}
	
	
}
