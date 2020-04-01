import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotEX {
public static void main(String[] args) {
	
	 System.setProperty("WebDriver.geckodriver", "geckodriver.exe");
	 //From line number 12 to line number 16 we are trying to create a new firefox driver object 
	 WebDriver driver =new FirefoxDriver();
	  driver.get("http://www.google.com");
	  int i=10;
	  short s=(short) i;
	//Suppose if want to take the 5 screen shot on at the same page but at different-different pages.You write a method..
	  captureScreenshot(driver,"google1.jpg");
	  //Perform some operations
	  //Again you want to take screenshot and just change the file name.
	  captureScreenshot(driver,"google2.jpg");
	  
}
   public static void captureScreenshot(WebDriver driver,String fName)
{
//5 methods
     //TakesScreenshot is an interface which is implemented by remote webdriver extended by firefox driver.we are creating a 2  object.
	 //TakesScreenshot tsh=new FirefoxDriver();
	 TakesScreenshot tsh=(TakesScreenshot) driver;//this called type casting.
	 //we are taking the screen shot in a file formate.
	 //See what the output of the screenshot here i.e. file
	  File srcFile=tsh.getScreenshotAs(OutputType.FILE);//F is an object for File class,using an object we call methods.
	  //In below step we wanted to know the file path.
	 System.out.println("Path::"+srcFile.getAbsolutePath());
	 //Here in below line if you will not provide the path it will create in your package explorer in your project.Without path its always suggested because it will be hard coded.
	File destFile=new File("fName");
  //How do we avoid opening two broser.
	//Here it is forcing us to put try catch its an compile time exception/checked/io exceptions. 
	try {
		FileHandler.copy(srcFile, destFile);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

	
}


}
	

