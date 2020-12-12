package com.example.dbconfigclientapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DbConfigClientAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbConfigClientAppApplication.class, args);
	}

}
