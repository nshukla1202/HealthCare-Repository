package org.iit.mmp.patientmodule.pages;

import org.iit.mmp.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PayFeesPage {
	WebDriver driver;
	
	
	
	
	By PayNow=By.xpath("//button[contains(text(),'Pay Now')]");
	


	public  PayFeesPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	
	
	
	public void PayFee(String Fee) {
		
		WebElement e=driver.findElement(PayNow);
		e.click();
		
	}
	
	public void PayNow() {
		
		
	}
	
	
	
	
	

}
