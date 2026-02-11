package com.ttn.spring_core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.ttn.spring_core.SpringBoot")
public class SpringCoreApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringCoreApplication.class, args);

	}

}
