package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Quantitty_page {
	
	public static WebDriver driver;

	@FindBy(id = "quantity_wanted")
	private WebElement quantity;
	
	@FindBy(xpath = "//select[@id='group_1']")
	private WebElement size;
	
	@FindBy(xpath = "//button[@name='Submit']")
	private WebElement submitbtn;
	
	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement prcd2Checkout;

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getPrcd2Checkout() {
		return prcd2Checkout;
	}

	public Quantitty_page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getSubmitbtn() {
		return submitbtn;
	}
}
