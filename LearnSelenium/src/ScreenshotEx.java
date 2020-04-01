import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotEx {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chromedriver","C:\\Neha\\Selenium\\SeleniumJavaProject\\LearnSelenium\\chromedriver.exe");
		//here we are invoking 10
		WebDriver driver=new FirefoxDriver();

		driver.get("https://www.google.com");
		
		
		//TakeScreenshot is an Interface which is implemented by RWD and extended by FFD.
		
		//Converting one type to another is called type casting.
		
				//Lets see some example:
				int i=10;//what is the size of int datatype i.e 4 bytes
				short s=(short) i;//what is the size of short datatype i.e.2 bytes
				
			CaptureScreenshot(driver,"Google.jpg");	
			CaptureScreenshot(driver,"Google.jpg1");
	}
	public static void CaptureScreenshot(WebDriver driver,String fname)
	{
		
		//line 15 and 19,we are creating 2 objects from java prospective.Whenever i call firefox driver it is 2 browser getting launched at line
		//no 15 and 19.How do we avoid opening 2 browsers.we are storing 10 variable in driver line no 15.so we can write like below line.
		//5 methods
		TakesScreenshot tsh=(TakesScreenshot) driver;
		//in which formate you want to save the screenshot.
		
		File srcfile=tsh.getScreenshotAs(OutputType.FILE);
		System.out.println("Path::" + srcfile.getAbsolutePath());
		File destfile= new File("Google.jpg");	
				//File destfile=new File("C://www.google.jpg"); //do not give any path it will storein your project
				//because this hard code the value.better to remove the path i just put the path to show you.if it store in d drive so will it v available in your laptop may be no.
				
		
		//Converting one type to another is called type casting.
		
		// Here we are storing 4 byte value in 2 byte value.16 bit in 32 bit i.e. called type casting by converting.I.e Explicit casting
		
		
//the screen shot will save in temp file in your computer.
//Suppose if you are interested to copy this file in some other location like file handler class
		
	try {
		FileHandler.copy(srcfile, destfile);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	
//whenver you try to copy or read.	
		
	}

}
