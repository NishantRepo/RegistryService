package com.nish;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RegistryServerApplication {

	public static void main(String[] args) {
		System.setProperty("spring.config.name", "registry-server");
		SpringApplication.run(RegistryServerApplication.class, args);
	}

}
