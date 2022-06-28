package com.testng;

import org.testng.annotations.Test;

public class Priority_test {

	@Test(priority = -1)
	private void browserlaunch() {
		System.out.println("Browser Launch");
	}
	@Test    //by default priority 0 is setted
	private void geturl() {
		System.out.println("geturl");
	}
	@Test(priority = 1)
	private void signin() {
		System.out.println("signin");
	}
	@Test(priority = 2)
	private void signout() {
	 System.out.println("signout");
	}

}
