package com.runner_class;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.baseclass.Base_Class;
import com.sdp.Page_object_Manager;

public class Runner_Class extends Base_Class {
	
	public static void main(String[] args) throws IOException {
	//@Test
	   //private void tesst() throws IOException {

	
	    getBrowser("chrome");
	    
		implicitwait();  

		get("http://automationpractice.com/");

		Page_object_Manager pom = new Page_object_Manager(driver);

		// Home page
		clickonELement(pom.getHp().getLoginbtn());

		// Login Page
		String email = read_particular_data("C:\\Users\\kavia\\eclipse-workspace\\project\\Excel\\New Microsoft Excel Worksheet.xlsx", 1, 0);
		sendingKeys(pom.getLp().getUsername(), email);
		String password = read_particular_data("C:\\Users\\kavia\\eclipse-workspace\\project\\Excel\\New Microsoft Excel Worksheet.xlsx", 1,1);
		sendingKeys(pom.getLp().getPassword(),password);
		clickonELement(pom.getLp().getSubmitbtn());

		// Dress Page
		actionsMovetoelement(pom.getDp().getDresstab());
		clickonELement(pom.getDp().getEvngdress());
		actionsMovetoelement(pom.getDp().getDresscolour());
		clickonELement(pom.getDp().getDresscolour());

		// Quantity page
		clear(pom.getQp().getQuantity());
		sendingKeys(pom.getQp().getQuantity(),"2");
		dropdown(pom.getQp().getSize(), "byindex", "1");
		clickonELement(pom.getQp().getSubmitbtn());
		clickonELement(pom.getQp().getPrcd2Checkout());

		// Summary page
		clickonELement(pom.getSp().getCheckout1());
		clickonELement(pom.getSp().getCheckout2());
		clickonELement(pom.getSp().getAgreebox());
		clickonELement(pom.getSp().getCheckout3());

//		close();
	}
}

