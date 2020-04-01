import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropEx {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("WebDriver.geckodriver", "geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	//At line no 11 was getting webdriver connection refused error so put thread.sleep for exception handeling.
	Thread.sleep(3000);
	//To get the url
	driver.get("https://jqueryui.com/droppable/");
	
	//Switch to Frame
	driver.switchTo().frame(0);
	
	//Mouse Action Logic
	Actions action=new Actions(driver);
    action.clickAndHold(driver.findElement(By.id("draggable")));
	action.moveToElement(driver.findElement(By.id("droppable")));
	//I have to realese smaller one
    action.release(driver.findElement(By.id("draggable")));
    action.perform();
	
	String actual=driver.findElement(By.xpath(".//*[@id='droppable']/p")).getText();
	System.out.println("Actual Text:::" + actual);
	String expectedColor="rgb(255,250,144)";
	
	String actualColor=driver.findElement(By.id("droppable")).getCssValue("background-color");
	System.out.println("Actual color::: " +actualColor);
	
	if(actualColor.equals(expectedColor))
	 {
		 System.out.println("Pass");
	 }
	else
	 {
		 System.out.println("Fail");
	 }
	//Switch to top window
	 driver.switchTo().defaultContent();
//In this example why my test case is failing...
}
}

