package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductSearchAndSelect {

	 WebDriver driver;
     
		public ProductSearchAndSelect(WebDriver driver) {
			this.driver= driver;
		}
			
	By SearchBar = By.id("twotabsearchtextbox");
	public void searchItem(String SearchItem) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 40);
			wait.until(ExpectedConditions.visibilityOfElementLocated(SearchBar)).sendKeys(SearchItem);	
			}
			catch(NoSuchElementException exception) {
				System.out.println(exception);
			}
	}
	
	By SearchButton = By.xpath("//input[@id = 'nav-search-submit-button']");
	public void clickOnSearchButton() {
		driver.findElement(SearchButton).click();	
	}
	
	By RamFilter8gb = By.xpath("//span[text() = '8 GB']");
	public void clickOnRamFilter8gb() {
		driver.findElement(RamFilter8gb).click();	
	}
	
	By HddFilter500gb = By.xpath("//span[text() = '500 - 999 GB']");
	public void clickOnHddFilter500gb() {
		driver.findElement(HddFilter500gb).click();	
	}
	
	By VendorHp = By.xpath("//span[text() = 'HP']");
	public void clickOnVendorHp() {
		driver.findElement(VendorHp).click();	
	}

	By SearchResult = By.linkText("HP 15 11th Gen Intel Core i5 Processor 15.6-inch FHD Laptop (8GB/512GB SSD/Win 10/MS Offce/Fingerprint Reader/Natural Silver/1.69 Kg), 15s-fq2535TU");
	public void clickOnSearchResult() {
			driver.findElement(SearchResult).click();	
	}
	
}
