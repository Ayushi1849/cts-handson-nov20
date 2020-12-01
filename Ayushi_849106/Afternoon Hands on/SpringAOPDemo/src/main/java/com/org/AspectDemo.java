package com.org;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectDemo {

	@After("execution(public * com.org.EmployeeService.*(..))")
	public void log() {
		System.out.println("----- log method is called ------");
	}
	
	@After("execution(public * com.org.EmployeeService.*(int))")
	public void log2() {
		System.out.println("----- log method is called ------");
	}
	@After("execution(public * com.org.EmployeeService.*(int,*))")
	public void log3() {
		System.out.println("----- log method is called ------");
	}
	@After("execution(public * com.org.EmployeeService.s*(int,String))")
	public void log4() {
		System.out.println("----- log method is called ------");
	}
	@After("execution(public String com.org.EmployeeService.*(..))")
	public void log5() {
		System.out.println("----- log method is called ------");
	}
}
