package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObjects {
	WebDriver driver=null;
	
	By textbox_search=By.name("q");
	By button_search=By.name("btnK");
	
	//Here calling the constructor
	public GoogleSearchPageObjects(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public void setTextInsearchBox(String text) {
		
		driver.findElement(textbox_search).sendKeys(text);
		
		
	}
	public void clicksearchbutton()
	{
		driver.findElement(button_search).sendKeys(Keys.RETURN);
	}
	

}
