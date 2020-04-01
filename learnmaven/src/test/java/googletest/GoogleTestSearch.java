package googletest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageobject.GoogleSearchPage;

public class GoogleTestSearch {
	
	private static WebDriver driver=null;
	
	public static void main(String[] args) {
		googleSearch();
		
	}
	public static void googleSearch() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Learn Selenium\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		//driver.findElement(By.name("q")).sendKeys("Automation Step by step");
		
		GoogleSearchPage.textbox_search(driver).sendKeys("Automation step by step");
		
		//driver.findElement(By.name("btnk")).sendkeys(keys.Return);
		
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		
		driver.close();
		System.out.println("Test is complete");
	
		
		
		
		
	}
	

}
