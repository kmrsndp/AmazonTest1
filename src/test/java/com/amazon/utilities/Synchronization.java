package com.amazon.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {

	WebDriver driver;
	int waitTime = 0;
	WebDriverWait wait;
	
	public void implicitlyWait(int waitTime ) {
		driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
	}
	
	public void explicitlyWait(WebDriver driver, int waitTime, By element) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	}

}
