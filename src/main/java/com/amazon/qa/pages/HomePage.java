package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class HomePage extends TestBase{

	@FindBy(linkText = "Sign in")
	WebElement signInBtn;
	
	
	

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public LoginPage clickSignInBtn() {
		signInBtn.click();
		return new LoginPage();
	}
	
}
