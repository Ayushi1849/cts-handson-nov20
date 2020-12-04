package com.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		EmployeeService service = (EmployeeService) context.getBean("employeeService");
		service.delete();
		service.store();
		service.getEmployee(7);
		service.getAllEmployee(5,"ayushi");
		service.loadedEmployee(4, 50000);
		service.updateEmployee(10);
	}

}
