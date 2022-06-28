package com.testng;

import org.testng.annotations.Test;

public class Excepted_exception {
	
	@Test(expectedExceptions = ArithmeticException.class)
	private void demo() {
		
		int i=10;
		
		System.out.println(i/0);
		
	}

}
