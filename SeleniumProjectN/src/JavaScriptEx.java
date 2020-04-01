import javax.swing.text.Document;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptEx {

public static void main(String[] args) {
	
	System.setProperty("WebDriver.geckodriver","geckodriver.exe");

	WebDriver driver= new FirefoxDriver();
	
	driver.get("https://www.google.com");
	
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	String s=(String) jse.executeScript("return document.Title");
	System.out.println(s);
	WebElement e=(WebElement) jse.executeScript("return document.getElementsByName('q')[0])");
	e.sendKeys("selenium");
}	
	
}
