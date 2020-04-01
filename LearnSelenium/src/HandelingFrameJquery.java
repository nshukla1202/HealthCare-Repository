import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

     public class HandelingFrameJquery {
    	 
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.chrome.driver", "C:\\Neha\\Selenium\\SeleniumJavaProject\\LearnSelenium\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		Thread.sleep(5000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
	     WebElement From=driver.findElement(By.id("draggable"));
		
		 WebElement To=driver.findElement(By.id("droppable"));
		  
		  Actions action=new Actions(driver);
		  
		  
		 action.dragAndDrop(From,To).build().perform();	
		 driver.quit();
		 //Thread.sleep(5000);
		
		
		
		
		
		
		
		
	}

}
