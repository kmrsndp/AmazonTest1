package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class LoginPage extends TestBase{

	//PageFactory - Object Repository
	
	@FindBy(xpath = "//input[@id = 'ap_email']")
	WebElement userName;
	
	@FindBy(xpath = "//input[@id = 'continue']")
	WebElement userNameSubmit;
	
	@FindBy(xpath = "//input[@id = 'ap_password']")
	WebElement password;
	
	@FindBy(xpath = "//input[@id = 'signInSubmit']")
	WebElement signInSubmit;
	
   //Initializing Page Objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String loginPageTitleTest() {
		return driver.getTitle();
	}
	
	public HomePage login(String Name, String pwd) {
		userName.sendKeys(Name);
		userNameSubmit.click();
		password.sendKeys(pwd);
		signInSubmit.click();
		return new HomePage();
	}
	
	
	
}
