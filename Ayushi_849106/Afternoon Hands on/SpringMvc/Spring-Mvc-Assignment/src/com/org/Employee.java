package com.org;

public class Employee {

	private int ID;
	 private String Name;
	 private double salary;
	 
	public Employee() {
		super();
	}
	public Employee(int iD, String name, double salary) {
		super();
		ID = iD;
		Name = name;
		this.salary = salary;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeDao [ID=" + ID + ", Name=" + Name + ", salary=" + salary + "]";
	}
}
