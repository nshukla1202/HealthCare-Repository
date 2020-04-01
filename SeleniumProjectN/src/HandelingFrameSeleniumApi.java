import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandelingFrameSeleniumApi {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.geckodriver", "geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
	driver.get("https://seleniumhq.github.io/selenium/docs/api/java/");	
	
	//Test Case: I have to automate this website and in cosole the out put would be webDriver interfaces.
	
	driver.switchTo().frame("packageListFrame");
	driver.findElement(By.linkText("org.openqa.selenium")).click();
	driver.switchTo().defaultContent();
	
	
	driver.switchTo().frame("packageFrame");
	driver.findElement(By.xpath("//span[contains(text(),'WebDriver')]")).click();
	driver.switchTo().defaultContent();
	
	driver.switchTo().frame("classFrame");
	//String actual=driver.findElement(By.tagName("h2")).getText();
	String actual=driver.findElement(By.className("title")).getText();
	System.out.println("Text retreived from webpage "+ actual);
	boolean result=actual.contains("WebDriver");
	if(result)
	{
		
		System.out.println("TC Pass");
	}
	else
	{
		System.out.println("TC Pass");
		
		
	}
	
		
		
		
	}
	
	}

