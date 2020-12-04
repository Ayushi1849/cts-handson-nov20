package com.example.paytmserviceapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PaytmServiceAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaytmServiceAppApplication.class, args);
	}

}
