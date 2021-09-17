package com.metaenlace.citamedica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.metaenlace")
@EnableJpaRepositories(basePackages = "com.metaenlace")
@EntityScan(basePackages = "com.metaenlace")
public class CitaMedicaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CitaMedicaApplication.class, args);
	}

}
