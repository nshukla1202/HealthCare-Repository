//import static org.testng.AssertJUnit.assertEquals;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

public class HandellingAlert {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.chrome.driver", "C:\\Neha\\Selenium\\SeleniumJavaProject\\LearnSelenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//Entering url in browser.
		driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//First without entering any data we just click on Search for bus button.
		
		WebElement e=driver.findElement(By.xpath("//button[@type='button'and contains(text(),'Search for Bus')]"));
		e.click();
        Thread.sleep(9000);
		 //driver.findElement(By.linkText("Search for Bus")).click();
         
		
		//Handelling popup or alert.
		//Focus changed to alert.
		Alert alert=driver.switchTo().alert();
		String text=alert.getText();
		System.out.println("Text"+text);
		
		 //click on ok button
		 alert.accept();
		
		//click on cancel button.you canot use both at the same time.
		//No alert present exception because no cancel button is there. 
		 alert.dismiss();
	}

}
