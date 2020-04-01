package org.OpenMRSTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OpenMRSTest {
	
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
	public void verifyPatientDetails() throws InterruptedException
	
	{
		
		//open App
	
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		
		WebElement e=driver.findElement(By.name("username"));
		e.sendKeys("");
		
		WebElement e1=driver.findElement(By.xpath("//input[@id='password']/ancestor::p[@class='left']"));
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Admin123");
		//e1.sendKeys("Admin123");
		
		//input[@id='password']/ancestor::p[@class='left']
		
		//WebElement e1=driver.findElement(By.name("password"));
		//e.sendKeys("Admin123");
		
		//Navigate to Location for this Session
		driver.findElement(By.xpath("//li[@id=\"Isolation Ward\"]")).click();
		driver.findElement(By.xpath("//input[@id='loginButton']")).submit();
		
		Thread.sleep(5000);
	}
    @Test
	public void FindPatientRecord() throws InterruptedException
	{
		Actions action=new Actions(driver);
		System.out.println("Inside find patient record function");
		driver.navigate().refresh();
		Thread.sleep(5000);
		//List<WebElement> list=driver.findElements(By.xpath("//div[@id='apps']/child::a[@class='button app big']/i[@class='icon-search']"));
		//action.perform();
		//System.out.println("Number of Element in the list"+list.size());
		////a[contains(@href,'coreapps.findPatient')]
		
		/*for(int i=0;i<list.size();i++)
		{
			//driver.findElements(By.xpath("//div[@id='apps']/child::a[@class='button app big']/i[@class='icon-search']"));
			System.out.println(list.get(i).getText());
		}*/
		
		//driver.findElement(By.xpath("//a[contains(@href,'coreapps.findPatient')]")).click();
		//moveToElement(driver.findElement(By.xpath("//div[@id='apps']")));
		action.moveToElement(driver.findElement(By.xpath("//div[@id='apps']/child::a[@class='button app big']/i[@class='icon-search']")));
		action.click();
		action.perform();
		driver.close();
		
	}
		
	
		

}

	
