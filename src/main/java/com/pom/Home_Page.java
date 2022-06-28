package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {

	public static WebDriver driver;

	@FindBy(xpath = "//a[@title='Log in to your customer account']")
	private WebElement Loginbtn;

	public Home_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLoginbtn() {
		return Loginbtn;
	}

}
