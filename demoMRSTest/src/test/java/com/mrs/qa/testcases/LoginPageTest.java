package com.mrs.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mrs.qa.base.TestBase;
//import com.mrs.qa.pages.HomePage;
import com.mrs.qa.pages.LoginPage;
import com.mrs.qa.pages.OpenmrsHomePage;
//import com.mrs.qa.pages.OpenmrsHomePage;

@Test
public class LoginPageTest extends TestBase {
	//Here i have to create one constructor of LoginPageTest.
	LoginPage loginpage;
	OpenmrsHomePage OpenmrshomePage;
	
	public LoginPageTest(){
		
		super();  
		
	}
	
    @BeforeMethod
	public void setup()
	{
		initialization();
		 loginpage=new LoginPage();	
	}
	
	public void loginPagetitleTest() {
		
		String title=loginpage.validateLoginPageTitle();
		//AssertJUnit.assertEquals(title,"Login");
		Assert.assertEquals(title, "Login");
	}
	
	public void loginTest()
	{
		loginpage=new LoginPage();	
		OpenmrshomePage=loginpage.login(prop.getProperty("username"), prop.getProperty("Password"));
		
	}
	
	public void Locationforthissession() {
		driver.getTitle();
	}
	
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
