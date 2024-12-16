package edu.cjc.imsapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class ImsappApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImsappApplication.class, args);
	}

}
