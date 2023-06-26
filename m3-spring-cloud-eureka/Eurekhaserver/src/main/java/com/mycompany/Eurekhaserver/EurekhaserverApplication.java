package com.mycompany.Eurekhaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekhaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekhaserverApplication.class, args);
	}

}
