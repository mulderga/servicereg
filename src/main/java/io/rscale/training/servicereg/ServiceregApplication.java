package io.rscale.training.servicereg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServiceregApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceregApplication.class, args);
	}
}
