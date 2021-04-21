package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddKeyBoardToCart {

	WebDriver driver;
	
	public AddKeyBoardToCart(WebDriver driver) {
		this.driver = driver;
	}
	
	By KeyBoard = By.partialLinkText("HP 100 Wired USB Keyboard");
	public void selectKeyBoard() {
		driver.findElement(KeyBoard).click();
	}
	
	By AddKeyBoardToCart = By.xpath("//input[@id='add-to-cart-button']");
	public void clickOnAddKeyBoardToCart() {
		driver.findElement(AddKeyBoardToCart).click();
	}
}
