package testngEx;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleTest {

//Point to Remember--In TestNg there is no concept of main method.		
//First thing you have to write the methods..
//We will put @Test to consider it as Test Case.we have to select testng library.
	//Test will execute as per alphabetical order.
	//If there is no verification point the test case is always passed.There must be always the verification point.Becuase the build is not working but my testvcaes is geeting passed so we should always add verifcation point.
//Lowest priority will execute first.This order will called as chronological order.I am defining the flow.
//Priority is an attribute.
//Description is an attribute.
//Also i can enable or disable the test cases.
	//enabled=false which disabled the test case.
	//TimeOut=5000 the timeout is like a threshold to identify the execution time  of the test case.
	@Test(priority=2,description="verify a1",enabled=false)
	public void a1()
	{
		System.out.println("in a1");
	}
	
	@Test(priority=1,description="verify title of the page",timeOut=5000)//if the test case is execute within 5s the test case is passed.if taking more than 5s the test case is failed.
	public void verifyTitle()
	{
	System.setProperty("WebDriver.geckodriver", "geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.google.com");
	String actual=driver.getTitle();
	String expected="Google";
	//Now i will compare expected against actual using Assert.Assert is a class in testng library.assert equals(actual,expected)
	
	Assert.assertEquals(actual,expected);
	//Whenever developers write unit test cases called junit.Most advanced concept is called testng than junit.
		
	}
	
}	
	

