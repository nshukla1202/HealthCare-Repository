import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandelingAlert {
public static void main(String[] args) {
	
	
	System.setProperty("WebDriver.geckodriver", "geckodriver.exe");
	
	WebDriver driver=new FirefoxDriver();
	
	driver.get("https://ksrtc.in/oprs-web/guest/home.do");
	WebDriverWait wait=new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@class='btn btn-primary btn-lg btn-block btn-booking'][@type='button']"))));
	
	//Click on the search for bus button..
	WebElement e=driver.findElement(By.xpath("//*[@class='btn btn-primary btn-lg btn-block btn-booking'][@type='button']"));
	//For button you can try xpath like this..
	//driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);//Here i put the wait statement to see the pop up.
	e.click();
	
	//Hadeling Pop up/Alert
	//Focus changed to Alert.
	
	Alert alert=wait.until(ExpectedConditions.alertIsPresent());
	System.out.println("Result is" + alert.getText());
	
	Alert alrt= driver.switchTo().alert();
    
	String text=alrt.getText();
	
	System.out.println("Text::"+text);
	
	//Click on ok button
	
	alrt.accept();
	
	//Suppose if i want to click on cancel button
	//No AlertPrresentExecption.
	alrt.dismiss();

	
	
	
}
	
	
}
