import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot1Ex {
	
	public static void main(String[] args)  {
		
		System.setProperty("WebDriver.geckodriver", "geckodriver.exe");
		
	//10 methods	
	WebDriver driver=new FirefoxDriver();
	
	driver.get("http://www.google.com");
	int i=0;
	short s=(short) i;
//What is size of int 4 short size is 2 we are storing 32 in 64 bit i.e. type casting store it in s.
	//converting one type to another type..
	//5 methods
	//TakesScreenshot tsh=new FirefoxDriver();
	//In order to avoid opening multiple browsers we can write like below..
	TakesScreenshot tsh=(TakesScreenshot) driver;
	
	File srcFile =tsh.getScreenshotAs(OutputType.FILE);
	System.out.println("Path::" +srcFile.getAbsolutePath());
	//File destFile=new File("c://Google.jpg");
	File destFile=new File("Google.jpg");//it better to remove this path and see
	
	try {
		FileHandler.copy(srcFile, destFile);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
}


