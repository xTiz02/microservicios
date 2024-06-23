package com.cjava.ejemplo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class S05ExpConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(S05ExpConfigServerApplication.class, args);
	}

}
