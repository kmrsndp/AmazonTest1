package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.amazon.utilities.ExcelInputOutput;

public class AmazonLogIn {
	
	ExcelInputOutput excelIO = new ExcelInputOutput();

	 WebDriver driver;
     
		public AmazonLogIn(WebDriver driver) {
			this.driver= driver;
		}
		
		By SignIn = By.linkText("Sign in");
		public void clickOnSignIn() {
			driver.findElement(SignIn).click();
		}
		
		By UserName = By.xpath("//input[@id = 'ap_email']");	
		public void enterUserName(String userName) {
			driver.findElement(UserName).sendKeys(userName);
		}
		
		By UserNameSubmit = By.xpath("//input[@id = 'continue']");
		public void clickUserNameSubmit() {
			driver.findElement(UserNameSubmit).click();
		}
		
		By Password = By.xpath("//input[@id = 'ap_password']");	
		public void enterPassword(String password) {
			driver.findElement(Password).sendKeys(password);
		}
		
		By SignInSubmit = By.xpath("//input[@id = 'signInSubmit']");
		public void clickSignInSubmit() {
			driver.findElement(SignInSubmit).click();
		}	
		
		By WelcomeUserName = By.xpath("//span[@id = 'nav-link-accountList-nav-line-1']");
		public String verifyWelcomeUserName() {
			String ActualText = driver.findElement(WelcomeUserName).getText();
			return ActualText;
		}
	
}
