package com.IoC.and.DependencyInjection.IoCAndDI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
@SpringBootApplication(
		// This parameter tells Spring Boot the packages where it should look for components
		scanBasePackages = {
				"com.IoC.and.DependencyInjection.testingComponentScanErrors",
				"com.IoC.and.DependencyInjection.IoCAndDI"
		})
*/
@SpringBootApplication
public class IoCAndDiApplication {

	public static void main(String[] args) {
		// SpringApplication which has been import in the first import statement bootstraps our SpringBoot app
		SpringApplication.run(IoCAndDiApplication.class, args);
	}

	// What happens behind the scenes is that Spring Boot does the following :
	// 		1. creates context and registers all beans
	// 		2. Starts the embedded server which is Tomcat by default

}
