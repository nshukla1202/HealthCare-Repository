import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelingFramesinSeleniumAPI {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chromedriver", "C:\\Neha\\Selenium\\SeleniumJavaProject\\LearnSelenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://selenium.dev/selenium/docs/api/java/");
		
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		driver.switchTo().defaultContent();
		
	
		Thread.sleep(2000);
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("//span[text()='WebDriver']")).click();
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		driver.switchTo().frame("classFrame");
		String actual=driver.findElement(By.className("title")).getText();
		
		System.out.println("Text retrived from webpage"+actual);
		boolean result=actual.contains("WebDriver");
		if(result)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		driver.switchTo().defaultContent();
		driver.quit();
		
	}

}
