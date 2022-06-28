package com.testng;

import org.testng.annotations.Test;

public class Dependency_test {

	@Test(priority = 0)
	private void startcar() {
		System.out.println("Started");
	}

	@Test(priority = 1, dependsOnMethods = { "startcar" })
	private void drivecar() {
		System.out.println("driving");
	}

	@Test(priority = 2, dependsOnMethods = { "drivecar" })
	private void stop() {
		System.out.println("stopped");
	}

	@Test(priority = 3, dependsOnMethods = { "drivecar", "stop" })
	private void park() {
		System.out.println("parked");
	}
}
