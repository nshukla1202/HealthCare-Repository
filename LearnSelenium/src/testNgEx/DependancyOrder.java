package testNgEx;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependancyOrder {
	
//As per Alphabetical order which method will execute first.Login Logout and  Search
@Test	
public void login()
{
	
}
@Test(dependsOnMethods={"login"})
public void Search()
{
	
	Assert.assertEquals("a","b");
	
}
@Test(dependsOnMethods={"Search"},alwaysRun=true)
public void Logout()
{
	// Whenever a dependancy method is falied.Then this method will be skipped.Search is failed then logout is failed.HardDepency.
}
//Sppose i want logout should be passed ireespective of depency method pass or fail , will say alwaysRun='True'.Soft Dependancy.

}
