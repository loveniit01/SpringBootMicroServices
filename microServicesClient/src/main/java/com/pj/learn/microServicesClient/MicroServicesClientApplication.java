package com.pj.learn.microServicesClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroServicesClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicesClientApplication.class, args);
	}

}
