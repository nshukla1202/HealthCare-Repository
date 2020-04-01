import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandelingFramesEx {

//Frame is useful to divide the html page in to different sections.For developing this i have used total 4 webpage.
	
public static void main(String[] args) {
	
System.setProperty("WebDriver.geckodriver", "geckodriver.exe");

WebDriver driver=new FirefoxDriver();

 driver.get("file:///C:/Neha/HTML-PAGE%20FOR%20PRACTICE/Frames.html"); 
 
 //Test case to find out the number of frame available in a webpage.
 
//WebElement e =driver.findElement(By.xpath("//frame"));
//System.out.println("the number of frame ");

//In Selenium focus is always on any one page only in case of Handeling Frames.
//P4 TO P3 the 2 method we use driver.switchTo().frame(String framename or frameid);
 //Or driver.switchTo().frame(int index); but we have to identify the frame name or id
 //To find out the frame name we just need inspect element.
 
 //Switching to a frame to intract with the text box.
driver.switchTo().frame("frame_c");
driver.findElement(By.id("Frame3txt")).clear();
driver.findElement(By.id("Frame3txt")).sendKeys("in Frame3");


//Navigate to the top Window.Once you switch you have to go to the top window.

driver.switchTo().defaultContent();
//switching to a frame
driver.switchTo().frame("frame_b");
driver.findElement(By.id("Frame2txt")).clear();
driver.findElement(By.id("Frame2txt")).sendKeys("in Frame2");

//Navigate to top Window
driver.switchTo().defaultContent();

 
 

}
	
	
}
