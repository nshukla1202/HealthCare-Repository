package org.openmrs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class OpenmrsTest {
	
	WebDriver driver;

	//@Before class is one time activity it execute before all the test cases.
	@Parameters({"browserType"})
	@BeforeClass()
	public void invokebrowser(String browserType)
	{
		if(browserType.equals("FF"))
		{
		System.setProperty("WebDriver.geckodriver","geckodriver.exe");
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
