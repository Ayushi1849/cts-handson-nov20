package com.example.Microservice1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/m1")
public class MicroService1Controller {

	@Autowired
	private MicroService1Service service;

	@GetMapping
	public String methodApi() {
		return service.method1();
	}
}
