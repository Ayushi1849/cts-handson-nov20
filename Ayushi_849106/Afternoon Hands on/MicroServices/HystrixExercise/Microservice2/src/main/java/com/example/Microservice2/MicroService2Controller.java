package com.example.Microservice2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/m2")
public class MicroService2Controller {

	@Autowired
	private MicroService2Service service;
	
	@GetMapping
	public String method2() {
		return service.greets();
	}
}
