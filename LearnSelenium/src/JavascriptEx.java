import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavascriptEx {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chromedriver","C:\\Neha\\Selenium\\SeleniumJavaProject\\LearnSelenium\\chromedriver.exe");
	
	WebDriver driver=new FirefoxDriver();
	
	driver.get("https://www.google.com/");
			
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	String s=(String) jse.executeScript("return document.title");
	System.out.println(s);
	
  WebElement e=(WebElement) jse.executeScript("return document.getElementsByName('q')[0]");
	
	e.sendKeys("Selenium");
		
	}

}
