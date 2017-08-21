package com.allometry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
@ComponentScan(basePackages = "com.allometry.org")
public class CondoralmApplication {

	public static void main(String[] args) {

		SpringApplication.run(CondoralmApplication.class, args);
 
	}
}
