package org.retailmenot.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DealsPage {
	
	WebDriver driver;
	
	public DealsPage(WebDriver driver)
	{
		
		this.driver=driver;
		
	}
	/**
	    * Retreives the deal count
	    * 
	    */
	
	   public int retrieveDealsCount(String dealname)
	   {
		   List<WebElement> list=driver.findElements(By.xpath("//h3[text()='"+dealname+"']/ancestor::div[contains(@class,'section-header')]/following-sibling::div/div"));
			
			System.out.println("Number of element in the list:::"+list.size());
			for(int i=0;i<list.size();i++)
			   {
				   
				   System.out.println("--------------------------");
				   System.out.println("Fetching the details of the deals"+(i+1));
				   System.out.println(list.get(i).getText());
				   System.out.println("----------------------------");
			   }
			      return list.size();
				}

}
