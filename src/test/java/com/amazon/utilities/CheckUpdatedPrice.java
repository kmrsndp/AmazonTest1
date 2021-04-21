package com.amazon.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckUpdatedPrice {

	
	public boolean checkUpdatedPrice(String oldPrice, String newPrice) {
		int actualNewPrice =  CheckUpdatedPrice.getPrice(newPrice);
		int actualOldPrice =  CheckUpdatedPrice.getPrice(oldPrice);
		System.out.println(actualNewPrice + "  " + actualOldPrice);

		return (actualNewPrice > actualOldPrice) ? true: false;
	}
	
	private static int getPrice(String priceString) {
		String productPrice = priceString.replaceAll(",", "");
		productPrice = productPrice.replaceAll("₹.", "");
		return (int) Math.round(Double.parseDouble(productPrice));
	}
	}

