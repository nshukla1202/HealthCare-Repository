package testngEx;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class CrossBrowserTesting {
	WebDriver driver;
	@Parameters({"browserType"})
	@BeforeClass //@beforeclass means which will be executed before executing all the test cases.
	//In before claass it should be one time activity in invoke browser level.
	public void InvokeBrowser(String browserType)
	{
		if(browserType.equals("FF"))
		{
       System.setProperty("WebDriver.geckodriver", "geckodriver.exe");
		 driver=new FirefoxDriver();
		}
		else if(browserType.equals("IE"))
		{
			System.setProperty("WebDriver.ie.driver", "IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			
		}
		else
		{
			System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
			driver=new ChromeDriver();
		}
		}
		
	

	@Parameters({"jobType","url"})
	@Test
	public void verifyJS(String jobType,String url) throws InterruptedException
	{
		driver.get(url);
		WebElement e;
		e=driver.findElement(By.name("q"));
		Actions action=new Actions(driver);
		action.sendKeys(jobType);
		action.perform();
		//JavascriptExecutor jse=(JavascriptExecutor)driver;
		//e=(WebElement) jse.executeScript("return document.getElementByid('text-input-what')");
		//e.sendKeys(jobType);
		//Just change the valus in xml file job type.
		Thread.sleep(5000);
		driver.findElement(By.tagName("button")).click();
		
	}
	
}
