package com.microservice.advisor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class AdvisorApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdvisorApplication.class, args);
	}

}
