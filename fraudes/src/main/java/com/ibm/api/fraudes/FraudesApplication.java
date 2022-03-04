package com.ibm.api.fraudes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class FraudesApplication {

	public static void main(String[] args) {
		SpringApplication.run(FraudesApplication.class, args);
	}

}
