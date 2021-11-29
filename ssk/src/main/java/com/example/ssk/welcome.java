package com.example.ssk;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcome {
	
	@GetMapping("/welcome")
	public String welc() {
		return "Welcome to Eclipse spring maven.";
	}

}
