package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MyFirstSeleniumTest {
	
	 static String browser;
	static  WebDriver driver;
	
	public static void main(String[] args) {
	    setBrowser();
		setBrowserConfig();
		runtest();
			
	}
	//we have created these 3 functions...
	//Set Browser //set Browser config //run test
	//I will create function as per browser config.
	
	    public static void setBrowser() {
		 browser="Chrome";
	    }
	     public static void setBrowserConfig() {
		String projectLocation=System.getProperty("user.dir");
		
		if(browser.contains("Chrome")){
	    System.setProperty("Webdriver.chrome.driver",projectLocation+"\\lib\\chromedriver\\chromedriver");
	    driver=new ChromeDriver();
	    
		}
		
	 if(browser.contains("Firefox")){
	 System.setProperty("webdriver.gecko.driver",projectLocation+"\\lib\\geckodriver");
	 
	driver=new ChromeDriver();
	
	}
	 }
	  public static void runtest() {
		
	}
	
}
