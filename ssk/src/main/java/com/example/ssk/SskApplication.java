package com.example.ssk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SskApplication extends SpringBootServletInitializer {
	
	//@RequestMapping("/")
	public static void main(String[] args) {
		SpringApplication.run(SskApplication.class, args);
		//welcome w = new welcome();
		//w.welc();
		System.out.println("Enter your date of birth:");
	}
@Override
protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	return builder;
}
}
