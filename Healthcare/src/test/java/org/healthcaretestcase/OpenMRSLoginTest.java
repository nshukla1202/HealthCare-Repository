package org.healthcaretestcase;

import org.healthcare.utility.BrowserFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.healthcare.pages.*;

public class OpenMRSLoginTest {
	 private static WebDriver driver=null;
	
public OpenMRSLoginTest(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	}

public static void main(String[] args) {

	//startApplication();
	loginTest();
	LogintoMRSApp();

	
	
}
 



private static void LogintoMRSApp() {
	// TODO Auto-generated method stub
	
}

private static void loginTest() {
	
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Learn Selenium\\chromedriver.exe");
	
	 driver=new ChromeDriver();
	 OpenMRSLoginTest openmrsLoginT=new OpenMRSLoginTest(driver);
	 
	 driver.get("https://demo.openmrs.org/openmrs/login.htm");
	 openmrsLoginT.loginintoMRSApp("admin", "Admin123");
	
}	
	

private void loginintoMRSApp(String username, String password) {
	// TODO Auto-generated method stub
	
    
//WebDriver driver;

//private void LoginApp() {
	// TODO Auto-generated method stub
	

}
}
	
 // public static void loginApp() {	
 //driver=BrowserFactory.startApplication(driver,"Chrome", "https://demo.openmrs.org/openmrs/login.htm");
 
 
   //org.healthcare.pages.LoginPage loginpage=PageFactory.initElements(driver, org.healthcare.pages.LoginPage.class);
   
     //OpenMRSLoginTest omlt;
	// org.healthcare.pages.LoginPage loginpage1=new org.healthcare.pages.LoginPage();
	 // OpenMRSLoginTest.LogintoMRSApp();
   // loginpage.LogintoMRSApp();
    //BrowserFactory.quitBrowser(driver);
 
 
	//}
//private static void LogintoMRSApp() {
	// TODO Auto-generated method stub
	//org.healthcare.pages.LoginPage loginpage1 = PageFactory.initElements(driver, org.healthcare.pages.LoginPage.class);
	
	//private void LogintoMRSApp() {
	// TODO Auto-generated method stub
	

	//OpenMRSLoginTest omlt;
	///OpenMRSLoginTest.LogintoMRSApp();





