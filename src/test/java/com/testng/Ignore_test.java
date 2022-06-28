package com.testng;

import org.testng.annotations.Test;

public class Ignore_test {

	@Test
	private void women() {
		System.out.println("women");
	}

	@Test
	private void tshirt() {
		System.out.println("tshirt");
	}
    
	@Test(enabled=false)
	private void men() {
		System.out.println("men");
	}

	@Test
	private void dresses() {
		System.out.println("dresses");
	}
}
