package testNgEx;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterEx {
	
	@Parameters({"jobType","url"})
	@Test
	public void VerifyJs(String jobType,String url)
	{
	System.setProperty("webdriver.chromedriver","C:\\Neha\\Selenium\\SeleniumJavaProject\\LearnSelenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get(url);
	
	
	
	WebElement e;
	e=driver.findElement(By.id("text-input-what"));
	
	//In below line i am trying to remove the default text from thetext box.
	
	//WebElement e;
	//e=driver.findElement(By.id("text-input-where"));
	//toclear.sendKeys(Keys.CONTROL+"a");
	//toclear.sendKeys(Keys.DELETE);
	
    //WebElement e1=driver.findElement(By.id("text-input-where"));
    e.sendKeys(jobType);
    
    driver.findElement(By.tagName("button")).click();
    
    //driver.findElement(By.xpath("//button[ @type='submit']")).click();
	
	}
	

}
