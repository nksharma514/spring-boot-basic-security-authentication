package com.example.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class SpringBootBasicSecurityAuthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBasicSecurityAuthenticationApplication.class, args);
	}

}
