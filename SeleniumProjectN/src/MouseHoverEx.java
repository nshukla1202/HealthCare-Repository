import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverEx {
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("WebDriver.geckodriver", "geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Neha/HTML-PAGE%20FOR%20PRACTICE/ActionsEx.html");
		//Mose Action Example
		Actions action=new Actions(driver);
		//Mouse Hover
		
      action.moveToElement(driver.findElement(By.xpath("//*[@id='menu1']")));
      //Place a MouseHover
      action.moveToElement(driver.findElement(By.xpath(".//*[@class='menuHead']")));
      //Select a SubMenu
      action.moveToElement(driver.findElement(By.xpath(".//*[@class='menuChoices']")));
      //Click on Google
      action.moveToElement(driver.findElement(By.xpath("//a[text()='Google']")));
     // action.moveToElement(driver.findElement(By.partialLinkText("G"
      	
      action.click();
      //Mandatory Method to call all the sequence of actions
      action.perform();
      Thread.sleep(3000);//Here thread is a class and sleep is a static method and we have to pass time in miliseconds.
      String url=driver.getCurrentUrl();
      System.out.println(url);
		
	
	}

}