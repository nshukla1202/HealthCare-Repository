package org.retailmenot;

import java.util.List;

import org.openqa.selenium.By;

   /*Manual Test Cases
    *Go to retail me not .com.
     * Click on Vlentine's day deals.
    * Check deals available in paticular catagory.
     * Verify the count of deals in a paticular catagory.
     */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.retailmenot.pages.DealsPage;
import org.retailmenot.pages.HomePage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class RetailmeNotTest {
	
	WebDriver driver;
	

	@Parameters({"browser type"})
	@BeforeClass
	public void invokebrowser(String browserType)
	{
		if(browserType.equals("FF"))
		{
		System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		 driver=new FirefoxDriver();
	}
	
		else if(browserType.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver","C:\\Neha\\Selenium\\SeleniumJavaProject\\LearnSelenium\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		else
		{
			System.setProperty("webdriver.chromedriver","C:\\Neha\\Selenium\\SeleniumJavaProject\\LearnSelenium\\chromedriver.exe");
			driver=new ChromeDriver();
		}
	}
	
	@Test
	public void verifyDealscount()
	{
		//Opens the Application
		HomePage hpage=new HomePage(driver);
		  hpage.openApp();
		//Navigate to deals Page
		hpage.navigateToPage("Valentine's Day Deals");
		
		
		DealsPage dpage=new DealsPage(driver);
		
		int actual =dpage.retrieveDealsCount("Great Deals on Flowers");
		int expected=8;
		Assert.assertEquals(actual, expected);
		
		
	
   }
}
	
	
		
		
		
	

