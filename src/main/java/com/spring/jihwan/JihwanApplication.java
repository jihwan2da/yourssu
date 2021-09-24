package com.spring.jihwan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class JihwanApplication {


	public static void main(String[] args) {
		SpringApplication.run(JihwanApplication.class, args);
	}

}
