package com.mrs.qa.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.base.Verify;
import com.mrs.qa.base.TestBase;
import com.mrs.qa.pages.FindPatientRecord;
//ctrl+shift+o all the import will be done
import com.mrs.qa.pages.LoginPage;
import com.mrs.qa.pages.OpenmrsHomePage;
import com.mrs.qa.util.TestUtil;
//import com.mrs.qa.pages.OpenmrsHomePage;
//ctrl+shift+o for import

public class OpenmrsHomePageTest extends TestBase {
//Now i have to create the constructor of OpenmrsHomePageTest.so that i call super keyword constructor and base class 
	LoginPage loginpage;
	OpenmrsHomePage OpenmrshomePage;
	
	
	
	
	public OpenmrsHomePageTest() {
		
      super(); //so that base calll constructor will be called.
      //First it will call this method so that my prop can be initialize    
	}
	
	//Test cases should be separated and independent.
	//Before each test cases-Lauched the browser and login.
	//@Test-Method will be called and exeucte the test cases.
	//After each test cases-close the browser.
	
	@BeforeMethod
	public void setup() {
	
		initialization();//Then it will come here my driver will be initialize.
		 loginpage=new LoginPage();	
		 
        OpenmrshomePage= loginpage. login(prop.getProperty("username"), prop.getProperty("Password"));
	
	
		Assert.assertEquals(OpenmrshomePage, "Home","title not matched");
	
	}
	
	@Test
	public void ClickonFindPatientRecordbtnTest() {
		FindPatientRecord.click();
		
	}
	

	
	

	@AfterMethod
	public void teardown() {
		
		driver.quit();
	}
	
}

	
	