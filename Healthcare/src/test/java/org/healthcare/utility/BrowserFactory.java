package org.healthcare.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	
	public static WebDriver startApplication(WebDriver driver,String browsername,String appURL)
	{
		if(browsername.equals("Chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Learn Selenium\\chromedriver.exe");
			
			 driver=new ChromeDriver();
			 
		}
		else if(browsername.equals("FF"))
			{
			System.setProperty("WebDriver.geckodriver","geckodriver.exe");
			 driver=new FirefoxDriver();
			}
		
		else if (browsername.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver","C:\\Neha\\Selenium\\SeleniumJavaProject\\LearnSelenium\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		else
		{
			System.out.println("We do not support this browser");
		}
		 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get(appURL);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		
			return driver;
		
	}
	public static void quitBrowser(WebDriver driver) {
		driver.quit();
		
	}

}
