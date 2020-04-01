package googletest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageobject.GoogleSearchPageObjects;

public class GoogleSearchPageTest {
	private static WebDriver driver=null;
	
	public static void main(String[] args) {
		
		googleSearchTest();
			
	}
	
	public static void googleSearchTest() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Learn Selenium\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		
		GoogleSearchPageObjects searchPageObj=new GoogleSearchPageObjects(driver);
		
		driver.get("https://www.google.com/");
		searchPageObj.setTextInsearchBox("A B C D");
		searchPageObj.clicksearchbutton();
		driver.close();
	}
	

}
