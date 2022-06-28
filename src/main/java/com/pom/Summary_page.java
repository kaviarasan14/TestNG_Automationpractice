package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summary_page {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "//span[text()='Proceed to checkout']")
    private WebElement checkout1;
	
	@FindBy(xpath = "//span[text()='Proceed to checkout']")
	private WebElement checkout2;
	
	@FindBy(id = "cgv")
	private WebElement agreebox;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement checkout3;

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getCheckout1() {
		return checkout1;
	}

	public WebElement getCheckout2() {
		return checkout2;
	}

	public WebElement getAgreebox() {
		return agreebox;
	}

	public WebElement getCheckout3() {
		return checkout3;
	}

	public Summary_page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	
}
