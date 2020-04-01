package phptravelframeworkPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePagePhpTravelPage {
	
	public static WebDriver driver=null;
	
	static By hotel_search=By.className("select2-input");
	static By hotel_checkindate=By.id("checkin");
	static By hotel_checkoutdate=By.id("checkout");
	static By adult_checkin=By.name("adult");
	static By adult_checkout=By.name("children");
	static By hotel_searchbutton=By.className("btn btn-primary btn-block");
	
	
	

	public  void HomePagePhpTravelPage(WebDriver driver){
		
		this.driver=driver;
		
		
	}
	public static void main(String[] args) {
		
	}
	
	
	public static void EnterTextInTextBox() {
		
		
		List<WebElement> e=driver.findElement(hotel_search).findElements(By.xpath("//*[@id=\\\"select2-drop\\\"]/ul/li/ul/li[1]"));
		
	
		
		driver.findElement(hotel_checkindate).sendKeys();
		driver.findElement(hotel_checkoutdate).sendKeys();
		driver.findElement(adult_checkin).getClass();
		driver.findElement(adult_checkout).getClass();
		driver.findElement(hotel_searchbutton).click();
	
		
	}
}
