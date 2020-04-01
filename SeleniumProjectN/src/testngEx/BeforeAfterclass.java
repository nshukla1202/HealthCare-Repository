package testngEx;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeAfterclass {

	@Test
	public void a1()
	{
		
	}
	
	@Test
	public void a2()
	{
		
	}
	@Test
	public void a3()
	{
		
		
	}
	WebDriver driver;//If this login is fail due to some reason webdriver driver;driver is containing null in line no 27 because it has object reference it has null null.get
	//we will get null pointer exception.All the test cases will be skipped.
	@BeforeClass
	public void login()
	{
	driver.get("http://www.google.com");	
	}
	@AfterClass
	public void logout()
	{
		
	}
	
	}
	
	

