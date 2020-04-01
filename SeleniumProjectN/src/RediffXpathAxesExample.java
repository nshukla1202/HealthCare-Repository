import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RediffXpathAxesExample {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("WebDriver.geckodriver", "geckodriver.exe");
	
	WebDriver driver=new FirefoxDriver();
	
	driver.get("https://money.rediff.com/gainers");
	WebElement e=driver.findElement(By.xpath("//a[contains(text(),'High')]/parent::td/following-sibling::td[2]"));
	
	try
	{
	if(e.isDisplayed())
	{

	String price= e.getText();
	System.out.println("Stock Price " + price);
	}
	}
	catch(NoSuchElementException ex)
	{
	System.out.println("Stock Name Not Exists " + ex.getMessage());
	}

	Thread.sleep(5000);
	
	
}
}
