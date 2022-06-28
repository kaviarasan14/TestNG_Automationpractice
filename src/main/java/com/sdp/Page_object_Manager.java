package com.sdp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pom.Dress_page;
import com.pom.Home_Page;
import com.pom.Login_page;
import com.pom.Quantitty_page;
import com.pom.Summary_page;

public class Page_object_Manager {

	//automation practice
	public static WebDriver driver;

	private Home_Page hp;

	private Login_page lp;

	private Dress_page dp;

	private Quantitty_page qp;

	private Summary_page sp;

	public Home_Page getHp() {
		hp = new Home_Page(driver);
		return hp;
	}

	public Login_page getLp() {
		lp = new Login_page(driver);
		return lp;
	}

	public Dress_page getDp() {
		dp = new Dress_page(driver);
		return dp;
	}

	public Quantitty_page getQp() {
		qp = new Quantitty_page(driver);
		return qp;
	}

	public Summary_page getSp() {
		sp = new Summary_page(driver);
		return sp;
	}

	public Page_object_Manager(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

}
