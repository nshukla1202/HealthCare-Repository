package org.h2k.openmrs.tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.sun.org.apache.xpath.internal.operations.Equals;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.List;

import org.openMRS.LoginPage;
import org.openMRS.PatientRecord;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Test
public class HomePageForMRSTest() 
{

	WebDriver driver;
	 String url;
	
	@Parameters({"browserType","url"})
	@BeforeClass 
	public void invokeBrowser(String browserType,String url)
	
	{
	if(browserType.equals("FF"))
		{
         System.setProperty("WebDriver.geckodriver", "geckodriver.exe");
		driver=new FirefoxDriver();
		}
		else if(browserType.equals("IE"))
		{
			System.setProperty("WebDriver.ie.driver", "IEDriverServer.exe");
			 driver=new InternetExplorerDriver();	
		}
		else
		{
			System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
			 driver=new ChromeDriver();
			 
		}
	this.url=url;
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts();
	}
	public void VerifyLogin() throws InterruptedException {
		
		LoginPage lPage=new LoginPage(driver);
		lPage.login("Admin", "Admin123");
		
	}
	
	public void verifyPatientRecord() throws InterruptedException{
		
	}

	//public void FindPatientRecord()
	
//	driver.findElement(By.xpath("//a[@class='button app big']")).click();
//		
//WebElement e1=driver.findElement(By.id("patient-search"));
//e1.sendKeys("");
//List<WebElement>list=driver.findElements(By.xpath("DataTables_sort_icon"));
//  driver.findElement(By.xpath("//tbody/tr/td[2]")).click();
//List<WebElement> list1= driver.findElements(By.xpath("//tbody[@role='alert']/tr/td[2]"));

//System.out.println("Number of item in the list::"+list.size());

//for(int i=0;i<list.size();i++)

//	System.out.println(i);

//	public void VerifyPatientRecord() throws InterruptedException
//	{
//		FindPatientRecord fpr = new FindPatientRecord(driver);
//		
//		//FindPatientRecord fpr=new FindPatientRecord(driver);
//		//FindPatientRecord fpr=(FindPatientRecord) new org.openMRS.FindPatientRecord(driver);
//	}
		
	
}


	  
}
	

	
	
	
	

