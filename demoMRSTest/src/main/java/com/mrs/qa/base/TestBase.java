package com.mrs.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.mrs.qa.util.TestUtil;

public class TestBase {
	
 public static WebDriver driver;//INITIALIZE WEBDRIVER
 public static Properties prop;

public TestBase(){	//I will read the properties.
	try {
	prop=new Properties();//i will intialize from prop.
	FileInputStream ip=new FileInputStream("C:\\Neha\\Selenium\\SeleniumJavaProject\\demoMRSTest\\src\\main\\java\\com\\mrs"
			+ "\\qa\\config\\config.properties");
	
	      prop.load(ip);
	
	} catch(FileNotFoundException e) {
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
	}
}
	
	//You have to create the constructor of the this class read your properties from line no 16 to 27.S

//after this we will create initialization method.inside it i will write code.i will read the property.

public static void initialization() {
	String browserName=prop.getProperty("browser");
	if(browserName.equals("Firefox")) {
		System.setProperty("WebDriver.geckoDriver","geckodriver.exe");
		//C:/Neha/Selenium/SeleniumJavaProject/SeleniumProjectN");
		
		 driver=new FirefoxDriver();//I will definded this driver which is defined at classs level will initalized so that i can use it.
	}
		 else if(browserName.equals("chrome")) {
			 System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
			 driver=new ChromeDriver();
			 
		 }
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_TIMEOUT, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
	
	//suppose your application is little slow its taking more timeout so what will do inside commrsqa.util package will create class Testutil class.
	
	
	
	
	}
}
	


	
	
	

