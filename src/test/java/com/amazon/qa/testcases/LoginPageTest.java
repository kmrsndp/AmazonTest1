package com.amazon.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.HomePage;
import com.amazon.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;

	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
	}
	
	@Test(priority = 1)
	public void verifyLoginPageTitle() {
		Assert.assertEquals(loginPage.loginPageTitleTest(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}
	
	@Test(priority = 2)
	public void loginTest() {
		homePage = new HomePage();
		homePage.clickSignInBtn();
		homePage = loginPage.login(prop.getProperty("userName"), prop.getProperty("password"));
	}
	

	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
	
}
