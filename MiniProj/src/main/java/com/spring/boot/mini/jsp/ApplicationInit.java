package com.spring.boot.mini.jsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ApplicationInit {
	public static void main(String[] args) {
		SpringApplication.run(ApplicationInit.class);
	}

}