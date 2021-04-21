package com.amazon.testclasses;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.amazon.pages.AddKeyBoardToCart;
import com.amazon.pages.AddLaptopToCart;
import com.amazon.pages.AmazonLogIn;
import com.amazon.pages.PaymentAndDelivery;
import com.amazon.pages.ProductSearchAndSelect;
import com.amazon.utilities.CheckUpdatedPrice;
import com.amazon.utilities.ExcelInputOutput;
import com.amazon.utilities.TakeSnapShot;

public class AmazonTestNG {

	WebDriver driver= null;
	ExcelInputOutput excelIO;
	TakeSnapShot snapShot;
	AmazonLogIn amazonLogin;
	ProductSearchAndSelect productSearchAndSelect;
	AddLaptopToCart addLaptopToCart;
	PaymentAndDelivery paymentAndDelivery;
	CheckUpdatedPrice checkPriceUpdate;
	String PriceOfLaptop;
	
  @BeforeTest
  public void beforeTest() throws Exception {
	System.setProperty("webdriver.chrome.driver", "../MavenTest/src/test/java/amazon/com/config/chromedriver.exe");
	driver = new ChromeDriver();
	excelIO = new ExcelInputOutput();
	driver.manage().window().maximize();	
	driver.get(excelIO.getUrl());
  }
  
  @Test(priority = 0)
  public void logInToAmazon() throws Exception {
	excelIO = new ExcelInputOutput();
	amazonLogin = new AmazonLogIn(driver);
	amazonLogin.clickOnSignIn();
	amazonLogin.enterUserName(excelIO.getUserName());
	amazonLogin.clickUserNameSubmit();
	amazonLogin.enterPassword(excelIO.getPassword());
	amazonLogin.clickSignInSubmit();
  }
  
  @Test(priority = 1)
  public void searchProductAndSelect() throws Exception{
	productSearchAndSelect = new ProductSearchAndSelect(driver);
	excelIO = new ExcelInputOutput();
	productSearchAndSelect.searchItem(excelIO.getsearchItemLaptop());
	productSearchAndSelect.clickOnSearchButton();
	productSearchAndSelect.clickOnRamFilter8gb();
	productSearchAndSelect.clickOnHddFilter500gb();
	productSearchAndSelect.clickOnVendorHp();
	Assert.assertEquals(amazonLogin.verifyWelcomeUserName(), "Hello, kumar");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	productSearchAndSelect.clickOnSearchResult();
	ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	driver.switchTo().window(tabs.get(1));
  }
  
  @Test(priority = 2)
  public void addLaptopToCart() {
	addLaptopToCart = new AddLaptopToCart(driver);
	addLaptopToCart.clickOnAddToCart();
	addLaptopToCart.clickOnNoThanks();
	PriceOfLaptop = driver.findElement(By.xpath("//span[@class = 'a-color-price hlb-price a-inline-block a-text-bold'][1]")).getText();
  }
  
  @Test(priority = 3)
  public void addKeyboardToCart() throws Exception {
	productSearchAndSelect = new ProductSearchAndSelect(driver);
	AddKeyBoardToCart addKeyBoard = new AddKeyBoardToCart(driver);
	excelIO = new ExcelInputOutput(); 
	checkPriceUpdate = new CheckUpdatedPrice();
	productSearchAndSelect.searchItem(excelIO.getsearchItemKeyBoard());
	productSearchAndSelect.clickOnSearchButton();
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	addKeyBoard.selectKeyBoard();
	ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	driver.switchTo().window(tabs.get(2));
	addKeyBoard.clickOnAddKeyBoardToCart();
	
	String PriceTotal = driver.findElement(By.xpath("//span[@class = 'a-color-price hlb-price a-inline-block a-text-bold'][1]")).getText();
	addLaptopToCart.clickProceedToBuy();
	boolean isPriceUpdated = checkPriceUpdate.checkUpdatedPrice(PriceOfLaptop, PriceTotal);
	System.out.println("IS Price Updated?  " + isPriceUpdated);
  }
  
  @Test(priority = 4)
  public void payment() {
	paymentAndDelivery = new PaymentAndDelivery(driver);
	paymentAndDelivery.clickDeliveryAddress();
	paymentAndDelivery.clickProceedToPayment();	 
  }
  
  @AfterTest(enabled = true)
  public void afterTest() {
	driver.quit();  
  }

  @AfterMethod
  public void afterMethod() throws Exception {
	  snapShot = new TakeSnapShot();
	  snapShot.takeSnapShot(driver);  
  }
}
