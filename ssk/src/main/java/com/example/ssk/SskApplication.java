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
		//package testJavaProject;
		//import java.util.*;

		//public class triangle {
		//	public static void main(String [] args) {
	//			int i=0;
	//			for(i=0 ; i<10; i++) {
	//				for(int j=i; j>=0; j--) {

	//					System.out.print("*");
	//				}
	//				System.out.println(+(i+1)+"\n");
	//			}
	//		System.out.println("This is pattern Job running on Master from REMOTR Git Repository ssk232017@gmail.com");
			//}

		//}

	}
@Override
protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	return builder;
}
}
