package com.practice_spring_boot.first_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
		// When running the main function Tomcat is initialized and started on port 8080
		// Tomcat is a Java servlet container that hosts Java based apps in the web
		SpringApplication.run(FirstProjectApplication.class, args);
	}
}
