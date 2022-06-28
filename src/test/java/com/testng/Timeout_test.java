package com.testng;

import org.testng.annotations.Test;

public class Timeout_test {

	@Test(timeOut = 7000)
	private void login() throws InterruptedException {
		
		Thread.sleep(2000);
		
		System.out.println("set property");
		
		System.out.println("browserlaunch");
		
		Thread.sleep(3000);
		
		System.out.println("get url");
		
		System.out.println("siginin");
		
		Thread.sleep(1900); // inside timeout should be less than @test timout condition otherwise
		                   // it throw thread timeout exception
		
		System.out.println("pass credentials");
		
		System.out.println("click login");

	}
}
