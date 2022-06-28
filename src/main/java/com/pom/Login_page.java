package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {

	public static WebDriver driver;

	@FindBy(id = "email")
	private WebElement username;

	@FindBy(id = "passwd")
	private WebElement password;

	@FindBy(id = "SubmitLogin")
	private WebElement submitbtn;

	public Login_page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);	
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmitbtn() {
		return submitbtn;
	}

}
