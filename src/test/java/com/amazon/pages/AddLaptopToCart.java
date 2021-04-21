package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddLaptopToCart {

	 WebDriver driver;
    
		public AddLaptopToCart(WebDriver driver) {
			this.driver= driver;
		}
		
	By AddToCart = By.xpath("//input[@id = 'add-to-cart-button']");
	public void clickOnAddToCart() {
		driver.findElement(AddToCart).click();	
	}
	
	By ClosePopOver = By.xpath("//button[@data-action= 'a-popover-close']");
	public void clickOnNoThanks() {
		boolean elmentPresent = driver.findElement(ClosePopOver).isDisplayed();
		if(driver.findElement(ClosePopOver).isDisplayed())
		try {
			WebDriverWait wait = new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.visibilityOfElementLocated(ClosePopOver)).click();	
			}
			catch(NoSuchElementException exception) {
				System.out.println(exception);
			}
	}	
	
	By ProceedToBuy = By.xpath("//span[@id = 'hlb-ptc-btn']");
	public void clickProceedToBuy() {
		driver.findElement(ProceedToBuy).click();
	}
	
}
