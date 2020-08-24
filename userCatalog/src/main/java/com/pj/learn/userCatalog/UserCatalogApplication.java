package com.pj.learn.userCatalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UserCatalogApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserCatalogApplication.class, args);
	}

}
