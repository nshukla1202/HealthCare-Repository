package org.h2k;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersEx {
	@Parameters({"jobType","url"})
	@Test
	public void verifyJS(String jobType,String url)
	{
		
	 System.setProperty("WebDriver.geckodriver","geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get(url);
		WebElement e;
		e=driver.findElement(By.id("text-input-what"));
		e.sendKeys(jobType);
		//Just change the valus in xml file job type.
		driver.findElement(By.tagName("button")).click();
		
	}

}
