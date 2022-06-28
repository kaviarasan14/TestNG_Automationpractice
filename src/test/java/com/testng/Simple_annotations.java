package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_annotations {

	@BeforeSuite
	private void propertysetup() {
		System.out.println("Set property");
	}

	@BeforeTest
	private void browserlaunch() {
		System.out.println("browser launch");
	}

	@BeforeClass
	private void launchurl() {
		System.out.println("url launch");
	}

	@BeforeMethod
	private void sigin() {
		System.out.println("Sign in");
	}

	@Test
	private void women() {
		System.out.println("women");
	}

	@Test
	private void men() {
		System.out.println("men");
	}

	@AfterMethod
	private void singout() {
		System.out.println("signout");
	}

	@AfterClass
	private void homepage() {
		System.out.println("homepage");
	}

	@AfterTest
	private void close() {
		System.out.println("close");
	}

	@AfterSuite
	private void deletecookies() {
		System.out.println("delete cookies");
	}
}
