import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelingFrame {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver" ,"C:\\Neha\\Selenium\\SeleniumJavaProject\\LearnSelenium\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Neha/Desktop/Frames.html");
		
		driver.switchTo().frame("frame_c");
		driver.findElement(By.id("Frame3txt")).clear();
		driver.findElement(By.id("Frame3txt")).sendKeys("I am in frame3");
		
		//Navigate to top window.
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame_b");
		driver.findElement(By.id("Frame2txt")).clear();
		driver.findElement(By.id("Frame2txt")).sendKeys("I am in frame 2");
		
		//we have to switch to the top window
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame_a");
		driver.findElement(By.id("Frame1txt")).clear();
		driver.findElement(By.id("Frame1txt")).sendKeys("I am in frame 1");
		
		//switch to default content
		driver.switchTo().defaultContent();
		
		
		
		
		
	}
	
}
