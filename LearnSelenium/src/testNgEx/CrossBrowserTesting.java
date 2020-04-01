package testNgEx;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
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
	@Parameters({"jobType","url"})
	@Test
	public void VerifyJs(String jobType,String url)
	{
	driver.get(url);
	WebElement e;
   //e=driver.findElement(By.id("text-input-what"));
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	e=(WebElement)jse.executeScript("return document.getElementById('text-input-what')");
	
	//In below line i am trying to remove the default text from thetext box.
	
	//WebElement e;
	//e=driver.findElement(By.id("text-input-where"));
	//toclear.sendKeys(Keys.CONTROL+"a");
	//toclear.sendKeys(Keys.DELETE);
	
    //WebElement e1=driver.findElement(By.id("text-input-where"));
    e.sendKeys(jobType);
    
    driver.findElement(By.tagName("button")).click();

}
}
