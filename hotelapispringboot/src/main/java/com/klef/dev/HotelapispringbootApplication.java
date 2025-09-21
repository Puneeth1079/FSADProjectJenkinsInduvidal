package com.klef.dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class HotelapispringbootApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(HotelapispringbootApplication.class, args);
		System.out.println("Backend is running Successfully");
	}

}
