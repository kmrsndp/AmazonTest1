package com.amazon.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeSnapShot {

	WebDriver driver;
	int screenshotCount = 1;
	public void takeSnapShot(WebDriver driver) throws Exception {
	
	TakesScreenshot screenShot = ((TakesScreenshot)driver);
	File sourceFile = screenShot.getScreenshotAs(OutputType.FILE);
	File destinationFile = new File("../MavenTest/src/test/java/amazon/com/testoutputs/"+"Screenshot"+screenshotCount+".png");
	FileUtils.copyFile(sourceFile, destinationFile);
	screenshotCount++;
	}
}
