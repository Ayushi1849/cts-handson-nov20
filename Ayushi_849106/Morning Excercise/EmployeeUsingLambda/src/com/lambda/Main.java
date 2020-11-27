package com.lambda;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Service s=new Service();
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println(" 1:Add\n 2: Display Id\n 3: Display All\n 4: Sort by id\n 5: Sort by dob\n 6: Sort by salary\n 7: Sort by name\n 8: Exit");
			System.out.println("Enter the input");
			int m=sc.nextInt();
			switch(m)
			{
			case 1:
				Employee e=new Employee();
				System.out.println("Enter Employee id");
				int id=sc.nextInt();
				e.setId(id);
				System.out.println("Enter Employee Name");
				String name=sc.next();
				e.setName(name);
				System.out.println("Enter Employee salary");
				double salary=sc.nextDouble();
				e.setSalary(salary);
				System.out.println("Enter Employee Dob");
				String date=sc.next();
				Date dob;
				try {
					dob = new SimpleDateFormat("dd/MM/yyyy").parse(date);
					e.setDob(dob);
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
				s.add(e);
				System.out.println("New Employee added..");
				break;
			case 2:
				System.out.println("Enter id");
				int id1=sc.nextInt();
				System.out.println("Employee with id "+id1+" is "+ s.findEmployee(id1));
				break;
			case 3:
				s.getEmployee().forEach(e1 -> System.out.println(e1));
				break;
			case 4:
				s.getSortedEmployeesById().forEach(e1 -> System.out.println(e1));
				break;
			case 5:
				s.getSortedEmployeesByDob().forEach(e1 -> System.out.println(e1));
				break;
			case 6:
				s.getSortedEmployeesByName().forEach(e1 -> System.out.println(e1));
				break;
			case 7:
				s.getSortedEmployeesBySalary().forEach(e1 -> System.out.println(e1));
				break;
			case 8:
				System.out.println("Exited.....");
				System.exit(0);
			default: 
				System.out.println("Incorrect options chossen...");
				
			}
			
			
		}while(true);
	}

}
