import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JqueryDragandDropExample {
	
	public static void main(String[] args) {
		
		
		System.setProperty("WebDriver.chrome.driver","C:\\Neha\\Selenium\\SeleniumJavaProject\\LearnSelenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		//Here in this example we have to perofrm 3 action.
		
		//Clickand Hold small box
		
		//click on small box
		//release the small box.
		//In frame
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
	
		//Perform MousehOver
		Actions action=new Actions(driver);
		action.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']")));
		action.moveToElement(driver.findElement(By.xpath("//div[@id='droppable']")));
		action.release(driver.findElement(By.xpath("//div[@id='droppable']/p")));
		
		action.perform();
		
		String actual=driver.findElement(By.xpath("//div[@id='droppable']/p")).getText();
		System.out.println("ActualText:::"+actual);
		
		String actualcolor=driver.findElement(By.id("droppable")).getCssValue("background-color");
		
		System.out.println("Actualcolor:::"+actualcolor);
		
		//In google there is RGB color codes you can check their.
		//I got these in console:rgba(255, 250, 144, 1)
		
		
		
		
	
	}

}
