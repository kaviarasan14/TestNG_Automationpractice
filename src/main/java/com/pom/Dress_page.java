package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dress_page {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "(//a[@title='Dresses'])[2]")
	private WebElement dresstab;

	@FindBy(xpath = "(//a[text()='Evening Dresses'])[2]")
	private WebElement Evngdress;
	
	@FindBy(id = "color_43")
	private WebElement dresscolour;

	public WebElement getDresscolour() {
		return dresscolour;
	}

	public Dress_page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getDresstab() {
		return dresstab;
	}

	public WebElement getEvngdress() {
		return Evngdress;
	}
	
}
