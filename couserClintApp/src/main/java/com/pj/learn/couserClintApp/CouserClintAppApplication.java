package com.pj.learn.couserClintApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CouserClintAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CouserClintAppApplication.class, args);
	}

}
