package org.totalqa.com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CompleteRegistrationForm {

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
	public void registrationForm()
	{
		
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		try {
		 WebDriverWait wait = new WebDriverWait(driver, 2);
		    wait.until(ExpectedConditions.alertIsPresent());
		Alert alert=driver.switchTo().alert();
		String text=alert.getText();
		System.out.println("Text"+text);
		alert.dismiss();
		  Assert.assertTrue(alert.getText().contains("Thanks."));
		} catch (Exception e) {
		    //exception handling
		}
		// alert.dismiss();

		 //click on ok button
		driver.findElement(By.name("firstname")).sendKeys("Test");
		driver.findElement(By.id("lastname")).sendKeys("Automation");
		
		driver.findElement(By.xpath("//button[@id='buttonwithclass']")).getText();
		System.out.println("getText");
		
		driver.findElement(By.xpath("//div[@class='control-group']/strong/following-sibling::input[@id='sex-1']")).click();
		////*[@id="exp-2"]
		driver.findElement(By.xpath("//*[@id='exp-2']")).click();
	}
	
	////label[text()='Years of Experience'] 
	
	



	
		
	}

