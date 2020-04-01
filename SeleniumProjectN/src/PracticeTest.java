import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PracticeTest {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("WebDriver.geckodriver", "geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
		
	driver.get("https://demo.openmrs.org/openmrs/login.htm");
	WebElement e=driver.findElement(By.id("username"));
	e.sendKeys("Admin");
	WebElement e1=driver.findElement(By.id("password"));
	e1.sendKeys("Admin123");
		
	driver.findElement(By.id("Isolation Ward")).click();
		driver.findElement(By.id("loginButton")).submit();
		
	Thread.sleep(3000);
	 driver.findElement(By.xpath("//a[@class='button app big']")).click();
		
driver.findElement(By.id("patient-search")).sendKeys("James King");
Thread.sleep(3000);
List<WebElement>list=driver.findElements(By.xpath("DataTables_sort_icon"));
driver.findElement(By.xpath("//tbody/tr/td[2]")).click();

//List<WebElement> list1= driver.findElements(By.xpath("//tbody[@role='alert']/tr/td[2]"));


//int count=list.size();
//System.out.println("Number of item in list:::" + count);
//boolean result=true;
//for(int i=0;i<count;i++)
{

	//  System.out.println(list.get(i).getText());
}
	

	
	}
	
	
}



