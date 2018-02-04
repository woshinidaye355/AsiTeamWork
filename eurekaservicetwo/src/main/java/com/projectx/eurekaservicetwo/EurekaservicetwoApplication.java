package com.projectx.eurekaservicetwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaservicetwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaservicetwoApplication.class, args);
	}
}
