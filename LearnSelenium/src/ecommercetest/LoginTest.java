package ecommercetest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
	
	 @Test(invocationCount=5)
	public void LoginTest()
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://my-qastg.mheducation.com/login");
		
		driver.findElement(By.name("username")).sendKeys(" testinst1_282020@mheqa.com");
		driver.findElement(By.name("password")).sendKeys("Qa1234567");
		
		driver.findElement(By.xpath("//button[contains(@class,'btn btn')]")).click();
		System.out.println("Clicked on LOG IN button ");
		
		
	}

}
