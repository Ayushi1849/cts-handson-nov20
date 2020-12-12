package com.example.dbconfigserverapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DbConfigServerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbConfigServerAppApplication.class, args);
	}

}
