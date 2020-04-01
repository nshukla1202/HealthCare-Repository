import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HandellingFrameJquery {
	public static void main(String[] args) throws InterruptedException  {
		
	
 {
	// TODO Auto-generated method stub

	
	System.setProperty("WebDriver.geckodriver", "geckodriver.exe");
	
	WebDriver driver=new FirefoxDriver();
	
	driver.get("https://jqueryui.com/droppable/");
	
	//TestCase:Click on the box(drag me to the target)
	//2.click on the another box drop here.
	
	
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
	WebElement from=driver.findElement(By.id("draggable"));
	WebElement to = driver.findElement(By.id("droppable"));
	//Using Action class for Drag and Drop..
	Actions act=new Actions(driver);
	//Dragged and Dropped..
	act.dragAndDrop(from,to).build().perform(); 
	//driver.switchTo().defaultContent();
	Thread.sleep(5000);


	
 }
}
	
}
