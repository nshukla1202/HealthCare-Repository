import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
//In this program i will enter the text,capture screen shot and click on the button.
//It always better to capture the object of evidence while executing the test cases and raising the bug.
public class IndeedScreenshotEx {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("WebDriver.geckodriver","geckodriver.exe");
	
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.indeed.com/");
	
	WebElement e=driver.findElement(By.id("text-input-what"));
	e.sendKeys("QA Analyst");

   //I have used keys.control to clear the text.Because the .clear was not working.
	driver.findElement(By.id("text-input-where")).sendKeys(Keys.CONTROL + "a");
	driver.findElement(By.id("text-input-where")).sendKeys(Keys.DELETE);
	Thread.sleep(1000);
	driver.findElement(By.id("text-input-where")).sendKeys("Woonsocket RI");
	
	//In this below line i have used the screen shot method to take the screen shot.
	//I can use the class of this method and use it in my other program.
	Thread.sleep(5000);
	TakesScreenshot tsh=(TakesScreenshot) driver;
	File srcFile=tsh.getScreenshotAs(OutputType.FILE);
	System.out.println("Path::" +srcFile.getAbsolutePath());
	File destFile=new File("indeed.jpg");
	try {
		FileHandler.copy(srcFile, destFile);
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	//Now i will click on the button
	WebElement e2=driver.findElement(By.xpath("//button[@type='submit']"));
	e2.click();
	//Like below line we can take multiple screen shot..
	//I will capture the screen shot in 2 nd page using above screen shot method also i can take multiple screen shot.
	TakesScreenshot tsh1=(TakesScreenshot) driver;
	File srcFile1=tsh1.getScreenshotAs(OutputType.FILE);
	System.out.println("Path::" +srcFile1.getAbsolutePath());
	File destFile1=new File("indeed1.jpg");
	try {
		FileHandler.copy(srcFile1, destFile1);
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
		captureScreenshot(driver,"indeed1.jpg");

			
		}

		private static void captureScreenshot(WebDriver driver,String fName) {
			// TODO Auto-generated method stub
			
			driver.close();
			
		}
	
	


	
}

