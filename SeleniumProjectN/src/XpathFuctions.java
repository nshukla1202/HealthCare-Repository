import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathFuctions {
	
public static void main(String[] args) {
	// WebDriver driver=new FirefoxDriver();
	System.setProperty("WebDriver.geckodriver", "geckodriver.exe");
	
	 WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	
	WebElement e=driver.findElement(By.xpath("//h2[text()='Sign Up']"));
	String actual=e.getText();//it is text so we will use get text() methods
	System.out.println("actual :::+actual");
	String expected="Sign Up";
	
	if(actual.equals(expected))
	{
		System.out.println("TC Pass");
	}
		else
		{
			System.out.println("TC Fail");
		}
	e=driver.findElement(By.xpath("//h2[contains(text(),'friends')]"));//trying to get the xpath of long text,we will use partial text.
	//there are 2 parameter available text(),second parameter is friends.
	actual=e.getText();
	
	System.out.println("actual:: +actual");
	}
       
          
}





