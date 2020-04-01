package org.openMRS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

WebDriver driver;

public LoginPage(WebDriver driver)
{
	this.driver=driver;
}
public boolean login(String uname,String pword) throws InterruptedException
{
	driver.findElement(By.id("username")).sendKeys("Admin");
	driver.findElement(By.id("password")).sendKeys("Admin123");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//li[@id='Isolation Ward']")).click();
	driver.findElement(By.xpath("//input[@id='loginButton']")).submit();
	boolean result=driver.getTitle().contains("Home");
	return result;
}

	
}
