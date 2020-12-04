package com.org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@RequestMapping(value = "/time", method = RequestMethod.GET)
	public ModelAndView viewDateTime() {
		ModelAndView mv = new ModelAndView("hello", "msg", service.fetchDateTimeService());
		return mv;
	}
	
	@RequestMapping(value = "/sortByNameReverse", method = RequestMethod.GET)
	public ModelAndView viewAllEmployeesNameInReverseOrder() {
		ModelAndView mv = new ModelAndView("hello", "msg", service.getAllEmployeesNamesInReverseOrder());
		return mv;
	}
	
	@RequestMapping(value = "/sortBySalaryReverse", method = RequestMethod.GET)
	public ModelAndView viewAllEmployeesSalaryInReverseOrder() {
		ModelAndView mv = new ModelAndView("hello", "msg", service.getAllEmployeesSalaryInReverseOrder());
		return mv;
	}
	
	@RequestMapping(value = "/sortByIdReverse", method = RequestMethod.GET)
	public ModelAndView viewAllEmployeesIdInReverseOrder() {
		ModelAndView mv = new ModelAndView("hello", "msg", service.getAllEmployeesIdInReverseOrder());
		return mv;
	}
	
	@RequestMapping(value = "/sortBySalary", method = RequestMethod.GET)
	public ModelAndView viewAllEmployeesSalary() {
		ModelAndView mv = new ModelAndView("hello", "msg", service.getAllEmployeesSalary());
		return mv;
	}
	
	@RequestMapping(value = "/sortByName", method = RequestMethod.GET)
	public ModelAndView viewAllEmployeesName() {
		ModelAndView mv = new ModelAndView("hello", "msg", service.getAllEmployeesName());
		return mv;
	}
	
	@RequestMapping(value = "/sortById", method = RequestMethod.GET)
	public ModelAndView viewAllEmployeesId() {
		ModelAndView mv = new ModelAndView("hello", "msg", service.getAllEmployeesId());
		return mv;
	}
}

