package phptravelframeworktest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import phptravelframeworkPage.HomePagePhpTravelPage;//So here we will inport the class name of the page which we created first.



public class HomePagephpTravelTest {
	
	private static WebDriver driver=null;
	
	public static void main(String[] args) {
		
		HomePagePhpTravel();
		
	}
	
	public static void HomePagePhpTravel() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Learn Selenium\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		 
		  HomePagePhpTravelPage php=new HomePagePhpTravelPage();
		  
		  driver.get("https://www.phptravels.net/home");
		 
		 // php.EnterTextInTextBox();
		  php.HomePagePhpTravelPage(driver);
		  List<WebElement> options=driver.findElements(By.xpath("//*[@id=\\\"select2-drop\\\"]/ul/li/ul/li[1]"));
		  for (WebElement option : options) {
			  if("Newport".equals(option.getText()))
			  option.click();
			  }
			
		 // Select sel=new Select(e);
		  
		  //sel.selectByVisibleText("Newport, United States");
		
		//sel.getAllSelectedOptions();
	
			  
		 
	}

}
	
