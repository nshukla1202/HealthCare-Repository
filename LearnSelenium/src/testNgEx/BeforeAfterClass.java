package testNgEx;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeAfterClass {

	
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
//suppose login is failed due to some reason.
//In line no 27 driver has null because its object reference and it has Null you will get null pointer exception.
//All will skipped.It will show Configuration Failure.
	WebDriver driver; 
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
