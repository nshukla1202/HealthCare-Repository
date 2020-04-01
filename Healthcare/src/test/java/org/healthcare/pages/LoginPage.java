package org.healthcare.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	 private static WebDriver driver=null;
		
		By username_login=By.id("username");
		By Password_login=By.id("password");
		By Click_Isolationward=By.id("Isolation Ward");
		By Click_LogIn=By.id("loginButton");
		
		public LoginPage(WebDriver driver)
		{
			this.driver=driver;
		}
		
	 public void LogintoMRSApp() {
		 
		 driver.findElement(username_login).sendKeys("admin");
		 driver.findElement(Password_login).sendKeys("Admin123");
		 driver.findElement(Click_Isolationward);
		 driver.findElement(Click_LogIn);
		// driver.quit();
	 }
	 
	 
	 

}
