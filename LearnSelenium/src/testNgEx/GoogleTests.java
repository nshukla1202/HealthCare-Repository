package testNgEx;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTests {
	//Whenver there is 2 -3 program in text Ng it will always Execute in Alphabetical Order.
	//Testcases will execute as per alphabetical order.IF there is no verifaction point for testcase the test case will always pass.

	
	// In TextNg there are attributes like selenium locators are called Attributes.In TestNg Attribute priority called Attribute.
	
	//Lowest Priority will execute first.It is also useful to define the chronological order of execution of test cases.
	//timeout-5000;
	@Test(priority=2,description="Verify a1",enabled=false)
	public void a1()
	{
	System.out.println("in a1");	
		
	}
	
	@Test(priority=1,description="Verify title of the page")
	public void VerifyTilte() {
		
//In Test Ng we see one method as 1 test cases.
		
	//In testNg there is no concept of main method.	
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String actual=driver.getTitle();
		String expected="Google";
		
		Assert.assertEquals(actual, expected);
	
	}
}


