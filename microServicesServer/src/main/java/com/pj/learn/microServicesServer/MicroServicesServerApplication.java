package com.pj.learn.microServicesServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroServicesServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicesServerApplication.class, args);
	}

}
