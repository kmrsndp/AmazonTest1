

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class NewTestMaven {
 

	private WebDriver driver;		
	@Test				
	public void testEasy() {	
		System.out.println("This is the test running");; 		
	}	
	@BeforeTest
	public void beforeTest() {	
		
		System.out.println("This is before starting test");
		
	}		
	@AfterTest
	public void afterTest() {
		System.out.println("This is after test is done");		
	}
}
