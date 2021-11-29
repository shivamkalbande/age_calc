package com.example.ssk;
//import java.util.*;
//jimport java.util.Scanner;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AgeCalc {
	
	//System.out.println("(Enter your birth year)");
	//Scanner sc = new Scanner(System.in);
	
	int a = 1995;//sc.nextInt();
	@GetMapping("/AgeCalc")
	public int Calc() {
		return (2021 - a);	
	}

}
