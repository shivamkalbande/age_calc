package com.example.ssk;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SskApplicationAgeTest {

	
	   @Test
		public void test() {
			AgeCalc test = new AgeCalc();
			int output = test.Calc();
			assertEquals(26, output);
				
	}

}
