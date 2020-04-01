import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IndeedScreenshotEx {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chromedriver","C:\\Neha\\Selenium\\SeleniumJavaProject\\LearnSelenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.indeed.com/");
		driver.findElement(By.id("text-input-what")).sendKeys("Selenium");
		//In below line i am trying to remove the default text from thetext box.
		
		WebElement toclear=driver.findElement(By.id("text-input-where"));
		toclear.sendKeys(Keys.CONTROL+"a");
		toclear.sendKeys(Keys.DELETE);
		
	    WebElement e1=driver.findElement(By.id("text-input-where"));
	    e1.sendKeys("Boston");
		
	
		
		driver.findElement(By.xpath("//button[ @type='submit']")).click();
	
		CaptureScreenshot(driver,"indeed.jpg1");
		CaptureScreenshot(driver,"indeed.jpg2");
		
	}	
		
	public static  void CaptureScreenshot(WebDriver driver,String fname)
			{
		
		
		TakesScreenshot tsh=(TakesScreenshot)driver;
		
		File srcfile=tsh.getScreenshotAs(OutputType.FILE);
		System.out.println("Path::" + srcfile.getAbsolutePath());
		File destfile= new File("Indeed.jpg1");
		driver.quit();
		
		
	}


}
	