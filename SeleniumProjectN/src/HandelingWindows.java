import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandelingWindows {
	public static void main(String[] args) throws InterruptedException {
		
		
 System.setProperty("WebDriver.geckodriver", "geckodriver.exe");
 
 WebDriver driver=new FirefoxDriver();

 driver.get("https://rediff.com");
 driver.switchTo().frame("moneyiframe");
driver.findElement(By.id("query")).sendKeys("TCS");
 driver.findElement(By.className("getqbtn")).click();
 driver.switchTo().defaultContent();
 
 //Fetching the name of the window which has focus.
 String parent=driver.getWindowHandle();
 
 System.out.println("Parent name::" +parent);
 
Set<String> wSet =driver.getWindowHandles();
System.out.println("Size of the set "+ wSet.size());
//Here we are using enhancer forloop.For each string stored in wSet first fetch it.You have to print the value of s.

// We are fetching the first one and storing in s and we take s and we compare with parent both are not eqaul go inside execute this.
//if they are equal don't go inside.it will go inside only 1 time when its not equal. s contains the name we can switch to the window.
// We just get the price and we break it and come out and go back to rediff.com.

for(String s: wSet)
{
	//System.out.println("wSet values" +s);
 //switching to a window
	//driver.switchTo().window(s);
	//if(driver.getTitle().contains("Tata"))
	//{
	//System.out.println("wSet values"+ s);


if(!(s.equals(parent)))
{
	driver.switchTo().window(s);
	System.out.println("Title::"+driver.getTitle());
	if(driver.getTitle().contains("Tata"))
	{
	String price=driver.findElement(By.id("ltpid")).getText();
	System.out.println("The price is:::"+ price);
	break;
}


}
driver.switchTo().window(parent);
	}
	
	}
}


