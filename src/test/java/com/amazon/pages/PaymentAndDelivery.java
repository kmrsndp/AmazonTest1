package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentAndDelivery {

	 WebDriver driver;
     
		public PaymentAndDelivery(WebDriver driver) {
			this.driver= driver;
		}
	
	By DeliveryAddress = By.xpath("//span[@class= 'a-button-inner'][1]");
	public void clickDeliveryAddress() {
		driver.findElement(DeliveryAddress).click();
	}
	
	By ProceedToPayment = By.xpath("//input[@class = 'a-button-text']");
	public void clickProceedToPayment() {
		driver.findElement(ProceedToPayment).click();
	}
}
