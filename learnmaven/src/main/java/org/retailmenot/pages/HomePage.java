package org.retailmenot.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	
	
 public HomePage(WebDriver driver)
{
		this.driver=driver;
}
	
	/**
	 * Open the Application 
	 */
	public void openApp()
	{
		driver.get("https://www.retailmenot.com/holidays/valentines-day");
	}
	//We are going to convert above logic in to reusable methods
   
	
	/**
	 * Navigate to the Valentine's day deals
	 */
   public void navigateToPage(String linkText)
   {
	   
	                      // "+linkText+"
	   //Click on Valentine's Day Deal
	   driver.findElement(By.xpath("//span[contains(text(),'"+linkText+"')]")).click();
   }

}
