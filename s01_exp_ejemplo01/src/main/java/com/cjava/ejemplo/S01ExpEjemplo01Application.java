package com.cjava.ejemplo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class S01ExpEjemplo01Application {

	public static void main(String[] args) {
		SpringApplication.run(S01ExpEjemplo01Application.class, args);
	}

}
